package huck.clamorcuisine.registry;

import huck.clamorcuisine.ClamorCuisine;
import huck.clamorcuisine.items.BottleContainerFood;
import huck.clamorcuisine.items.BowlContainerFood;
import huck.clamorcuisine.items.StickContainerFood;
import huck.clamorcuisine.shared.FoodItemSettings;
import huck.clamorcuisine.shared.FoodValues;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class HerbivoreFood {
	// Ingredience
	public static final Item GREEN_HERB = new Item(new FoodItemSettings(FoodValues.JUNK_FOOD, false, true));
	public static final Item PURPLE_HERB = new Item(new FoodItemSettings(FoodValues.JUNK_FOOD, false, true));

	// General
	public static final Item BEETROOT_QUICHE = new Item(new FoodItemSettings(FoodValues.LIGHT_MEAL));
	public static final Item APPLE_FRITTER = new Item(new FoodItemSettings(FoodValues.LIGHT_MEAL));
	public static final Item SWEET_BERRY_PIE = new Item(new FoodItemSettings(FoodValues.MEAL));
	public static final Item SNOWCONE = new Item(new FoodItemSettings(FoodValues.SNACK, false, true));
	public static final Item VEGETABLE_SKEWER = new StickContainerFood(new FoodItemSettings(FoodValues.LIGHT_MEAL));
	public static final Item NETHER_SKEWER = new StickContainerFood(new FoodItemSettings(FoodValues.LIGHT_MEAL));

	// Cupcakes
	public static final Item CUPCAKE = new Item(new FoodItemSettings(FoodValues.SNACK));
	public static final Item CARROT_CUPCAKE = new Item(new FoodItemSettings(FoodValues.SNACK));
	public static final Item CHOCOLATE_CUPCAKE = new Item(new FoodItemSettings(FoodValues.SNACK));
	public static final Item TOFFEE_CUPCAKE = new Item(new FoodItemSettings(FoodValues.SNACK));
	public static final Item SWEET_BERRY_CUPCAKE = new Item(new FoodItemSettings(FoodValues.SNACK));

	// Bowl foods
	public static final Item EGG_SALAD = new BowlContainerFood(new FoodItemSettings(FoodValues.LIGHT_MEAL));

	// Drinks
	public static final Item SWEET_BERRY_SYRUP = new BottleContainerFood(new FoodItemSettings(FoodValues.SMALL_SNACK));

	public static void initializeItems() {
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "green_herb"), GREEN_HERB);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "purple_herb"), PURPLE_HERB);

		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "beetroot_quiche"), BEETROOT_QUICHE);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "apple_fritter"), APPLE_FRITTER);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "sweet_berry_pie"), SWEET_BERRY_PIE);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "snowcone"), SNOWCONE);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "vegetable_skewer"), VEGETABLE_SKEWER);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "nether_fungus_skewer"), NETHER_SKEWER);

		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "cupcake"), CUPCAKE);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "carrot_cupcake"), CARROT_CUPCAKE);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "chocolate_cupcake"), CHOCOLATE_CUPCAKE);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "toffee_cupcake"), TOFFEE_CUPCAKE);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "sweet_berry_cupcake"), SWEET_BERRY_CUPCAKE);

		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "egg_salad"), EGG_SALAD);

		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "sweet_berry_syrup"), SWEET_BERRY_SYRUP);
	}
}
