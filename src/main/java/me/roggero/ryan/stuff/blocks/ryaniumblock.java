package me.roggero.ryan.stuff.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import me.roggero.ryan.Ryansmod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ryaniumblock extends Block{
    public final String name = "ryanium_block";
    public ryaniumblock(){
        super(Material.iron);
        setBlockName(Ryansmod.MODID + "_" + name);
        setCreativeTab(CreativeTabs.tabBlock);
        GameRegistry.registerBlock(this,name);
        setBlockTextureName(Ryansmod.MODID + ":" + name);
        setHardness(25);
    }
}
