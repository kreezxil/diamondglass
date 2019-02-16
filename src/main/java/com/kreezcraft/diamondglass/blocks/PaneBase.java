package com.kreezcraft.diamondglass.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import com.kreezcraft.diamondglass.DiamondConfig;
import com.kreezcraft.diamondglass.DiamondGlass;
import com.kreezcraft.diamondglass.client.IHasModel;
import com.kreezcraft.diamondglass.init.InitBlocks;
import com.kreezcraft.diamondglass.init.InitItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class PaneBase extends BlockPane implements IHasModel {

	protected String name;

	protected PaneBase(Material material, String name) {
		super(material, true);
		this.name = name;
		setUnlocalizedName(DiamondGlass.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(DiamondGlass.creativeTab);
		setHardness(DiamondConfig.nondiamondLevel.standardHardness);
		setResistance(DiamondConfig.nondiamondLevel.standardResistance);
		InitBlocks.BLOCKS.add(this);
		InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));setHarvestLevel("pickaxe",1);
	}

	@Override
	public void registerModels() {
		DiamondGlass.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

	@Override
	public boolean shouldSideBeRendered(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
		IBlockState state2 = world.getBlockState(pos.offset(side));
		return state2.getBlock() == this
				? !(this.getActualState(state2, world, pos) == this.getActualState(state, world, pos))
				: true;
	}

	@Override
	public boolean canEntityDestroy(IBlockState state, IBlockAccess world, BlockPos pos, Entity entity) {
		return DiamondConfig.diamondLevel.isInvulnerable ? false : super.canEntityDestroy(state, world, pos, entity);
	}

	@Override
	public int quantityDropped(Random random) {
		return 1;
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
