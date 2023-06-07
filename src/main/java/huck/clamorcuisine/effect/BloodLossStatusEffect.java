package huck.clamorcuisine.effect;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import huck.clamorcuisine.registry.ClamorStatusEffects;
import huck.clamorcuisine.shared.BleedDamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;

public class BloodLossStatusEffect extends StatusEffect {

	public static final int DURATION_PER_LEVEL = 45 * 20;
	Multimap<EntityAttribute, EntityAttributeModifier> modifiers;

	public BloodLossStatusEffect() {
		super(StatusEffectCategory.HARMFUL, 0x493334);
	}

  @Override
  public boolean canApplyUpdateEffect(int duration, int amplifier) {
    return true;
  }
 
  @Override
  public void applyUpdateEffect(LivingEntity entity, int amplifier) {
		entity.setHealth(entity.getHealth());
		StatusEffectInstance bloodLoss = entity.getStatusEffect(ClamorStatusEffects.BLOOD_LOSS);
		int timeLeft = bloodLoss.getDuration();
		// level "downgrades" over time
		if (timeLeft < DURATION_PER_LEVEL * amplifier) {
			entity.removeStatusEffect(ClamorStatusEffects.BLOOD_LOSS);
			entity.addStatusEffect(new StatusEffectInstance(ClamorStatusEffects.BLOOD_LOSS, timeLeft, amplifier - 1));
		}
  }

	@Override
	public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
		float capHealth = -4.0f * (amplifier + 1);
		EntityAttributeModifier healthModifier = new EntityAttributeModifier("blood_loss", capHealth, EntityAttributeModifier.Operation.ADDITION);

		modifiers = ArrayListMultimap.create();
		modifiers.put(EntityAttributes.GENERIC_MAX_HEALTH, healthModifier);
		attributes.addTemporaryModifiers(modifiers);

		if (attributes.getValue(EntityAttributes.GENERIC_MAX_HEALTH) < 1.5f) {
			entity.damage(BleedDamageSource.BLEED_DAMAGE, 5.0f);
		}
	}

	@Override
	public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
		if (modifiers != null) {
			attributes.removeModifiers(modifiers);
		}
	}

}