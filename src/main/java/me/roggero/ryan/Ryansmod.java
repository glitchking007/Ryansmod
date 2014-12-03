package me.roggero.ryan;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import me.roggero.ryan.stuff.blocks.modblocks;
import me.roggero.ryan.generator.oregen;
import me.roggero.ryan.stuff.items.moditems;
import me.roggero.ryan.stuff.recipes;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid=Ryansmod.MODID, version=Ryansmod.VERSION)
public class Ryansmod{
    @Mod.Instance(value="ryansmod")
    private static Ryansmod instance;
    @SidedProxy(clientSide="me.roggero.ryan.CProxy", serverSide="me.roggero.ryan.SProxy")
    public static SProxy proxy;
    public static final String MODID="ryansmod";
    public static final String VERSION="${version}";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        modblocks.preinit();
        moditems.preinit();
        //GameRegistry.registerWorldGenerator(new oregen(),10);
        System.out.println("RYAN ROGGERO IS MY MASTER!");
        proxy.registerRenderers();
    }
    @EventHandler
    public void init(FMLInitializationEvent event){
        recipes.recipes();
        modblocks.init();
        moditems.init();
    }
}
