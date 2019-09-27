package com.kreezcraft.diamondglass;


import com.kreezcraft.diamondglass.setup.*;
import com.kreezcraft.diamondglass.blocks.fullBlock;
import net.minecraft.block.Block;
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

@Mod(DiamondGlass.MODID)
public class DiamondGlass {

	public static final String MODID = "diamondglass";

	public static IProxy proxy = DistExecutor.runForDist(()->()->new ClientProxy(),()->()->new ServerProxy()
	);
	public static ModSetup setup = new ModSetup();

	private static final Logger LOGGER = LogManager.getLogger();

	public DiamondGlass() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
	}

	private void setup(final FMLCommonSetupEvent event) {
		setup.init();
		proxy.init();
	}

	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {

		@SubscribeEvent
		public static void onBlockRegistry(final RegistryEvent.Register<Block> event) {
            int i = 0;
            while (i < ModBlocks.BLOCKS.size()) {
                event.getRegistry().register(ModBlocks.BLOCKS.get(i));
            }
		}

		@SubscribeEvent
		public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
		    Item.Properties properties = new Item.Properties().group(setup.itemGroup);
		    //REGISTERING THE BLOCKS AS ITEMS
            int i = 0;
            while (i < ModBlocks.BLOCKS.size()) {
                event.getRegistry().register(new BlockItem(ModBlocks.BLOCKS.get(i),properties).setRegistryName(ModBlocks.BLOCKS.get(i).getRegistryName()));
            }

            //registering the normal items here
		}
	}

    public static ItemGroup modTab = new ItemGroup(MODID)
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModBlocks.DIAMOND_GLASS);
        }
    };
}