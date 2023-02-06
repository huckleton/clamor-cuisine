package huck.clamorcuisine.registry;

import huck.clamorcuisine.ClamorCuisine;
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

	public static void initializeItems() {
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "silly_straw"), SILLY_STRAW);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "blood_bag"), BLOOD_BAG);
	}
}
