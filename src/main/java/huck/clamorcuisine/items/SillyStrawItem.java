package huck.clamorcuisine.items;

import java.util.List;

import huck.clamorcuisine.effect.BloodLossStatusEffect;
import huck.clamorcuisine.registry.ClamorStatusEffects;
import huck.clamorcuisine.registry.VampireItems;
import huck.clamorcuisine.shared.BleedDamageSource;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class SillyStrawItem extends ClamorCuisineItem {

	private final int MAX_USE_TIME = 72000;
	private final int HUNGER_COST = 5;

	public SillyStrawItem(Settings settings) {
		super(settings);
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		user.setCurrentHand(hand);
		return TypedActionResult.pass(user.getStackInHand(hand));
	}

	@Override
	public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
		if (remainingUseTicks > this.MAX_USE_TIME - 20) {
			return;
		}
		if (user instanceof PlayerEntity playerEntity) {
			if (playerEntity.getHungerManager().getFoodLevel() < HUNGER_COST) {
				return;
			}
			if (!playerEntity.isCreative()) {
				StatusEffectInstance bloodLoss = user.getStatusEffect(ClamorStatusEffects.BLOOD_LOSS);
	
				int newBleedLevel = 0;
				int newTime = BloodLossStatusEffect.DURATION_PER_LEVEL;
				if (bloodLoss != null) {
					newBleedLevel = bloodLoss.getAmplifier() + 1;
					newTime += bloodLoss.getDuration();
				}
	
				playerEntity.addStatusEffect(new StatusEffectInstance(ClamorStatusEffects.BLOOD_LOSS, newTime, newBleedLevel));
				playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 3 * 20, 0));
				playerEntity.damage(BleedDamageSource.BLEED_DAMAGE, 0.0f);
				playerEntity.getHungerManager().add(-HUNGER_COST, 0.0f);
			}

			// still gives blood bag in creative
			ItemStack itemStack = new ItemStack(VampireItems.BLOOD_BAG);
			if (!playerEntity.getInventory().insertStack(itemStack)) {
				playerEntity.dropItem(itemStack, false);
			}
		}
	}

	@Override
	public UseAction getUseAction(ItemStack stack) {
		return UseAction.BOW;
	}

	@Override
	public int getMaxUseTime(ItemStack stack) {
		return this.MAX_USE_TIME;
	}

	@Override
	public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
		tooltip.add(Text.literal("so... yummy!!").formatted(Formatting.GRAY));
		// not even sorry
	}
}
