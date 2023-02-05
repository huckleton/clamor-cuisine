package huck.clamorcuisine.shared;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;

public class FoodItemSettings extends FabricItemSettings {
	public FoodItemSettings(FoodValues foodValues, boolean meat, boolean snack) {
		super();
		this.food(FoodValues.generateComponent(foodValues, meat, snack));
		this.group(ItemGroup.FOOD);
	}

	public FoodItemSettings(FoodValues foodValues) {
		this(foodValues, false, false);
	}

	public FoodItemSettings(FoodValues foodValues, boolean meat) {
		this(foodValues, true, false);
	}
}
