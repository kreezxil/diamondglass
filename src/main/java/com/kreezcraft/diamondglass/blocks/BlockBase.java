package com.kreezcraft.diamondglass.blocks;

import javax.annotation.Nullable;

import com.kreezcraft.diamondglass.DiamondGlass;
import com.kreezcraft.diamondglass.client.IHasModel;
import com.kreezcraft.diamondglass.init.InitBlocks;
import com.kreezcraft.diamondglass.init.InitItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

	protected String name;

	public BlockBase(Material material, String name) {
		super(material);
		this.name = name;
		setUnlocalizedName(DiamondGlass.MODID + "." + name);
		setCreativeTab(DiamondGlass.creativeTab);
		setRegistryName(name);
		InitBlocks.BLOCKS.add(this);
		InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
	}

	@Override
	public void registerModels() {
		DiamondGlass.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
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