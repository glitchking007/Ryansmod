package me.roggero.ryan;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import me.roggero.ryan.blocks.blocks;
import me.roggero.ryan.generator.oregen;
import me.roggero.ryan.items.items;

@Mod(modid=Main.MODID, version=Main.VERSION)
public class Main{
    @Instance(value="Ryan's Mod")
    public static Main instance;
    @SidedProxy(clientSide="me.roggero.ryan.CProxy", serverSide="me.roggero.ryan.SProxy")
    public static SProxy proxy;
    public static final String MODID="ryansmod";
    public static final String VERSION="Alpha 0.0.0.1";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        blocks.init();
        items.init();
        GameRegistry.registerWorldGenerator(new oregen(),10);
        System.out.println("RYAN ROGGERO IS MY MASTER!");
        proxy.registerRenderers();
    }
}
