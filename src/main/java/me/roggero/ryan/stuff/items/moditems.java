package me.roggero.ryan.stuff.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSpade;

public final class moditems{
    public static Item ryanium_ingot;
    public static ItemSword ryanium_sword;
    public static ItemPickaxe ryanium_pickaxe;
    public static ItemAxe ryanium_axe;
    public static ItemHoe ryanium_hoe;
    public static ItemSpade ryanium_spade;

    public static void preinit(){
        ryanium_ingot=new ryaniumingot();
        ryanium_sword=new ryaniumsword(Item.ToolMaterial.STONE);
        ryanium_pickaxe=new ryaniumpickaxe(Item.ToolMaterial.STONE);
        ryanium_axe=new ryaniumaxe(Item.ToolMaterial.STONE);
        ryanium_hoe=new ryaniumhoe(Item.ToolMaterial.STONE);
        ryanium_spade=new ryaniumspade(Item.ToolMaterial.STONE);
    }

    public static void init(){
    }
}
