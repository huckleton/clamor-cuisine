package huck.clamorcuisine.registry;

import huck.clamorcuisine.ClamorCuisine;
import huck.clamorcuisine.effect.BloodLossStatusEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ClamorStatusEffects {
	public static final StatusEffect BLOOD_LOSS = new BloodLossStatusEffect();

	public static void initializeEffects() {
		Registry.register(Registry.STATUS_EFFECT, new Identifier(ClamorCuisine.MOD_ID, "blood_loss"), BLOOD_LOSS);
	}
}
