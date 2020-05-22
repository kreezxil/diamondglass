package com.kreezcraft.diamondglass;

import java.util.ArrayList;
import java.util.List;

import com.kreezcraft.diamondglass.block.BasicBlock;
import com.kreezcraft.diamondglass.block.BasicSlab;
import com.kreezcraft.diamondglass.block.BasicStair;
import com.kreezcraft.diamondglass.block.DiamondGlassBlock;
import com.kreezcraft.diamondglass.block.DiamondGlassPane;
import com.kreezcraft.diamondglass.block.DiamondGlassSlab;
import com.kreezcraft.diamondglass.block.DiamondGlassStair;
import com.kreezcraft.diamondglass.block.RainbowPane;
import com.kreezcraft.diamondglass.block.RainbowSlab;
import com.kreezcraft.diamondglass.block.RainbowStair;

import net.minecraft.block.Block;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.DyeColor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(DiamondGlass.ModId)
public class Blocks {
	
	public static final float glassHardness = 6F;
	
	public static List<Block> glass = new ArrayList<Block>();
	public static List<Block> pane = new ArrayList<Block>();
	public static List<Block> stair = new ArrayList<Block>();
	public static List<Block> slab = new ArrayList<Block>();
	
	public static Block diamondSand = new BasicBlock("diamondsand", .5F, 1200F);
	
	public static Block diamondSandstone = new BasicBlock("diamondsandstone", .8F);
	public static Block diamondSandstoneSmooth = new BasicBlock("diamondsandstonesmooth", .8F);
	public static Block diamondSandstoneChiseled = new BasicBlock("diamondsandstonechiseled", .8F);
	
	public static Block diamondSandstoneSlab = new BasicSlab(diamondSandstone,"diamondsandstone");
	public static Block diamondSandstoneSmoothSlab = new BasicSlab(diamondSandstoneSmooth,"diamondsandstonesmooth");
	public static Block diamondSandstoneChiseledSlab = new BasicSlab(diamondSandstoneChiseled,"diamondsandstonechiseled");
	
	public static Block diamondSandstoneStair = new BasicStair(diamondSandstone,"diamondsandstone");
	public static Block diamondSandstoneSmoothStair = new BasicStair(diamondSandstoneSmooth,"diamondsandstonesmooth");
	public static Block diamondSandstoneChiseledStair = new BasicStair(diamondSandstoneChiseled,"diamondsandstonechiseled");
	
	public static Block rainbowGlass = new GlassBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(glassHardness, 1200F).notSolid().sound(SoundType.GLASS));
	public static Block rainbowPane = new RainbowPane();
	public static Block rainbowGlassSlab = new RainbowSlab();
	public static Block rainbowGlassStair = new RainbowStair();
	
	public static void register() {
		for(DyeColor color : DyeColor.values()) {
			DiamondGlass.LOGGER.debug("Creating Blocks for " + color.toString());
			glass.add(new DiamondGlassBlock(color));
			pane.add(new DiamondGlassPane(color));
			stair.add(new DiamondGlassStair(glass.get(color.ordinal()), color));
			slab.add(new DiamondGlassSlab(color));
		}
		
		DiamondGlass.Registry.registerBlocks(glass);
		DiamondGlass.Registry.registerBlocks(pane);
		DiamondGlass.Registry.registerBlocks(stair);
		DiamondGlass.Registry.registerBlocks(slab);
		DiamondGlass.Registry.register(diamondSand);
		
		DiamondGlass.Registry.register(diamondSandstone);
		DiamondGlass.Registry.register(diamondSandstoneSmooth);
		DiamondGlass.Registry.register(diamondSandstoneChiseled);
		
		DiamondGlass.Registry.register(diamondSandstoneStair);
		DiamondGlass.Registry.register(diamondSandstoneSmoothStair);
		DiamondGlass.Registry.register(diamondSandstoneChiseledStair);
		
		DiamondGlass.Registry.register(diamondSandstoneSlab);
		DiamondGlass.Registry.register(diamondSandstoneSmoothSlab);
		DiamondGlass.Registry.register(diamondSandstoneChiseledSlab);
		
		rainbowGlass.setRegistryName(new ResourceLocation(DiamondGlass.ModId, "rainbowglass"));
		DiamondGlass.Registry.register(rainbowGlass);
		DiamondGlass.Registry.register(rainbowPane);
		DiamondGlass.Registry.register(rainbowGlassSlab);
		DiamondGlass.Registry.register(rainbowGlassStair);
	}

	public static void setupRenderLayers() {
		glass.forEach(block -> {
			RenderTypeLookup.setRenderLayer(block, (layer) -> layer == RenderType.getTranslucent());
		});
		pane.forEach(block -> {
			RenderTypeLookup.setRenderLayer(block, (layer) -> layer == RenderType.getTranslucent());
		});
		stair.forEach(block -> {
			RenderTypeLookup.setRenderLayer(block, (layer) -> layer == RenderType.getTranslucent());
		});
		slab.forEach(block -> {
			RenderTypeLookup.setRenderLayer(block, (layer) -> layer == RenderType.getTranslucent());
		});
		
		RenderTypeLookup.setRenderLayer(rainbowGlass, (layer) -> layer == RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(rainbowPane, (layer) -> layer == RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(rainbowGlassStair, (layer) -> layer == RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(rainbowGlassSlab, (layer) -> layer == RenderType.getTranslucent());
	}
}
