package me.roggero.ryan.stuff.items;

import me.roggero.ryan.Ryansmod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ryaniumhoe extends ItemHoe{

    public final String name = "ryanium_hoe";
    
    public ryaniumhoe(ToolMaterial mat){
        super(mat);
        setMaxDamage(93);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName(Ryansmod.MODID + "_" + name);
        GameRegistry.registerItem(this,name);
    }
}
