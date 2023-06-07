package huck.clamorcuisine.registry;

import huck.clamorcuisine.ClamorCuisine;
import huck.clamorcuisine.items.BowlContainerFood;
import huck.clamorcuisine.items.StickContainerFood;
import huck.clamorcuisine.shared.FoodItemSettings;
import huck.clamorcuisine.shared.FoodValues;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CarnivoreFood {

	// General
	public static final Item BACON_AND_EGG = new Item(new FoodItemSettings(FoodValues.LIGHT_MEAL, true));
	public static final Item POTATO_KEBAB = new StickContainerFood(new FoodItemSettings(FoodValues.LIGHT_MEAL, true));
	public static final Item STUFFED_PUMPKIN = new Item(new FoodItemSettings(FoodValues.LARGE_MEAL, true));
	public static final Item FISH_FILET = new Item(new FoodItemSettings(FoodValues.MEAL, true));
	public static final Item LUNCHABLES = new Item(new FoodItemSettings(FoodValues.SNACK, true));

	// Bowl foods
	public static final Item SHEPHERDS_PIE = new BowlContainerFood(new FoodItemSettings(FoodValues.MEAL, true));
	public static final Item SEAFOOD_SOUP = new BowlContainerFood(new FoodItemSettings(FoodValues.MEAL));

	// Sandwiches
	public static final Item STEAK_SANDWICH = new Item(new FoodItemSettings(FoodValues.MEAL, true));
	public static final Item PORK_SANDWICH = new Item(new FoodItemSettings(FoodValues.MEAL, true));
	public static final Item MUTTON_SANDWICH = new Item(new FoodItemSettings(FoodValues.MEAL, true));
	public static final Item CHICKEN_SANDWICH = new Item(new FoodItemSettings(FoodValues.MEAL, true));
	public static final Item RABBIT_SANDWICH = new Item(new FoodItemSettings(FoodValues.MEAL, true));
	public static final Item FISH_SANDWICH = new Item(new FoodItemSettings(FoodValues.MEAL, true));
	
	public static void initializeItems() {
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "bacon_and_egg"), BACON_AND_EGG);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "potato_kebab"), POTATO_KEBAB);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "stuffed_pumpkin"), STUFFED_PUMPKIN);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "fish_filet"), FISH_FILET);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "lunchables"), LUNCHABLES);
		
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "shepherds_pie"), SHEPHERDS_PIE);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "seafood_soup"), SEAFOOD_SOUP);

		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "steak_sandwich"), STEAK_SANDWICH);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "pork_sandwich"), PORK_SANDWICH);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "mutton_sandwich"), MUTTON_SANDWICH);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "chicken_sandwich"), CHICKEN_SANDWICH);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "rabbit_sandwich"), RABBIT_SANDWICH);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "fish_sandwich"), FISH_SANDWICH);
	}
}
