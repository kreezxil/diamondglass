package com.kreezcraft.diamondglass.blocks;

import com.kreezcraft.diamondglass.setup.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IWorldReader;

import javax.annotation.Nullable;

public class slabBlock extends SlabBlock {
    public slabBlock(String name, Material material, MaterialColor color) {
        super(Properties.create(material, color).sound(SoundType.GLASS).hardnessAndResistance(10f).lightValue(0));
        setRegistryName(name);
        ModBlocks.BLOCKS.add(this);
    }

    @Override
    public float getExplosionResistance(BlockState state, IWorldReader world, BlockPos pos, @Nullable Entity exploder, Explosion explosion) {
        return Blocks.BEDROCK.getExplosionResistance();
    }
}
