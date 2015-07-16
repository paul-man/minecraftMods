package me.kidOYO.OYOBush;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.kidOYO.OYOreMod.OYOreMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class BlockOYOBerry extends RecipeBlockCrops{

//	@SideOnly(Side.CLIENT)
//	private IIcon[] icons;
	public BlockOYOBerry() {
		this.setBlockName("OyoBush");
		this.setBlockTextureName("obm:oyoBerries_0");
		this.setCreativeTab(OYOreMod.oyoTab);
	}

	@Override
	public int quantityDropped(int parMetadata, int parFortune, Random parRand) {
		return (parMetadata/2);
	}

	@Override
	public Item getItemDropped(int parMetadata, Random parRand, int parFortune) {
		// DEBUG
		System.out.println("BlockBlueberry getItemDropped()");
		return (OYOBushMod.oyoBerry);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister parIIconRegister) {
		icons = new IIcon[maxGrowthStage+1];
		// seems that crops like to have 8 growth icons, but okay to repeat actual texture if you want

		// to make generic should loop to maxGrowthStage
		icons[0] = parIIconRegister.registerIcon("obm:oyoBerry_0");
		icons[1] = parIIconRegister.registerIcon("obm:oyoBerry_0");
		icons[2] = parIIconRegister.registerIcon("obm:oyoBerry_1");
		icons[3] = parIIconRegister.registerIcon("obm:oyoBerry_1");
		icons[4] = parIIconRegister.registerIcon("obm:oyoBerry_2");
		icons[5] = parIIconRegister.registerIcon("obm:oyoBerry_2");
		icons[6] = parIIconRegister.registerIcon("obm:oyoBerry_3");
		icons[7] = parIIconRegister.registerIcon("obm:oyoBerry_3");
	}
}



