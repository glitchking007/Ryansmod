package me.roggero.ryan.stuff;

import me.roggero.ryan.Ryansmod;
import me.roggero.ryan.stuff.blocks.modblocks;
import net.minecraft.item.ItemStack;
import me.roggero.ryan.stuff.items.moditems;
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
        GameRegistry.addShapedRecipe(block,new Object[]{"aaa","aaa","aaa",'a',ingot});
        GameRegistry.addShapelessRecipe(new ItemStack(moditems.ryanium_ingot,9),new Object[]{block});
        GameRegistry.addShapedRecipe(sword,new Object[]{"a","a","b",'a',ingot,'b',net.minecraft.item.Item.getItemById(280)});
        GameRegistry.addShapedRecipe(axe,new Object[]{"aa ","ab "," b ",'a',ingot,'b',net.minecraft.item.Item.getItemById(280)});
        GameRegistry.addShapedRecipe(hoe,new Object[]{"aa "," b "," b ",'a',ingot,'b',net.minecraft.item.Item.getItemById(280)});
        GameRegistry.addShapedRecipe(pick,new Object[]{"aaa"," b "," b ",'a',ingot,'b',net.minecraft.item.Item.getItemById(280)});
        GameRegistry.addShapedRecipe(spade,new Object[]{" a "," b "," b ",'a',ingot,'b',net.minecraft.item.Item.getItemById(280)});
    }
}
