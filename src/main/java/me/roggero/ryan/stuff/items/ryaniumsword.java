package me.roggero.ryan.stuff.items;

import cpw.mods.fml.common.registry.GameRegistry;
import me.roggero.ryan.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ryaniumsword extends ItemSword{

    public final String name = "ryanium_sword";

    public ryaniumsword(ToolMaterial material){
        super(material);
        setMaxDamage(93);
        setUnlocalizedName(Main.MODID+"_"+name);
        setCreativeTab(CreativeTabs.tabCombat);
        GameRegistry.registerItem(this,name);
        setTextureName(Main.MODID+ ":" +name);
    }

}
