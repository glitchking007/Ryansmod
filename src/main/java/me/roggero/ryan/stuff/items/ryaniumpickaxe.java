package me.roggero.ryan.stuff.items;

import me.roggero.ryan.Ryansmod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ryaniumpickaxe extends ItemPickaxe{

    public final String name="ryanium_pickaxe";

    public ryaniumpickaxe(ToolMaterial mat){
        super(mat);
        setMaxDamage(93);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName(Ryansmod.MODID+"_"+name);
        GameRegistry.registerItem(this,name);
    }
}
