package me.roggero.ryan.stuff;

import cpw.mods.fml.common.registry.GameRegistry;
import me.roggero.ryan.stuff.blocks.modblocks;
import net.minecraft.item.ItemStack;
import me.roggero.ryan.stuff.items.moditems;

public final class recipes{
    public static void recipes(){
        ItemStack ingot=new ItemStack(moditems.ryanium_ingot);
        ItemStack block=new ItemStack(modblocks.ryanium_block);
        ItemStack ore=new ItemStack(modblocks.ryanium_ore);
        ItemStack sword=new ItemStack(moditems.ryanium_sword);
        GameRegistry.addSmelting(modblocks.ryanium_ore,ingot,0.1f);
        GameRegistry.addShapedRecipe(block,new Object [] {"aaa","aaa","aaa",'a',ingot});
        GameRegistry.addShapelessRecipe(new ItemStack(moditems.ryanium_ingot,9),new Object[]{block});
        GameRegistry.addShapedRecipe(sword,new Object[]{"a","a","b",'a',ingot,'b',net.minecraft.item.Item.getItemById(280)});
    }
}
