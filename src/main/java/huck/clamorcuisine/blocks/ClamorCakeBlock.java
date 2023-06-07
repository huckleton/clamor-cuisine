package huck.clamorcuisine.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.CakeBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class ClamorCakeBlock extends CakeBlock {
	public ClamorCakeBlock(Settings settings) {
		super(settings);
	}

	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		ItemStack itemStack = player.getStackInHand(hand);
		if (world.isClient) {
			if (tryEat(world, pos, state, player).isAccepted()) {
				return ActionResult.SUCCESS;
			}
			if (itemStack.isEmpty()) {
				return ActionResult.CONSUME;
			}
		}
		return tryEat(world, pos, state, player);
	}

	private ActionResult tryEat(World world, BlockPos pos, BlockState state, PlayerEntity player) {
		if (!player.canConsume(false)) {
			return ActionResult.PASS;
		} else {
			player.getHungerManager().add(2, 0.1F);
			world.emitGameEvent(player, GameEvent.EAT, pos);

			int i = (Integer) state.get(BITES);
			if (i < 6) {
				world.setBlockState(pos, (BlockState) state.with(BITES, i + 1), 3);
			} else {
				world.removeBlock(pos, false);
				world.emitGameEvent(player, GameEvent.BLOCK_DESTROY, pos);
			}

			player.incrementStat(Stats.EAT_CAKE_SLICE);
			return ActionResult.SUCCESS;
		}
	}
}
