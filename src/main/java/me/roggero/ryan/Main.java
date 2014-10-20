package me.roggero.ryan;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import me.roggero.ryan.blocks.modblocks;
import me.roggero.ryan.generator.oregen;
import me.roggero.ryan.items.moditems;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid=Main.MODID, version=Main.VERSION)
public class Main{
    @Instance(value="ryansmod")
    public static Main instance;
    @SidedProxy(clientSide="me.roggero.ryan.CProxy", serverSide="me.roggero.ryan.SProxy")
    public static SProxy proxy;
    public static final String MODID="ryansmod";
    public static final String VERSION="@VERSION@";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        modblocks.preinit();
        moditems.preinit();
        GameRegistry.registerWorldGenerator(new oregen(),10);
        System.out.println("RYAN ROGGERO IS MY MASTER!");
        proxy.registerRenderers();
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        modblocks.init();
        moditems.init();
    }
}
