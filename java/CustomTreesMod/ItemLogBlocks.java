package me.kidOYO.CustomTreesMod;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemLogBlocks extends ItemBlock {

	public static final String[] logs = new String[] {"redwood", "whitewood", "brownwood", "tanwood"};
	public ItemLogBlocks(Block block) {
		super(block);
		this.setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack itemStack) {
		int i = itemStack.getItemDamage();
		if (i < 0 || i >= logs.length) {
			i = 0;
		}
		
		return super.getUnlocalizedName() + "." + logs[i];
    }

}
