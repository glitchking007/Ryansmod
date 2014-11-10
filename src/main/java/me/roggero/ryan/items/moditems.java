package me.roggero.ryan.items;

import cpw.mods.fml.common.registry.GameRegistry;
import me.roggero.ryan.blocks.modblocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public final class moditems{
    public static Item testingot;
    public static void preinit(){
        testingot = new ingottest();
    }

    public static void init(){
        ItemStack ryan = new ItemStack(testingot,1);
        GameRegistry.addSmelting(modblocks.Test,ryan,0.1f);
    }
}
