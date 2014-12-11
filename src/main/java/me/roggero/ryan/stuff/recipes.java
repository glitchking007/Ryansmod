package me.roggero.ryan.stuff;

import me.roggero.ryan.stuff.blocks.modblocks;
import me.roggero.ryan.stuff.items.moditems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class recipes{
    public static void recipes(){
        ItemStack ingot=new ItemStack(moditems.ryanium_ingot);
        ItemStack block=new ItemStack(modblocks.ryanium_block);
        ItemStack ore=new ItemStack(modblocks.ryanium_ore);
        ItemStack sword=new ItemStack(moditems.ryanium_sword);
        ItemStack hoe=new ItemStack(moditems.ryanium_hoe);
        ItemStack spade=new ItemStack(moditems.ryanium_spade);
        ItemStack pick=new ItemStack(moditems.ryanium_pickaxe);
        ItemStack axe=new ItemStack(moditems.ryanium_axe);
        GameRegistry.addSmelting(modblocks.ryanium_ore,ingot,0.1f);
        GameRegistry.addShapedRecipe(block,"aaa","aaa","aaa",'a',ingot);
        GameRegistry.addShapelessRecipe(new ItemStack(moditems.ryanium_ingot,9),block);
        GameRegistry.addShapedRecipe(sword,"a","a","b",'a',ingot,'b',net.minecraft.item.Item.getItemById(280));
        GameRegistry.addShapedRecipe(axe,"aa ","ab "," b ",'a',ingot,'b',net.minecraft.item.Item.getItemById(280));
        GameRegistry.addShapedRecipe(hoe,"aa "," b "," b ",'a',ingot,'b',net.minecraft.item.Item.getItemById(280));
        GameRegistry.addShapedRecipe(pick,"aaa"," b "," b ",'a',ingot,'b',net.minecraft.item.Item.getItemById(280));
        GameRegistry.addShapedRecipe(spade," a "," b "," b ",'a',ingot,'b',net.minecraft.item.Item.getItemById(280));
    }
}
