package me.roggero.ryan.stuff.items;

import cpw.mods.fml.common.registry.GameRegistry;
import me.roggero.ryan.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ryaniumspade extends ItemSpade{

    public final String name = "ryanium_spade";

    public ryaniumspade(ToolMaterial mat){
        super(mat);
        setMaxDamage(93);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName(Main.MODID + "_" + name);
        GameRegistry.registerItem(this,name);
        setTextureName(Main.MODID + ":" + name);
    }
}
