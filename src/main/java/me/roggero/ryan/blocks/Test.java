package me.roggero.ryan.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Test extends Block{
    public Test(Material material){
        super(material);
    }

    public static Boolean CHARLIE(int i){
        if(i==1){
            return true;
        }else{
            return false;
        }
    }
}
