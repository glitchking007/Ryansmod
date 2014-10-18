package me.roggero.ryan.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import me.roggero.ryan.items.moditems;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

/**
 * Created by Ryan on 10/12/2014.
 */
public final class modblocks{
    public static Block Test;
    public static void preinit(){
        Test = new Test();
    }
    public static void init(){
    }
}
