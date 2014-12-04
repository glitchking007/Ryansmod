package me.roggero.ryan;

import me.roggero.ryan.generator.oregen;
import me.roggero.ryan.stuff.blocks.modblocks;
import me.roggero.ryan.stuff.items.moditems;
import me.roggero.ryan.stuff.recipes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid=Ryansmod.MODID, version=Ryansmod.VERSION)
public class Ryansmod{
    @Instance(value="ryansmod")
    private static Ryansmod instance;
    @SidedProxy(clientSide="me.roggero.ryan.CProxy", serverSide="me.roggero.ryan.SProxy")
    public static SProxy proxy;
    public static final String MODID="ryansmod";
    public static final String VERSION="${version}";
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        modblocks.preinit();
        moditems.preinit();
        GameRegistry.registerWorldGenerator(new oregen(),10);
        System.out.println("RYAN ROGGERO IS MY MASTER!");
        proxy.registerRenderers();
    }
    @EventHandler
    public void init(FMLInitializationEvent event){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(modblocks.ryanium_block),0,new ModelResourceLocation(Ryansmod.MODID+":"+"ryanium_block","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(modblocks.ryanium_ore),0,new ModelResourceLocation(Ryansmod.MODID+":"+"ryanium_ore","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(moditems.ryanium_ingot,0,new ModelResourceLocation(Ryansmod.MODID+":"+"ryanium_ingot","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(moditems.ryanium_axe,0,new ModelResourceLocation(Ryansmod.MODID+":"+"ryanium_axe","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(moditems.ryanium_hoe,0,new ModelResourceLocation(Ryansmod.MODID+":"+"ryanium_hoe","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(moditems.ryanium_pickaxe,0,new ModelResourceLocation(Ryansmod.MODID+":"+"ryanium_pickaxe","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(moditems.ryanium_sword,0,new ModelResourceLocation(Ryansmod.MODID+":"+"ryanium_sword","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(moditems.ryanium_spade,0,new ModelResourceLocation(Ryansmod.MODID+":"+"ryanium_spade","inventory"));
        recipes.recipes();
        modblocks.init();
        moditems.init();
    }
}
