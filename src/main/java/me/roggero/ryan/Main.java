package me.roggero.ryan;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import me.roggero.ryan.blocks.Test;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid=Main.MODID, version=Main.VERSION)
public class Main{
    @Instance(value="Ryan's Mod")
    public static Main instance;
    @SidedProxy(clientSide="me.roggero.ryan.CProxy", serverSide="me.roggero.ryan.SProxy")
    public static SProxy proxy;
    public static final String MODID="Ryan's Mod";
    public static final String VERSION="Alpha 0.0.0.1";
    public static Block Test=new Test(Material.rock).setHardness(4.0F).setStepSound(Block.soundTypePiston).setBlockName("Test").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName("Ryan's Mod:Test");

    @EventHandler
    public void init(FMLInitializationEvent event){
        GameRegistry.registerBlock(Test,"Test");
        LanguageRegistry.addName(Test,"Test");
        System.out.println("RYAN ROGGERO IS MY MASTER!");
        proxy.registerRenderers();
    }
}
