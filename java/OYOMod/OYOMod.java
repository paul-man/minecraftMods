package me.kidOYO.OYOMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid="om", name="OYO Mod", version="1.0")
public class OYOMod {
	
	public static Item oyoDust;
	public static Item oyoIngot;
	public static ToolMaterial OYOMATERIAL;
	public static ItemSword oyoSword;
	
	public static CreativeTabs oyoTab = new CreativeTabs("OyoOreMod") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return oyoDust;
	    }
	};
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		OYOMATERIAL = EnumHelper.addToolMaterial("OYOMATERIAL", 1, 1200, 2.0F, 15, 300);
		oyoDust = new OYODust();
		oyoIngot = new OyoIngot();
		oyoSword = new OyoSword(OYOMATERIAL);
		
		GameRegistry.registerItem(oyoDust, oyoDust.getUnlocalizedName().substring(5));		
		GameRegistry.registerItem(oyoIngot, oyoIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(oyoSword,  oyoSword.getUnlocalizedName().substring(5));
		
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

		
		GameRegistry.addSmelting(oyoDust, new ItemStack(oyoIngot, 2), 5);
		GameRegistry.addRecipe(new ItemStack(oyoSword, 1), new Object[]{" O ",
																		" O ",
																		" S ", 'O', oyoIngot, 'S', Items.stick
		});

	}

	@EventHandler 
	public void postInit(FMLPostInitializationEvent event) {



	}

}
