package me.kidOYO.OYOBush;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldGenClass implements IWorldGenerator{


	@Override
	public void generate(Random random, int x, int z, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		
		case 0: 
			generateSurface(world, random, x*16, z*16);
			break;
		case -1:
			generateSurface(world, random, x*16, z*16);
			break;
			
		}
	}

	private void generateSurface(World world, Random random, int BlockX, int BlockZ){

		for(int i = 0; i < 2; i++){
			int posX = BlockX + random.nextInt(16);
			int posZ = BlockZ + random.nextInt(16);
			int posY = 50 + random.nextInt(25);

			(new OyoBerryGen()).generate(world, random, posX, posY, posZ);
		}

	}
}
