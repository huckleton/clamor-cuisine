package huck.clamorcuisine.shared;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponent.Builder;

public record FoodValues(int hunger, float saturationModifier) {
	
	public static final FoodValues JUNK_FOOD = new FoodValues(1, 0.2f);
	public static final FoodValues SMALL_SNACK = new FoodValues(2, 0.2f);
	public static final FoodValues SNACK = new FoodValues(4, 0.4f);
	public static final FoodValues LIGHT_MEAL = new FoodValues(5, 0.6f);
	public static final FoodValues MEAL = new FoodValues(8, 0.8f);
	public static final FoodValues LARGE_MEAL = new FoodValues(10, 0.6f);
	
	public static final FoodValues BLOOD_BAG = new FoodValues(2, 0.2f);
	public static final FoodValues SPECIAL_DONUT = new FoodValues(6, 0.4f);

	public static FoodComponent generateComponent(FoodValues foodValues, boolean meat, boolean snack) {
		Builder foodComponent = new FoodComponent.Builder();
		foodComponent.hunger(foodValues.hunger);
		foodComponent.saturationModifier(foodValues.saturationModifier);
		if (meat) {
			foodComponent.meat();
		}
		if (snack) {
			foodComponent.snack();
		}
		return foodComponent.build();
	}
}
