package huck.clamorcuisine.shared;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class FoodItemSettings extends FabricItemSettings {
	public FoodItemSettings(FoodValues foodValues, boolean meat, boolean snack) {
		super();
		this.food(FoodValues.generateComponent(foodValues, meat, snack));
		this.group(ClamorItemGroup.CLAMOR_CUISINE);
	}

	public FoodItemSettings(FoodValues foodValues) {
		this(foodValues, false, false);
	}

	public FoodItemSettings(FoodValues foodValues, boolean meat) {
		this(foodValues, true, false);
	}
}
