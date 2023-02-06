package huck.clamorcuisine.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class BloodLossStatusEffect extends StatusEffect {

	private EntityAttributeModifier healthModifier;

	public BloodLossStatusEffect() {
		super(StatusEffectCategory.HARMFUL, 0x493334);
	}

	@Override
	public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
		float capHealth = -4.0f * (amplifier + 1);
		EntityAttributeInstance maxHealthInstance = entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH);
		this.healthModifier = new EntityAttributeModifier("blood_loss", capHealth, EntityAttributeModifier.Operation.ADDITION);
		maxHealthInstance.addPersistentModifier(healthModifier);
		entity.setHealth(entity.getHealth());
	}

	@Override
	public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
		EntityAttributeInstance attributeInstance = entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH);
		if (this.healthModifier != null) {
			attributeInstance.removeModifier(this.healthModifier);
			entity.setHealth(entity.getHealth());
		}
	}

}