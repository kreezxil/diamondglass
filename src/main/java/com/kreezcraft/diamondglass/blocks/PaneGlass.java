package com.kreezcraft.diamondglass.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class PaneGlass extends PaneBase {
	
	public PaneGlass(String name) {
		super(Material.GLASS, name);
		setHardness(125f);
		setResistance(6000f);
	}
	
	@Override
	public BlockRenderLayer getBlockLayer(){
		return BlockRenderLayer.TRANSLUCENT;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state){
		return false;
	}

	
	@Override
	public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos,
			EnumFacing side) {
		final BlockPos otherPos = pos.offset(side);
		IBlockState otherBlockState = blockAccess.getBlockState(otherPos);
		if (otherBlockState.getBlock() instanceof BlockGlass) {
			return false;
		}
		return super.shouldSideBeRendered(blockState, blockAccess, pos, side);
	}

	


}
