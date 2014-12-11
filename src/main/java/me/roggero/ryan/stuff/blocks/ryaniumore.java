package me.roggero.ryan.stuff.blocks;

import me.roggero.ryan.Ryansmod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ryaniumore extends Block{
    public final String name="ryanium_ore";

    public ryaniumore(){
        super(Material.rock);
        setUnlocalizedName(Ryansmod.MODID+"_"+name);
        setCreativeTab(CreativeTabs.tabBlock);
        GameRegistry.registerBlock(this,name);
        setHardness(20);
    }
}
