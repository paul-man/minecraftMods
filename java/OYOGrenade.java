package me.kidOYO.OYOGrenadeMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class OYOGrenade extends  Item {
	
	public OYOGrenade() {
		//this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setMaxStackSize(2);
		this.setTextureName("ogm:oyoGrenade");
	}
	
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
		if (!world.isRemote) {
			world.spawnEntityInWorld(new EntityOYOGrenade(world, player));
			--itemStack.stackSize;
		}
		return itemStack;
	}
	
	public boolean hasEffect(ItemStack itemStack, int pass) {
		return true;
	}
}
