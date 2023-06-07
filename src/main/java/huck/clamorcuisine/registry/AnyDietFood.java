package huck.clamorcuisine.registry;

import huck.clamorcuisine.ClamorCuisine;
import huck.clamorcuisine.items.BowlContainerFood;
import huck.clamorcuisine.items.StickContainerFood;
import huck.clamorcuisine.shared.FoodItemSettings;
import huck.clamorcuisine.shared.FoodValues;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AnyDietFood {
	// Ingredience
	public static final Item CHEESE = new Item(new FoodItemSettings(FoodValues.SMALL_SNACK, true));

	// General
	public static final Item FRENCH_TOAST = new Item(new FoodItemSettings(FoodValues.LIGHT_MEAL));
	public static final Item STUFFED_MUSHROOM = new Item(new FoodItemSettings(FoodValues.LIGHT_MEAL));
	public static final Item DEVILED_EGG = new Item(new FoodItemSettings(FoodValues.SNACK, false, true));
	public static final Item MUSHROOM_OMELET = new Item(new FoodItemSettings(FoodValues.LIGHT_MEAL));
	public static final Item WARPED_LASAGNE = new Item(new FoodItemSettings(FoodValues.MEAL));
	public static final Item SQUID_INK_PASTA = new BowlContainerFood(new FoodItemSettings(FoodValues.MEAL));

	// Donuts
	public static final Item DONUT = new Item(new FoodItemSettings(FoodValues.SMALL_SNACK));
	public static final Item CHOCOLATE_DONUT = new Item(new FoodItemSettings(FoodValues.SPECIAL_DONUT));
	public static final Item GLAZED_DONUT = new Item(new FoodItemSettings(FoodValues.SPECIAL_DONUT));
	public static final Item SWEET_BERRY_DONUT = new Item(new FoodItemSettings(FoodValues.SPECIAL_DONUT));

	// Marshmallows
	public static final Item MARSHMALLOW = new Item(new FoodItemSettings(FoodValues.JUNK_FOOD, false, true));
	public static final Item MARSHMALLOW_SKEWER = new StickContainerFood(new FoodItemSettings(FoodValues.JUNK_FOOD, false, true));
	public static final Item ROASTED_MARSHMALLOW_SKEWER = new StickContainerFood(new FoodItemSettings(FoodValues.SNACK, false, true));

	public static void initializeItems() {
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "cheese"), CHEESE);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "french_toast"), FRENCH_TOAST);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "stuffed_mushroom"), STUFFED_MUSHROOM);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "deviled_egg"), DEVILED_EGG);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "mushroom_omelet"), MUSHROOM_OMELET);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "warped_lasagne"), WARPED_LASAGNE);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "squid_ink_pasta"), SQUID_INK_PASTA);

		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "donut"), DONUT);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "chocolate_donut"), CHOCOLATE_DONUT);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "glazed_donut"), GLAZED_DONUT);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "sweet_berry_donut"), SWEET_BERRY_DONUT);

		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "marshmallow"), MARSHMALLOW);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "marshmallow_on_a_stick"), MARSHMALLOW_SKEWER);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "roasted_marshmallow_on_a_stick"), ROASTED_MARSHMALLOW_SKEWER);
	}
}
