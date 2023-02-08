package huck.clamorcuisine.registry;

import huck.clamorcuisine.ClamorCuisine;
import huck.clamorcuisine.items.BowlContainerFood;
import huck.clamorcuisine.items.DrinkableFood;
import huck.clamorcuisine.items.SillyStrawItem;
import huck.clamorcuisine.shared.ClamorItemGroup;
import huck.clamorcuisine.shared.FoodItemSettings;
import huck.clamorcuisine.shared.FoodValues;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VampireItems {

	public static final Item SILLY_STRAW = new SillyStrawItem(new FabricItemSettings().maxCount(1).group(ClamorItemGroup.CLAMOR_CUISINE));

	public static final Item BLOOD_BAG = new DrinkableFood(new FoodItemSettings(FoodValues.BLOOD_BAG, true));
	public static final Item BLACK_PUDDING = new Item(new FoodItemSettings(FoodValues.LIGHT_MEAL, true));
	public static final Item BLOOD_CUSTARD_PIE = new Item(new FoodItemSettings(FoodValues.LIGHT_MEAL, true));
	public static final Item BLOOD_STEW = new BowlContainerFood(new FoodItemSettings(FoodValues.MEAL, true));
	public static final Item BERRY_CORDIAL = new Item(new FoodItemSettings(FoodValues.SNACK, true, true));

	public static void initializeItems() {
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "silly_straw"), SILLY_STRAW);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "blood_bag"), BLOOD_BAG);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "black_pudding"), BLACK_PUDDING);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "blood_custard_pie"), BLOOD_CUSTARD_PIE);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "blood_stew"), BLOOD_STEW);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "berry_cordial"), BERRY_CORDIAL);
	}
}
