package com.kreezcraft.diamondglass.blocks;

import com.kreezcraft.diamondglass.DiamondGlass;
import com.kreezcraft.diamondglass.client.IHasModel;
import com.kreezcraft.diamondglass.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


/**
 * Created by alsender on 12/16/16.
 * shameless copied from https://github.com/Alsender/Earthworks/blob/1.11/src/main/java/alsender/earthworks/block/ModSlab.java
 * on July 3, 2017 by me, Kreezxil! Thank you open source!
 */
public class ModSlab extends BlockSlab implements IHasModel {
    public final World world = null;
    public final BlockPos pos = null;

    public ModSlab(String name, Block block) {
        super(block.getDefaultState().getMaterial());
        setHardness(block.getDefaultState().getBlockHardness(world, pos));
		setUnlocalizedName(DiamondGlass.MODID + "." + name);
		setRegistryName(name);
        useNeighborBrightness = true;
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));//needs custom ItemBlock, invalid.
	}

	@Override
	public void registerModels() {
		DiamondGlass.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "half=bottom");
	}

	public ModSlab getSingleSlab() {
        return null;
    }

    public ModSlab getDoubleSlab() {
        return null;
    }

    @Override
    public IProperty getVariantProperty() {
        return HALF;
    }

    @Override
    public String getUnlocalizedName(int meta) {
        return null;
    }

    public Comparable getTypeForItem(ItemStack stack) {
        return 0;
    }

    public boolean isDouble() {
        return false;
    }

    @Override
    public BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, HALF, getVariantProperty());
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        if (this.isDouble()) { return getDefaultState(); }
        else { return getDefaultState().withProperty(HALF, meta == 1 ? EnumBlockHalf.BOTTOM : EnumBlockHalf.TOP); }
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        if (this.isDouble()) { return 0; }
        else { return state.getValue(HALF) == EnumBlockHalf.BOTTOM ? 1 : 0; }
    }

}