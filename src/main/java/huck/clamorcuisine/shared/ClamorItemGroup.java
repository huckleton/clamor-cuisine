package huck.clamorcuisine.shared;

import huck.clamorcuisine.ClamorCuisine;
import huck.clamorcuisine.registry.PlaceableFood;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ClamorItemGroup {
	public static final ItemGroup CLAMOR_CUISINE = FabricItemGroupBuilder.build(
		new Identifier(ClamorCuisine.MOD_ID, "food"), () -> new ItemStack(PlaceableFood.CHEESECAKE_I));
}
