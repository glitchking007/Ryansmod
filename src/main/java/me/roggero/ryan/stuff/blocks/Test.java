package me.roggero.ryan.stuff.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import me.roggero.ryan.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Test extends Block{
    public final String name = "test";
    public Test(){
        super(Material.rock);
        setBlockName(Main.MODID + "_" + name);
        setCreativeTab(CreativeTabs.tabBlock);
        GameRegistry.registerBlock(this,name);
        setBlockTextureName(Main.MODID + ":" + name);
        setHardness(20);
    }
}
