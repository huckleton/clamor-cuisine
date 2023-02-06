package huck.clamorcuisine.effect;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import huck.clamorcuisine.ClamorCuisine;
import huck.clamorcuisine.registry.ClamorStatusEffects;
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
		// level "Downgrades" over time
		if (timeLeft < DURATION_PER_LEVEL * amplifier) {
			entity.removeStatusEffect(ClamorStatusEffects.BLOOD_LOSS);
			entity.addStatusEffect(new StatusEffectInstance(ClamorStatusEffects.BLOOD_LOSS, timeLeft, amplifier - 1));
		}
  }

	@Override
	public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
		ClamorCuisine.LOGGER.info(String.valueOf(entity.getMaxHealth()));
		float capHealth = -4.0f * (amplifier + 1);
		EntityAttributeModifier healthModifier = new EntityAttributeModifier("blood_loss", capHealth, EntityAttributeModifier.Operation.ADDITION);

		modifiers = ArrayListMultimap.create();
		modifiers.put(EntityAttributes.GENERIC_MAX_HEALTH, healthModifier);
		attributes.addTemporaryModifiers(modifiers);
	}

	@Override
	public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
		if (modifiers != null) {
			attributes.removeModifiers(modifiers);
		}
	}

}