package me.roggero.ryan.stuff.items;

import me.roggero.ryan.Ryansmod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ryaniumaxe extends ItemAxe{

    public final String name = "ryanium_axe";

    public ryaniumaxe(ToolMaterial mat){
        super(mat);
        setUnlocalizedName(Ryansmod.MODID + ":" + name);
        setMaxDamage(93);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName(Ryansmod.MODID + "_" + name);
        GameRegistry.registerItem(this,name);
        //setTextureName(Ryansmod.MODID + ":" + name);
    }
}
