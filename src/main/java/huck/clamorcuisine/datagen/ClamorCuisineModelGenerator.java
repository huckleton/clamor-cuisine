
package huck.clamorcuisine.datagen;

import huck.clamorcuisine.registry.AnyDietFood;
import huck.clamorcuisine.registry.CarnivoreFood;
import huck.clamorcuisine.registry.HerbivoreFood;
// import huck.clamorcuisine.registry.PlaceableFood;
import huck.clamorcuisine.registry.VampireItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ClamorCuisineModelGenerator extends FabricModelProvider  {
	ClamorCuisineModelGenerator(FabricDataGenerator generator) {
		super(generator);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		// blockStateModelGenerator.registerSimpleCubeAll(PlaceableFood.CHEESECAKE);
		// blockStateModelGenerator.registerSimpleCubeAll(PlaceableFood.CHOCOLATE_CAKE);
	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		// itemModelGenerator.register(AnyDietFood.CHEESE, Models.GENERATED);
		// itemModelGenerator.register(AnyDietFood.FRENCH_TOAST, Models.GENERATED);
		// itemModelGenerator.register(AnyDietFood.STUFFED_MUSHROOM, Models.GENERATED);
		// itemModelGenerator.register(AnyDietFood.DEVILED_EGG, Models.GENERATED);
		// itemModelGenerator.register(AnyDietFood.DONUT, Models.GENERATED);
		// itemModelGenerator.register(AnyDietFood.MUSHROOM_OMELET, Models.GENERATED);

		// itemModelGenerator.register(PlaceableFood.CHEESECAKE_I, Models.GENERATED);
		// itemModelGenerator.register(PlaceableFood.CHOCOLATE_CAKE_I, Models.GENERATED);

		// itemModelGenerator.register(HerbivoreFood.GREEN_HERB, Models.GENERATED);
		// itemModelGenerator.register(HerbivoreFood.PURPLE_HERB, Models.GENERATED);
		// itemModelGenerator.register(HerbivoreFood.BEETROOT_QUICHE, Models.GENERATED);
		// itemModelGenerator.register(HerbivoreFood.APPLE_FRITTER, Models.GENERATED);
		// itemModelGenerator.register(HerbivoreFood.SWEET_BERRY_PIE, Models.GENERATED);
		// itemModelGenerator.register(HerbivoreFood.SNOWCONE, Models.GENERATED);
		// itemModelGenerator.register(HerbivoreFood.EGG_SALAD, Models.GENERATED);
		// itemModelGenerator.register(HerbivoreFood.SWEET_BERRY_SYRUP, Models.GENERATED);

		// itemModelGenerator.register(CarnivoreFood.BACON_AND_EGG, Models.GENERATED);
		// itemModelGenerator.register(CarnivoreFood.POTATO_KEBAB, Models.GENERATED);
		// itemModelGenerator.register(CarnivoreFood.STUFFED_PUMPKIN, Models.GENERATED);
		// itemModelGenerator.register(CarnivoreFood.FISH_FILET, Models.GENERATED);
		// itemModelGenerator.register(CarnivoreFood.LUNCHABLES, Models.GENERATED);
		// itemModelGenerator.register(CarnivoreFood.SHEPHERDS_PIE, Models.GENERATED);
		// itemModelGenerator.register(CarnivoreFood.STEAK_SANDWICH, Models.GENERATED);
		// itemModelGenerator.register(CarnivoreFood.PORK_SANDWICH, Models.GENERATED);
		// itemModelGenerator.register(CarnivoreFood.MUTTON_SANDWICH, Models.GENERATED);
		// itemModelGenerator.register(CarnivoreFood.CHICKEN_SANDWICH, Models.GENERATED);
		// itemModelGenerator.register(CarnivoreFood.RABBIT_SANDWICH, Models.GENERATED);
		// itemModelGenerator.register(CarnivoreFood.FISH_SANDWICH, Models.GENERATED);

		// itemModelGenerator.register(VampireItems.SILLY_STRAW, Models.HANDHELD_ROD);
		// itemModelGenerator.register(VampireItems.BLOOD_BAG, Models.GENERATED);

		itemModelGenerator.register(VampireItems.BLACK_PUDDING, Models.GENERATED);
		itemModelGenerator.register(VampireItems.BLOOD_CUSTARD_PIE, Models.GENERATED);
		itemModelGenerator.register(VampireItems.BLOOD_STEW, Models.GENERATED);
		itemModelGenerator.register(HerbivoreFood.VEGETABLE_SKEWER, Models.GENERATED);
		itemModelGenerator.register(HerbivoreFood.NETHER_SKEWER, Models.GENERATED);
		itemModelGenerator.register(CarnivoreFood.SEAFOOD_SOUP, Models.GENERATED);
		itemModelGenerator.register(AnyDietFood.CHOCOLATE_DONUT, Models.GENERATED);
		itemModelGenerator.register(AnyDietFood.GLAZED_DONUT, Models.GENERATED);
		itemModelGenerator.register(AnyDietFood.SWEET_BERRY_DONUT, Models.GENERATED);
		itemModelGenerator.register(AnyDietFood.SQUID_INK_PASTA, Models.GENERATED);
		itemModelGenerator.register(AnyDietFood.WARPED_LASAGNE, Models.GENERATED);
	}
}
