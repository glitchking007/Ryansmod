package me.roggero.ryan.stuff.items;

import cpw.mods.fml.common.registry.GameRegistry;
import me.roggero.ryan.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ryaniumingot extends Item{

    public final String name = "ryanium_ingot";

    public ryaniumingot(){
        setUnlocalizedName(Main.MODID+"_"+name);
        setCreativeTab(CreativeTabs.tabMaterials);
        GameRegistry.registerItem(this,name);
        setTextureName(Main.MODID+":"+name);
        setMaxStackSize(64);
    }
}
