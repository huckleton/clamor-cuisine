package huck.clamorcuisine;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.util.Identifier;

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

		LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
			Identifier herbInjector = new Identifier(ClamorCuisine.MOD_ID, "inject/grass");
			if (Blocks.GRASS.getLootTableId().equals(id)
				|| Blocks.FERN.getLootTableId().equals(id)
				|| Blocks.TALL_GRASS.getLootTableId().equals(id)
				|| Blocks.LARGE_FERN.getLootTableId().equals(id) ) {
					LOGGER.info("Hello World!");
					tableBuilder.pool(LootPool.builder().with(LootTableEntry.builder(herbInjector)).build());
				}
		});
	}
}