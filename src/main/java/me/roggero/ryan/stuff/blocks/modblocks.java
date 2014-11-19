package me.roggero.ryan.stuff.blocks;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;

public final class modblocks{
    public static Block ryanium_block;
    public static Block ryanium_ore;
    public static void preinit(){
        ryanium_block = new ryaniumblock();
        ryanium_ore = new ryaniumore();
        LanguageRegistry.addName(ryanium_block,"Ryanium Block");
        LanguageRegistry.addName(ryanium_ore,"Ryanium Ore");
    }
    public static void init(){
    }
}
