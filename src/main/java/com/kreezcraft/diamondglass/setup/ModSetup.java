package com.kreezcraft.diamondglass.setup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {
    public ItemGroup itemGroup = new ItemGroup("diamond_glass") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.DIAMOND_GLASS);
        }
    };

    public void init() {

    }
}
