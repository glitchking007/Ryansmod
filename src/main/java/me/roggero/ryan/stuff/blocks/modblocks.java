package me.roggero.ryan.stuff.blocks;

import net.minecraft.block.Block;

public final class modblocks{
    public static Block TestBlock;
    public static Block Test;
    public static void preinit(){
        TestBlock = new TestBlock();
        Test = new Test();
    }
    public static void init(){
    }
}
