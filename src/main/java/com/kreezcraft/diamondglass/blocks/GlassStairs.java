package com.kreezcraft.diamondglass.blocks;

import com.kreezcraft.diamondglass.DiamondConfig;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class GlassStairs extends ModStairs {

	public GlassStairs(String name, Block block) {
		super(name, block);
		setLightOpacity(0);
		setHardness(DiamondConfig.diamondLevel.diamondHardness);
		setResistance(DiamondConfig.diamondLevel.diamondResitance);
}

	@Override
	public boolean isNormalCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
		return false;
	}
	
	@Override
	public boolean canEntityDestroy(IBlockState state, IBlockAccess world, BlockPos pos, Entity entity) {
		return DiamondConfig.diamondLevel.isInvulnerable ? false : super.canEntityDestroy(state, world, pos, entity);
	}

}
