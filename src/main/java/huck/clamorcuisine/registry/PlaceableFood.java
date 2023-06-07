package huck.clamorcuisine.registry;

import huck.clamorcuisine.ClamorCuisine;
import huck.clamorcuisine.shared.ClamorItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.CakeBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PlaceableFood {
	private static FabricBlockSettings CakeSettings = FabricBlockSettings.of(Material.CAKE).ticksRandomly().sounds(BlockSoundGroup.WOOL).nonOpaque();
	private static FabricItemSettings CakeItemSettings = new FabricItemSettings().group(ClamorItemGroup.CLAMOR_CUISINE).maxCount(1);

	public static final Block CHEESECAKE = new CakeBlock(CakeSettings);
	public static final Block CHOCOLATE_CAKE = new CakeBlock(CakeSettings);
	public static final Block CARROT_CAKE = new CakeBlock(CakeSettings);

	public static final BlockItem CHEESECAKE_I = new BlockItem(CHEESECAKE, CakeItemSettings);
	public static final BlockItem CHOCOLATE_CAKE_I = new BlockItem(CHOCOLATE_CAKE, CakeItemSettings);
	public static final BlockItem CARROT_CAKE_I = new BlockItem(CARROT_CAKE, CakeItemSettings);
	
	public static void initializeItems() {
    Registry.register(Registry.BLOCK, new Identifier(ClamorCuisine.MOD_ID, "cheesecake"), CHEESECAKE);
    Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "cheesecake"), CHEESECAKE_I);
    Registry.register(Registry.BLOCK, new Identifier(ClamorCuisine.MOD_ID, "chocolate_cake"), CHOCOLATE_CAKE);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "chocolate_cake"), CHOCOLATE_CAKE_I);
    Registry.register(Registry.BLOCK, new Identifier(ClamorCuisine.MOD_ID, "carrot_cake"), CARROT_CAKE);
		Registry.register(Registry.ITEM, new Identifier(ClamorCuisine.MOD_ID, "carrot_cake"), CARROT_CAKE_I);
	}
}
