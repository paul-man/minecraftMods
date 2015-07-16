package me.kidOYO.OYOBush;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class OyoBerryGen extends WorldGenerator {
	/** The ID of the plant block used in this plant generator. */
    private int flowerId;

    public OyoBerryGen()
    {
        //this.GlowFlowerBlockId = par1;
    }

    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
    	BiomeGenBase b = par1World.getBiomeGenForCoords(par3, par5);
        //if(b.biomeName.equals("Plains") || b.biomeName.equals("Extreme Hills") || b.biomeName.equals("Forest")) {
	    	for (int l = 0; l < 2; ++l)
	        {
	            int i1 = par3 + par2Random.nextInt(1) - par2Random.nextInt(1);
	            int j1 = par4 + par2Random.nextInt(1) - par2Random.nextInt(1);
	            int k1 = par5 + par2Random.nextInt(1) - par2Random.nextInt(1);
	
	            if (par1World.isAirBlock(i1, j1, k1) && OYOBushMod.blockOYOBerry.canPlaceBlockAt(par1World, i1, j1, k1))
	            {
	                int l1 = 1 + par2Random.nextInt(par2Random.nextInt(3) + 1);
	
	                for (int i2 = 0; i2 < l1; ++i2)
	                {
	                    if (OYOBushMod.blockOYOBerry.canBlockStay(par1World, i1, j1 + i2, k1))
	                    {
	                        par1World.setBlock(i1, j1 + i2, k1, OYOBushMod.blockOYOBerry, 0, 1);
	                    }
	                }
	            }
	        }
        //}

        return true;
    }


}