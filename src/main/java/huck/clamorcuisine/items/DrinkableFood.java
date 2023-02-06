package huck.clamorcuisine.items;

import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class DrinkableFood extends ClamorCuisineItem {
	public DrinkableFood(Settings settings) {
		super(settings);
	}

	public int getMaxUseTime(ItemStack stack) {
		return 40;
	}
	
	public SoundEvent getEatSound() {
			return SoundEvents.ITEM_HONEY_BOTTLE_DRINK;
	}
}
