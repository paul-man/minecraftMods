package me.kidOYO.OYOGrenadeMod;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="ogm", name = "OYO Grenade Mod", version = "1.0")
public class OYOGrenadeMod {


	public static Item oyoGrenade;
	
	@SidedProxy(clientSide = "me.kidOYO.OYOGrenadeMod.OYOGrenadeClient", serverSide = "me.kidOYO.proxies.OYOGrenadeCommon")
	public static OYOGrenadeCommon proxy;
	// Here is where you can declare the items and blocks you will create

	// All of the following methods are called in the order you see them here.
	// First PreInit, then Init, and finally PostInit
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		oyoGrenade = new OYOGrenade().setUnlocalizedName("oyoGrenade");
		EntityRegistry.registerModEntity(EntityOYOGrenade.class, "OYOGrenade", 4, this, 80, 3, true);
		// This is where you tell Minecraft what items or blocks
		// you are going to be making and bringing into the world.
		
		// You need to tell Minecraft the names and all the properties.
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerItem(oyoGrenade, oyoGrenade.getUnlocalizedName());
		
		proxy.registerRenderThings();
		proxy.registerSounds();
		
		GameRegistry.addRecipe(new ItemStack(oyoGrenade), new Object[]{" D ",
																	   "DDD",
																	   " D ",
																	   'D', Items.diamond});
		
		// This is where you can create code to say how the player
		// can interact with the block, for example you need to add
		// a recipe for a block here

	}
	
	@EventHandler 
	public void postInit(FMLPostInitializationEvent event) {
		// This is where you can write code to interact with other mods.
		// Last to be called.
	}
}