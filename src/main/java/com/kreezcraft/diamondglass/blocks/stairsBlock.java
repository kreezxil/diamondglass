package com.kreezcraft.diamondglass.blocks;

import com.kreezcraft.diamondglass.setup.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.gen.feature.structure.MineshaftPieces;

import javax.annotation.Nullable;

public class stairsBlock extends StairsBlock {

    public stairsBlock(String name, Material material, MaterialColor color) {
        super(new Block(Properties.create(Material.ROCK)).getDefaultState(), Properties.create(material, color).sound(SoundType.GLASS).hardnessAndResistance(10f).lightValue(0));
        setRegistryName(name);
        ModBlocks.BLOCKS.add(this);
    }

    @Override
    public float getExplosionResistance(BlockState state, IWorldReader world, BlockPos pos, @Nullable Entity exploder, Explosion explosion) {
        return Blocks.BEDROCK.getExplosionResistance();
    }

}
