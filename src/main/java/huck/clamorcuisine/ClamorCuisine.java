package huck.clamorcuisine;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import huck.clamorcuisine.registry.AnyDietFood;
import huck.clamorcuisine.registry.CarnivoreFood;
import huck.clamorcuisine.registry.HerbivoreFood;
import huck.clamorcuisine.registry.PlaceableFood;
import huck.clamorcuisine.registry.ClamorStatusEffects;
import huck.clamorcuisine.registry.VampireItems;

public class ClamorCuisine implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("clamorcuisine");
	public static final String MOD_ID = "clamorcuisine";

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ClamorStatusEffects.initializeEffects();
		PlaceableFood.initializeItems();
		HerbivoreFood.initializeItems();
		CarnivoreFood.initializeItems();
		AnyDietFood.initializeItems();
		VampireItems.initializeItems();
	}
}