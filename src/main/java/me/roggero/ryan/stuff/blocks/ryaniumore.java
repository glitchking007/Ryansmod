package me.roggero.ryan.stuff.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import me.roggero.ryan.Ryansmod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ryaniumore extends Block{
    public final String name = "ryanium_ore";
    public ryaniumore(){
        super(Material.rock);
        setBlockName(Ryansmod.MODID + "_" + name);
        setCreativeTab(CreativeTabs.tabBlock);
        GameRegistry.registerBlock(this,name);
        setBlockTextureName(Ryansmod.MODID + ":" + name);
        setHardness(20);
    }
}
