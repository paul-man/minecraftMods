package me.kidOYO.OYOBush;

import me.kidOYO.OYOreMod.OYODust;
import me.kidOYO.OYOreMod.OYOre;
import me.kidOYO.OYOreMod.OYOreWorldGen;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemFood;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="obm", name="OYO Bush Mod", version="1.0")
public class OYOBushMod {
	
	public static Block blockOYOBerry;
	public static ItemFood oyoBerry;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		blockOYOBerry = new BlockOYOBerry();
		oyoBerry = new OyoBerry();
		
		GameRegistry.registerItem(oyoBerry, oyoBerry.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockOYOBerry, blockOYOBerry.getUnlocalizedName().substring(5));
		


	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

		GameRegistry.registerWorldGenerator(new WorldGenClass(), 1);

	}

	@EventHandler 
	public void postInit(FMLPostInitializationEvent event) {



	}


}
