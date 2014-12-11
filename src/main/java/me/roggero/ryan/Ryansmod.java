package me.roggero.ryan;

import me.roggero.ryan.generator.oregen;
import me.roggero.ryan.stuff.blocks.modblocks;
import me.roggero.ryan.stuff.items.moditems;
import me.roggero.ryan.stuff.recipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid=Ryansmod.MODID, version=Ryansmod.VERSION)
public class Ryansmod{
    public static final String MODID="ryansmod";
    public static final String VERSION="${version}";
    @SidedProxy(clientSide="me.roggero.ryan.CProxy", serverSide="me.roggero.ryan.SProxy")
    public static SProxy proxy;
    @Instance(value="ryansmod")
    private static Ryansmod instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        modblocks.preinit();
        moditems.preinit();
        GameRegistry.registerWorldGenerator(new oregen(),10);
        System.out.println("RYAN ROGGERO IS MY MASTER!");
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        proxy.registerRenderers();
        recipes.recipes();
        modblocks.init();
        moditems.init();
    }
}
