package me.roggero.ryan.stuff.blocks;

import me.roggero.ryan.Ryansmod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ryaniumblock extends Block{
    public final String name = "ryanium_block";
    public ryaniumblock(){
        super(Material.iron);
        setUnlocalizedName(Ryansmod.MODID + "_" + name);
        //setBlockName(Ryansmod.MODID + "_" + name);
        setCreativeTab(CreativeTabs.tabBlock);
        GameRegistry.registerBlock(this,name);
        //setBlockTextureName(Ryansmod.MODID + ":" + name);
        setHardness(25);
    }
}
