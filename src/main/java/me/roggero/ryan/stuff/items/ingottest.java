package me.roggero.ryan.stuff.items;

import cpw.mods.fml.common.registry.GameRegistry;
import me.roggero.ryan.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ingottest extends Item{
    public String name = "testingot";
    public ingottest(){
        setUnlocalizedName(Main.MODID+"_"+name);
        setCreativeTab(CreativeTabs.tabMaterials);
        GameRegistry.registerItem(this,name);
        setTextureName(Main.MODID+":"+name);
        setMaxStackSize(64);
    }
}
