package me.kidOYO.OyoOre;

import me.kidOYO.MyFirstMod.MyFirstMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid ="oom", name ="Oyo Ore Mod", version = "1.0")

public class OyoOreMod {
	public static Block oyoOre;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		oyoOre = new OyoOre(Material.rock, "OyoOre", MyFirstMod.oyoSword, 0, 1, 10);
		GameRegistry.registerBlock(oyoOre, oyoOre.getUnlocalizedName().substring(5));



	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new OreWorldGen(), 0);
//		GameRegistry.addRecipe(new ItemStack(oyoOre), new Object[]{"C  ",
//																   " D ",
//																   "   ", 
//																   'D', Blocks.dirt,
//																   'C', Blocks.cobblestone});

		
	}

	@EventHandler 
	public void postInit(FMLPostInitializationEvent event) {


	}
}
