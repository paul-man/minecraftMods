package me.kidOYO.OYOBush;

import me.kidOYO.OYOreMod.OYOreMod;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemFood;

public class OyoBerry extends RecipeItemSeed {


	public OyoBerry() {
		super(1, 0.3F, OYOBushMod.blockOYOBerry, Blocks.farmland);
		setUnlocalizedName("OyoBerry");
		setTextureName("obm:oyoBerry");
		setCreativeTab(OYOreMod.oyoTab);
	}


}
