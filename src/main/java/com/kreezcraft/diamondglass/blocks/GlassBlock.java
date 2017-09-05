package com.kreezcraft.diamondglass.blocks;

import com.kreezcraft.diamondglass.DiamondGlass;
import com.kreezcraft.diamondglass.blocks.ModSlab.SlabVariant;
import com.kreezcraft.diamondglass.client.IHasModel;
import com.kreezcraft.diamondglass.items.ItemSlab;
import com.kreezcraft.diamondglass.items.InitItems;

import net.minecraft.block.BlockGlass;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
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
		setHardness(25f);
		setResistance(6000f);
		setSoundType(SoundType.GLASS);
		setCreativeTab(DiamondGlass.creativeTab);
		setRegistryName(name);
		setUnlocalizedName(DiamondGlass.MODID + "." + name);
		InitBlocks.BLOCKS.add(this);
		InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
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
	public void registerModels() {
		DiamondGlass.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}