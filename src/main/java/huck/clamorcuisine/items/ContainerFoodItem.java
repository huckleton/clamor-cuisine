package huck.clamorcuisine.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ContainerFoodItem extends ClamorCuisineItem {

	private ItemConvertible returnItem;

	public ContainerFoodItem(Settings settings, ItemConvertible item) {
		super(settings);
		this.returnItem = item;
	}

	public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
		super.finishUsing(stack, world, user);
		return getReturnItem(stack, user);
	}

	public ItemStack getReturnItem(ItemStack stack, LivingEntity user) {
		if (stack.isEmpty()) {
			return new ItemStack(this.returnItem);
		} else {
			if (user instanceof PlayerEntity playerEntity && !((PlayerEntity) user).getAbilities().creativeMode) {
				ItemStack itemStack = new ItemStack(this.returnItem);
				if (!playerEntity.getInventory().insertStack(itemStack)) {
					playerEntity.dropItem(itemStack, false);
				}
			}
			return stack;
		}
	}

	@Override
	public ItemStack getRecipeRemainder(ItemStack stack) {
		return new ItemStack(this.returnItem);
	}
}
