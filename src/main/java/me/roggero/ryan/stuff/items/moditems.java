package me.roggero.ryan.stuff.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public final class moditems{
    public static Item ryanium_ingot;
    public static ItemSword ryanium_sword;
    public static void preinit(){
        ryanium_ingot = new ryaniumingot();
        ryanium_sword = new ryaniumsword(Item.ToolMaterial.STONE);
    }

    public static void init(){
    }
}
