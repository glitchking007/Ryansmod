package me.roggero.ryan.generator;

import me.roggero.ryan.stuff.blocks.modblocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class oregen implements IWorldGenerator{
    @Override
    public void generate(Random random,int chunkX,int chunkZ,World world,IChunkProvider chunkGenerator,IChunkProvider chunkProvider){
        switch(world.provider.getDimensionId()){
            case 0:
                generateOverworld(random,world,chunkX*16,chunkZ*16);
                break;
            case 1:
                generateEnd(random,world,chunkX*16,chunkZ*16);
                break;
            case -1:
                generateNether(random,world,chunkX*16,chunkZ*16);
                break;
            default:
                generateOverworld(random,world,chunkX*16,chunkZ*16);
        }
    }

    private void generateNether(Random random,World world,int X,int Z){
        //addOres(block, world, random, X, Y, Min Vain Size, Max Vein Size, Chance, Min Y, Maz Y)
    }

    private void generateEnd(Random random,World world,int X,int Z){
        //addOres(block, world, random, X, Y, Min Vain Size, Max Vein Size, Chance, Min Y, Maz Y)
    }

    private void generateOverworld(Random random,World world,int X,int Z){
        //addOres(block, world, random, X, Y, Min Vain Size, Max Vein Size, Chance, Min Y, Maz Y)
        addOres(modblocks.ryanium_ore,world,random,X,Z,1,5,25,0,50);
    }

    public void addOres(Block block,World world,Random rand,int bXpos,int bZpos,int minVsize,int maxVsize,int chance,int minY,int maxY){
        for(int i=0;i<chance;i++){
            BlockPos pos=new BlockPos(bXpos+rand.nextInt(16),minY+rand.nextInt(maxY-minY),bZpos+rand.nextInt(16));
            new WorldGenMinable(block.getDefaultState(),(minVsize+rand.nextInt(maxVsize-minVsize)),BlockHelper.forBlock(Blocks.stone)).generate(world,rand,pos);
        }
    }
}
