package com.kreezcraft.diamondglass.blocks;

import javax.annotation.Nullable;

import com.kreezcraft.diamondglass.DiamondConfig;
import com.kreezcraft.diamondglass.DiamondGlass;
import com.kreezcraft.diamondglass.client.IHasModel;
import com.kreezcraft.diamondglass.init.InitBlocks;
import com.kreezcraft.diamondglass.init.InitItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class ModStairs extends BlockStairs implements IHasModel {

	protected String name;

	public ModStairs(String name, Block block) {
		super(block.getDefaultState());
		this.name = name;
		setCreativeTab(DiamondGlass.creativeTab);
		setUnlocalizedName(DiamondGlass.MODID + "." + name);
		setRegistryName(name);
		setHardness(DiamondConfig.nondiamondLevel.standardHardness);
		setResistance(DiamondConfig.nondiamondLevel.standardResistance);
		useNeighborBrightness = true;
		InitBlocks.BLOCKS.add(this);
		InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
		setHarvestLevel("pickaxe",1);
	}

	@Override
	public void registerModels() {
		DiamondGlass.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Nullable
	@Override
	public String getHarvestTool(final IBlockState state) {
		return super.getHarvestTool(state);
	}

	@Override
	public boolean isToolEffective(final String type, final IBlockState state) {
		return super.isToolEffective(type, state);
	}
}
