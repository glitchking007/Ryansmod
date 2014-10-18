package me.roggero.ryan.items;

import cpw.mods.fml.common.registry.GameRegistry;
import me.roggero.ryan.Main;
import me.roggero.ryan.blocks.modblocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

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
