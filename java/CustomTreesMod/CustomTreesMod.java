package me.kidOYO.CustomTreesMod;

import net.minecraft.block.BlockLog;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="evm", name="Environment Mod", version="1.0")
public class CustomTreesMod {
	
	public static BlockLog blockLog;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		 blockLog = new OYOLog();
		 blockLog.setBlockName("Log").setCreativeTab(CreativeTabs.tabBlock);
         GameRegistry.registerBlock(blockLog, ItemLogBlocks.class, blockLog.getUnlocalizedName().substring(5));


	}

	@EventHandler
	public void init(FMLInitializationEvent event) {



	}

	@EventHandler 
	public void postInit(FMLPostInitializationEvent event) {


	}
}
