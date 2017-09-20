package com.kreezcraft.diamondglass.blocks;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.kreezcraft.diamondglass.DiamondGlass;
import com.kreezcraft.diamondglass.client.IHasModel;
import com.kreezcraft.diamondglass.items.ItemSlab;
import com.kreezcraft.diamondglass.items.InitItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModSlab extends Block implements IHasModel {

	public static final PropertyEnum<SlabVariant> VARIANT = PropertyEnum.<SlabVariant>create("half", SlabVariant.class);

	/**
	 * @param name
	 *            - The registry name.
	 * @param block
	 *            - Has no use, but don't be making slabs for nonexistent
	 *            blocks.
	 */
	public ModSlab(String name, Block block) {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(3f);
		setResistance(5f);
		setCreativeTab(DiamondGlass.creativeTab);
		setRegistryName(name);
		setUnlocalizedName(DiamondGlass.MODID + "." + name);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, SlabVariant.LOWER));
		InitBlocks.BLOCKS.add(this);
		InitItems.ITEMS.add(new ItemSlab(this));
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return (state.getValue(VARIANT) == SlabVariant.DOUBLE);
	}

	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		return 1;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return state.getValue(VARIANT).getAABB();
	}

	@Override
	@Nullable
	public AxisAlignedBB getCollisionBoundingBox(IBlockState state, IBlockAccess world, BlockPos pos) {
		return state.getBoundingBox(world, pos);
	}

	@Override
	public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		List<ItemStack> ret = new java.util.ArrayList<ItemStack>();
		ret.add(new ItemStack(this, state.getValue(VARIANT) == SlabVariant.DOUBLE ? 2 : 1));
		return ret;
	}

	@Override
	protected boolean canSilkHarvest() {
		return true;
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		SlabVariant variant = SlabVariant.LOWER;
		if (meta == 1)
			variant = SlabVariant.UPPER;
		else if (meta == 2)
			variant = SlabVariant.DOUBLE;
		return this.getDefaultState().withProperty(VARIANT, variant);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(VARIANT).getMeta();
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { VARIANT });
	}

	@Override
	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
		return false;
	}

	public IBlockState getUpper() {
		return this.getDefaultState().withProperty(VARIANT, SlabVariant.UPPER);
	}

	public IBlockState getLower() {
		return this.getDefaultState();
	}

	public IBlockState getDouble() {
		return this.getDefaultState().withProperty(VARIANT, SlabVariant.DOUBLE);
	}

	public IBlockState getOpposite(IBlockState state) {
		if (state == getUpper())
			return getLower();
		return getUpper();
	}

	public static enum SlabVariant implements IStringSerializable {
		LOWER("lower", new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), 0),
		UPPER("upper", new AxisAlignedBB(0.0D, 0.5D, 0.0D, 1.0D, 1.0D, 1.0D), 1),
		DOUBLE("double", FULL_BLOCK_AABB, 2);

		private String name;
		private AxisAlignedBB aabb;
		private int meta;

		private SlabVariant(String name_, AxisAlignedBB AABB_, int meta_) {
			name = name_;
			aabb = AABB_;
			meta = meta_;
		}

		@Override
		public String getName() {
			return name;
		}

		public AxisAlignedBB getAABB() {
			return aabb;
		}

		public int getMeta() {
			return meta;
		}
	}

	@Override
	public void registerModels() {
		DiamondGlass.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "half=lower");

	}

}