package com.kreezcraft.diamondglass.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import com.kreezcraft.diamondglass.DiamondConfig;
import com.kreezcraft.diamondglass.DiamondGlass;
import com.kreezcraft.diamondglass.blocks.ModSlab.SlabVariant;
import com.kreezcraft.diamondglass.client.IHasModel;
import com.kreezcraft.diamondglass.init.InitBlocks;
import com.kreezcraft.diamondglass.init.InitItems;
import com.kreezcraft.diamondglass.items.ItemSlab;

import net.minecraft.block.BlockGlass;
import net.minecraft.block.SoundType;
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

public class GlassBlock extends BlockGlass implements IHasModel {

	public GlassBlock(String name) {
		super(Material.GLASS, true);
		setLightOpacity(0);
		setHardness(DiamondConfig.diamondLevel.diamondHardness);
		setResistance(DiamondConfig.diamondLevel.diamondResitance);
		setSoundType(SoundType.GLASS);
		setCreativeTab(DiamondGlass.creativeTab);
		setRegistryName(name);
		setUnlocalizedName(DiamondGlass.MODID + "." + name);
		InitBlocks.BLOCKS.add(this);
		InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));setHarvestLevel("pickaxe",1);
	}

	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean shouldSideBeRendered(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
		return !(world.getBlockState(pos.offset(side)).getBlock() == this);
	}

	@Override
	public int quantityDropped(Random random) {
		return 1;
	}

	@Override
	public void registerModels() {
		DiamondGlass.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

	@Override
	public boolean canEntityDestroy(IBlockState state, IBlockAccess world, BlockPos pos, Entity entity) {
		return DiamondConfig.diamondLevel.isInvulnerable ? false : super.canEntityDestroy(state, world, pos, entity);
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