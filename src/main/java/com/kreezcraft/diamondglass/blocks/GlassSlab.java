package com.kreezcraft.diamondglass.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GlassSlab extends ModSlab {

	public GlassSlab(String name, Block block) {
		super(name, block);
		setLightOpacity(0);
		useNeighborBrightness = true;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return state.getValue(VARIANT) == SlabVariant.DOUBLE;
	}

	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public boolean shouldSideBeRendered(IBlockState state, IBlockAccess blockAccess, BlockPos pos, EnumFacing facing) {
		IBlockState state2 = blockAccess.getBlockState(pos.offset(facing));
		if (!facing.getAxis().isVertical())
			return !(state2.getBlock() == this && (state2 == state || getDouble() == state2));
		else if (facing == EnumFacing.DOWN && state2 == getDouble())
			return !(state == getLower() || state == state2);
		else if (facing == EnumFacing.UP && state2 == getDouble())
			return !(state.getBlock() == this);
		else if (facing == EnumFacing.UP && state == getDouble())
			return !(state2 == getLower());
		return !(state2.getBlock() == this && state2 == getOpposite(state));
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

}
