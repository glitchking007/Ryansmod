package me.roggero.ryan.stuff.items;

import me.roggero.ryan.Ryansmod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ryaniumspade extends ItemSpade{

    public final String name = "ryanium_spade";

    public ryaniumspade(ToolMaterial mat){
        super(mat);
        setMaxDamage(93);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName(Ryansmod.MODID + "_" + name);
        GameRegistry.registerItem(this,name);
        //setTextureName(Ryansmod.MODID + ":" + name);
    }
}
