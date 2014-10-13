package me.roggero.ryan.generator;

import cpw.mods.fml.common.IWorldGenerator;
import me.roggero.ryan.blocks.blocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class oregen implements IWorldGenerator{
    @Override
    public void generate(Random random,int chunkX,int chunkZ,World world,IChunkProvider chunkGenerator,IChunkProvider chunkProvider){
        switch(world.provider.dimensionId){
            case 0: generateOverworld(random, world, chunkX * 16, chunkZ * 16); break;
            case 1: generateEnd(random, world, chunkX * 16, chunkZ * 16); break;
            case -1: generateNether(random, world, chunkX * 16, chunkZ * 16); break;
            default: generateOverworld(random, world, chunkX * 16, chunkZ * 16);
        }
    }

    private void generateNether(Random random,World world,int X,int Y){

    }

    private void generateEnd(Random random,World world,int X,int Y){

    }

    private void generateOverworld(Random random,World world,int X,int Y){
        //addOres(block, world, random, X, Y, Min Vain Size, Max Vein Size, Chance, Min Y, Maz Y
        addOres(blocks.Test, world, random, X, Y, 1, 5, 25, 0, 50);
    }
    public void addOres(Block block, World world, Random rand, int bXpos, int bZpos, int minVsize, int maxVsize, int chance, int minY, int maxY){
        WorldGenMinable minable = new WorldGenMinable(block, (minVsize + rand.nextInt(maxVsize - minVsize)), Blocks.stone);
        for(int i = 0; i < chance; i++)
        {
            int posX = bXpos + rand.nextInt(16);
            int posY = minY + rand.nextInt(maxY - minY);
            int posZ = bZpos + rand.nextInt(16);
            minable.generate(world, rand, posX, posY, posZ);
        }
    }
}
