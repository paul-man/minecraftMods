package me.kidOYO.MyFirstMod;

import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid="mfm", name="My First Mod", version="1.0")
public class MyFirstMod {
	
	public static Item myItem;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		myItem = new MyItem();
		
		GameRegistry.registerItem(myItem, myItem.getUnlocalizedName().substring(5));
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {


	}

	@EventHandler 
	public void postInit(FMLPostInitializationEvent event) {

	}

}
