package me.roggero.ryan;

import me.roggero.ryan.stuff.blocks.modblocks;
import me.roggero.ryan.stuff.items.moditems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class CProxy extends SProxy{
    public void registerRenderers(){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(modblocks.ryanium_block),0,new ModelResourceLocation(Ryansmod.MODID+":"+"ryanium_block","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(modblocks.ryanium_ore),0,new ModelResourceLocation(Ryansmod.MODID+":"+"ryanium_ore","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(moditems.ryanium_ingot,0,new ModelResourceLocation(Ryansmod.MODID+":"+"ryanium_ingot","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(moditems.ryanium_axe,0,new ModelResourceLocation(Ryansmod.MODID+":"+"ryanium_axe","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(moditems.ryanium_hoe,0,new ModelResourceLocation(Ryansmod.MODID+":"+"ryanium_hoe","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(moditems.ryanium_pickaxe,0,new ModelResourceLocation(Ryansmod.MODID+":"+"ryanium_pickaxe","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(moditems.ryanium_sword,0,new ModelResourceLocation(Ryansmod.MODID+":"+"ryanium_sword","inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(moditems.ryanium_spade,0,new ModelResourceLocation(Ryansmod.MODID+":"+"ryanium_spade","inventory"));

    }
}
