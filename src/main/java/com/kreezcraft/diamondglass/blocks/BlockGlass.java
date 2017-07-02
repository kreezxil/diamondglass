package com.kreezcraft.diamondglass.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;

public class BlockGlass extends BlockBase {

	public BlockGlass(String name) {
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

}