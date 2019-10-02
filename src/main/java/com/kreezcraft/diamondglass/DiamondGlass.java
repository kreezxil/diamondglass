package com.kreezcraft.diamondglass;


import com.kreezcraft.diamondglass.blocks.paneBlock;
import com.kreezcraft.diamondglass.blocks.slabBlock;
import com.kreezcraft.diamondglass.blocks.stairsBlock;
import com.kreezcraft.diamondglass.setup.*;
import com.kreezcraft.diamondglass.blocks.fullBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("diamondglass")
public class DiamondGlass {

    public static final String MODID = "diamondglass";

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public static ModSetup setup = new ModSetup();

    private static final Logger LOGGER = LogManager.getLogger();


	public DiamondGlass() {

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
	}

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
        proxy.init();
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        @SubscribeEvent
        public static void onBlockRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new fullBlock("diamond_chiseled_sandstone", Material.ROCK, MaterialColor.SAND));
            event.getRegistry().register(new fullBlock("diamond_glass", Material.GLASS, MaterialColor.CYAN));
            event.getRegistry().register(new fullBlock("diamond_glass",Material.GLASS,MaterialColor.YELLOW));
            event.getRegistry().register(new fullBlock("diamond_glass_black", Material.GLASS, MaterialColor.BLACK));
            event.getRegistry().register(new fullBlock("diamond_glass_blue", Material.GLASS, MaterialColor.BLUE));
            event.getRegistry().register(new fullBlock("diamond_glass_brown", Material.GLASS, MaterialColor.BROWN));
            event.getRegistry().register(new fullBlock("diamond_glass_gray", Material.GLASS, MaterialColor.GRAY));
            event.getRegistry().register(new fullBlock("diamond_glass_green", Material.GLASS, MaterialColor.GREEN));
            event.getRegistry().register(new fullBlock("diamond_glass_light_blue", Material.GLASS, MaterialColor.LIGHT_BLUE));
            event.getRegistry().register(new fullBlock("diamond_glass_light_gray", Material.GLASS, MaterialColor.LIGHT_GRAY));
            event.getRegistry().register(new fullBlock("diamond_glass_lime", Material.GLASS, MaterialColor.LIME ));
            event.getRegistry().register(new fullBlock("diamond_glass_magenta", Material.GLASS, MaterialColor.MAGENTA));
            event.getRegistry().register(new fullBlock("diamond_glass_orange", Material.GLASS, MaterialColor.GOLD));
            event.getRegistry().register(new fullBlock("diamond_glass_pink", Material.GLASS, MaterialColor.PINK));
            event.getRegistry().register(new fullBlock("diamond_glass_purple", Material.GLASS, MaterialColor.PURPLE));
            event.getRegistry().register(new fullBlock("diamond_glass_red", Material.GLASS, MaterialColor.RED));
            event.getRegistry().register(new fullBlock("diamond_glass_white",Material.GLASS,MaterialColor.WOOL));
            event.getRegistry().register(new fullBlock("diamond_sand",Material.SAND,MaterialColor.SAND));
            event.getRegistry().register(new fullBlock("diamond_sandstone",Material.ROCK,MaterialColor.SAND));
            event.getRegistry().register(new fullBlock("diamond_smooth_sandstone",Material.ROCK,MaterialColor.SAND));
            event.getRegistry().register(new fullBlock("rainbow_glass_block",Material.GLASS,MaterialColor.YELLOW));
            event.getRegistry().register(new paneBlock("diamond_glass_pane", Material.GLASS, MaterialColor.CYAN));
            event.getRegistry().register(new paneBlock("diamond_glass_pane_black", Material.GLASS, MaterialColor.BLACK));
            event.getRegistry().register(new paneBlock("diamond_glass_pane_blue", Material.GLASS, MaterialColor.BLUE));
            event.getRegistry().register(new paneBlock("diamond_glass_pane_brown", Material.GLASS, MaterialColor.BROWN));
            event.getRegistry().register(new paneBlock("diamond_glass_pane_gray", Material.GLASS, MaterialColor.GRAY));
            event.getRegistry().register(new paneBlock("diamond_glass_pane_green", Material.GLASS, MaterialColor.GREEN));
            event.getRegistry().register(new paneBlock("diamond_glass_pane_light_blue", Material.GLASS, MaterialColor.LIGHT_BLUE));
            event.getRegistry().register(new paneBlock("diamond_glass_pane_light_gray", Material.GLASS, MaterialColor.LIGHT_GRAY));
            event.getRegistry().register(new paneBlock("diamond_glass_pane_lime", Material.GLASS, MaterialColor.LIME));
            event.getRegistry().register(new paneBlock("diamond_glass_pane_magenta", Material.GLASS, MaterialColor.MAGENTA));
            event.getRegistry().register(new paneBlock("diamond_glass_pane_orange", Material.GLASS, MaterialColor.GOLD));
            event.getRegistry().register(new paneBlock("diamond_glass_pane_pink", Material.GLASS, MaterialColor.PINK));
            event.getRegistry().register(new paneBlock("diamond_glass_pane_purple", Material.GLASS, MaterialColor.PURPLE));
            event.getRegistry().register(new paneBlock("diamond_glass_pane_red", Material.GLASS, MaterialColor.RED));
            event.getRegistry().register(new paneBlock("diamond_glass_pane_white", Material.GLASS, MaterialColor.QUARTZ));
            event.getRegistry().register(new paneBlock("diamond_glass_pane_yellow", Material.GLASS, MaterialColor.YELLOW));
            event.getRegistry().register(new paneBlock("rainbow_glass_pane",Material.GLASS,MaterialColor.YELLOW));
            event.getRegistry().register(new slabBlock("diamond_chiseled_sandstone_slab", Material.ROCK,MaterialColor.SAND));
            event.getRegistry().register(new slabBlock("diamond_glass_light_blue", Material.GLASS, MaterialColor.LIGHT_BLUE));
            event.getRegistry().register(new slabBlock("diamond_glass_slab", Material.GLASS, MaterialColor.CYAN));
            event.getRegistry().register(new slabBlock("diamond_glass_slab_black", Material.GLASS, MaterialColor.BLACK));
            event.getRegistry().register(new slabBlock("diamond_glass_slab_blue", Material.GLASS, MaterialColor.BLUE));
            event.getRegistry().register(new slabBlock("diamond_glass_slab_brown", Material.GLASS, MaterialColor.BROWN));
            event.getRegistry().register(new slabBlock("diamond_glass_slab_gray", Material.GLASS, MaterialColor.GRAY));
            event.getRegistry().register(new slabBlock("diamond_glass_slab_green", Material.GLASS, MaterialColor.GREEN));
            event.getRegistry().register(new slabBlock("diamond_glass_slab_light_gray", Material.GLASS, MaterialColor.LIGHT_GRAY));
            event.getRegistry().register(new slabBlock("diamond_glass_slab_lime", Material.GLASS, MaterialColor.LIME));
            event.getRegistry().register(new slabBlock("diamond_glass_slab_magenta", Material.GLASS, MaterialColor.MAGENTA));
            event.getRegistry().register(new slabBlock("diamond_glass_slab_orange", Material.GLASS, MaterialColor.GOLD));
            event.getRegistry().register(new slabBlock("diamond_glass_slab_pink", Material.GLASS, MaterialColor.PINK));
            event.getRegistry().register(new slabBlock("diamond_glass_slab_purple", Material.GLASS, MaterialColor.PURPLE));
            event.getRegistry().register(new slabBlock("diamond_glass_slab_red", Material.GLASS, MaterialColor.RED));
            event.getRegistry().register(new slabBlock("diamond_glass_slab_white", Material.GLASS, MaterialColor.QUARTZ));
            event.getRegistry().register(new slabBlock("diamond_glass_slab_yellow", Material.GLASS, MaterialColor.YELLOW));
            event.getRegistry().register(new slabBlock("diamond_sandstone_slab",Material.GLASS,MaterialColor.SAND));
            event.getRegistry().register(new slabBlock("diamond_smooth_sandstone_slab",Material.GLASS,MaterialColor.SAND));
            event.getRegistry().register(new slabBlock("rainbow_glass_slab",Material.GLASS,MaterialColor.YELLOW));
            event.getRegistry().register(new stairsBlock("diamond_chiseled_sandstone_stairs", Material.ROCK, MaterialColor.SAND));
            event.getRegistry().register(new stairsBlock("diamond_glass_light_blue", Material.GLASS, MaterialColor.LIGHT_BLUE));
            event.getRegistry().register(new stairsBlock("diamond_glass_stairs", Material.GLASS, MaterialColor.CYAN));
            event.getRegistry().register(new stairsBlock("diamond_glass_stairs_black", Material.GLASS, MaterialColor.BLACK));
            event.getRegistry().register(new stairsBlock("diamond_glass_stairs_blue", Material.GLASS, MaterialColor.BLUE));
            event.getRegistry().register(new stairsBlock("diamond_glass_stairs_brown", Material.GLASS, MaterialColor.BROWN));
            event.getRegistry().register(new stairsBlock("diamond_glass_stairs_gray", Material.GLASS, MaterialColor.GRAY));
            event.getRegistry().register(new stairsBlock("diamond_glass_stairs_green", Material.GLASS, MaterialColor.GREEN));
            event.getRegistry().register(new stairsBlock("diamond_glass_stairs_light_gray", Material.GLASS, MaterialColor.LIGHT_GRAY));
            event.getRegistry().register(new stairsBlock("diamond_glass_stairs_lime", Material.GLASS, MaterialColor.LIME));
            event.getRegistry().register(new stairsBlock("diamond_glass_stairs_magenta", Material.GLASS, MaterialColor.MAGENTA));
            event.getRegistry().register(new stairsBlock("diamond_glass_stairs_orange", Material.GLASS, MaterialColor.GOLD));
            event.getRegistry().register(new stairsBlock("diamond_glass_stairs_pink", Material.GLASS, MaterialColor.PINK));
            event.getRegistry().register(new stairsBlock("diamond_glass_stairs_purple", Material.GLASS, MaterialColor.PURPLE));
            event.getRegistry().register(new stairsBlock("diamond_glass_stairs_red", Material.GLASS, MaterialColor.RED));
            event.getRegistry().register(new stairsBlock("diamond_glass_stairs_white", Material.GLASS, MaterialColor.QUARTZ));
            event.getRegistry().register(new stairsBlock("diamond_glass_stairs_yellow", Material.GLASS, MaterialColor.YELLOW));
            event.getRegistry().register(new stairsBlock("diamond_sandstone_stairs",Material.GLASS,MaterialColor.SAND));
            event.getRegistry().register(new stairsBlock("diamond_smooth_sandstone_stairs",Material.GLASS,MaterialColor.SAND));
            event.getRegistry().register(new stairsBlock("rainbow_glass_stairs",Material.GLASS,MaterialColor.YELLOW));
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(setup.itemGroup);

            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_CHISELED_SANDSTONE, properties).setRegistryName("diamond_chiseled_sandstone"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS , properties).setRegistryName("diamond_glass"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_BLACK , properties).setRegistryName("diamond_glass_black"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_BLUE , properties).setRegistryName("diamond_glass_blue"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_BROWN , properties).setRegistryName("diamond_glass_brown"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_GRAY , properties).setRegistryName("diamond_glass_gray"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_GREEN , properties).setRegistryName("diamond_glass_green"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_LIGHT_BLUE , properties).setRegistryName("diamond_glass_light_blue"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_LIGHT_GRAY , properties).setRegistryName("diamond_glass_light_gray"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_LIME , properties).setRegistryName("diamond_glass_lime"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_MAGENTA , properties).setRegistryName("diamond_glass_magenta"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_ORANGE , properties).setRegistryName("diamond_glass_orange"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_PINK , properties).setRegistryName("diamond_glass_pink"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_PURPLE , properties).setRegistryName("diamond_glass_purple"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_RED , properties).setRegistryName("diamond_glass_red"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_WHITE , properties).setRegistryName("diamond_glass_white"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_YELLOW , properties).setRegistryName("diamond_glass_yellow"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_SAND , properties).setRegistryName("diamond_sand"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_SANDSTONE , properties).setRegistryName("diamond_sandstone"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_SMOOTH_SANDSTONE , properties).setRegistryName("diamond_smooth_sandstone"));
            event.getRegistry().register(new BlockItem(ModBlocks.RAINBOW_GLASS_BLOCK , properties).setRegistryName("rainbow_glass_block"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_PANE , properties).setRegistryName("diamond_glass_pane"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_PANE_BLACK , properties).setRegistryName("diamond_glass_pane_black"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_PANE_BLUE , properties).setRegistryName("diamond_glass_pane_blue"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_PANE_BROWN , properties).setRegistryName("diamond_glass_pane_brown"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_PANE_GRAY , properties).setRegistryName("diamond_glass_pane_gray"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_PANE_GREEN , properties).setRegistryName("diamond_glass_pane_green"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_PANE_LIGHT_BLUE , properties).setRegistryName("diamond_glass_pane_light_blue"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_PANE_LIGHT_GRAY , properties).setRegistryName("diamond_glass_pane_light_gray"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_PANE_LIME , properties).setRegistryName("diamond_glass_pane_lime"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_PANE_MAGENTA , properties).setRegistryName("diamond_glass_pane_magenta"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_PANE_ORANGE , properties).setRegistryName("diamond_glass_pane_orange"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_PANE_PINK , properties).setRegistryName("diamond_glass_pane_pink"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_PANE_PURPLE , properties).setRegistryName("diamond_glass_pane_purple"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_PANE_RED , properties).setRegistryName("diamond_glass_pane_red"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_PANE_WHITE , properties).setRegistryName("diamond_glass_pane_white"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_PANE_YELLOW , properties).setRegistryName("diamond_glass_pane_yellow"));
            event.getRegistry().register(new BlockItem(ModBlocks.RAINBOW_GLASS_PANE , properties).setRegistryName("rainbow_glass_pane"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_CHISELED_SANDSTONE_SLAB , properties).setRegistryName("diamond_chiseled_sandstone_slab"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_SLAB , properties).setRegistryName("diamond_glass_slab"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_SLAB_BLACK , properties).setRegistryName("diamond_glass_slab_black"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_SLAB_BLUE , properties).setRegistryName("diamond_glass_slab_blue"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_SLAB_BROWN , properties).setRegistryName("diamond_glass_slab_brown"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_SLAB_GRAY , properties).setRegistryName("diamond_glass_slab_gray"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_SLAB_GREEN , properties).setRegistryName("diamond_glass_slab_green"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_SLAB_LIGHT_BLUE , properties).setRegistryName("diamond_glass_slab_light_blue"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_SLAB_LIGHT_GRAY , properties).setRegistryName("diamond_glass_slab_light_gray"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_SLAB_LIME , properties).setRegistryName("diamond_glass_slab_lime"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_SLAB_MAGENTA , properties).setRegistryName("diamond_glass_slab_magenta"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_SLAB_ORANGE , properties).setRegistryName("diamond_glass_slab_orange"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_SLAB_PINK , properties).setRegistryName("diamond_glass_slab_pink"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_SLAB_PURPLE , properties).setRegistryName("diamond_glass_slab_purple"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_SLAB_RED , properties).setRegistryName("diamond_glass_slab_red"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_SLAB_WHITE , properties).setRegistryName("diamond_glass_slab_white"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_SLAB_YELLOW , properties).setRegistryName("diamond_glass_slab_yellow"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_SANDSTONE_SLAB , properties).setRegistryName("diamond_sandstone_slab"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_SMOOTH_SANDSTONE_SLAB , properties).setRegistryName("diamond_smooth_sandstone_slab"));
            event.getRegistry().register(new BlockItem(ModBlocks.RAINBOW_GLASS_SLAB , properties).setRegistryName("rainbow_glass_slab"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_CHISELED_SANDSTONE_STAIRS , properties).setRegistryName("diamond_chiseled_sandstone_stairs"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_STAIRS , properties).setRegistryName("diamond_glass_stairs"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_STAIRS_BLACK , properties).setRegistryName("diamond_glass_stairs_black"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_STAIRS_BLUE , properties).setRegistryName("diamond_glass_stairs_blue"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_STAIRS_BROWN , properties).setRegistryName("diamond_glass_stairs_brown"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_STAIRS_GRAY , properties).setRegistryName("diamond_glass_stairs_gray"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_STAIRS_GREEN , properties).setRegistryName("diamond_glass_stairs_green"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_STAIRS_LIGHT_BLUE , properties).setRegistryName("diamond_glass_stairs_light_blue"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_STAIRS_LIGHT_GRAY , properties).setRegistryName("diamond_glass_stairs_light_gray"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_STAIRS_LIME , properties).setRegistryName("diamond_glass_stairs_lime"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_STAIRS_MAGENTA , properties).setRegistryName("diamond_glass_stairs_magenta"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_STAIRS_ORANGE , properties).setRegistryName("diamond_glass_stairs_orange"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_STAIRS_PINK , properties).setRegistryName("diamond_glass_stairs_pink"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_STAIRS_PURPLE , properties).setRegistryName("diamond_glass_stairs_purple"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_STAIRS_RED , properties).setRegistryName("diamond_glass_stairs_red"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_STAIRS_WHITE , properties).setRegistryName("diamond_glass_stairs_white"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_GLASS_STAIRS_YELLOW , properties).setRegistryName("diamond_glass_stairs_yellow"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_SANDSTONE_STAIRS , properties).setRegistryName("diamond_sandstone_stairs"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIAMOND_SMOOTH_SANDSTONE_STAIRS , properties).setRegistryName("diamond_smooth_sandstone_stairs"));
            event.getRegistry().register(new BlockItem(ModBlocks.RAINBOW_GLASS_STAIRS , properties).setRegistryName("rainbow_glass_stairs"));
        }
    }

    public static ItemGroup modTab = new ItemGroup(MODID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.DIAMOND_GLASS);
        }
    };
}