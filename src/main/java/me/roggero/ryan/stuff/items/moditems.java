package me.roggero.ryan.stuff.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public final class moditems{
    public static Item ryanium_ingot;
    public static void preinit(){
        ryanium_ingot = new ryaniumingot();
    }

    public static void init(){
    }
}
