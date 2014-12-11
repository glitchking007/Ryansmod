package me.roggero.ryan.stuff.items;

import me.roggero.ryan.Ryansmod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ryaniumsword extends ItemSword{

    public final String name="ryanium_sword";

    public ryaniumsword(ToolMaterial material){
        super(material);
        setMaxDamage(93);
        setUnlocalizedName(Ryansmod.MODID+"_"+name);
        setCreativeTab(CreativeTabs.tabCombat);
        GameRegistry.registerItem(this,name);
    }

}
