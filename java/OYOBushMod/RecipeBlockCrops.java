package me.kidOYO.OYOBush;

import java.util.Random;

import me.kidOYO.OYOreMod.OYOreMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class RecipeBlockCrops extends BlockBush implements IGrowable{

	protected int maxGrowthStage = 7;

	@SideOnly(Side.CLIENT)
	protected IIcon[] icons;

	protected RecipeBlockCrops() {
		super(Material.plants);
		setTickRandomly(true);
		float f = 0.5F;
		setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
		setCreativeTab(OYOreMod.oyoTab);
		setHardness(0.0F);
		setStepSound(soundTypeGrass);
		disableStats();
	}


	@Override 
	protected boolean canPlaceBlockOn(Block parBlock) {
		return parBlock == Blocks.farmland;
	}

	public void incrementGrowthStage(World world, Random rand, int x, int y, int z) {
		int growStage = world.getBlockMetadata(x, y, z) + 

				MathHelper.getRandomIntegerInRange(rand, 2, 5);

		if (growStage > maxGrowthStage)	{
			growStage = maxGrowthStage;
		}

		world.setBlockMetadataWithNotify(x, y, z, growStage, 2);
	}


	@Override
	public Item getItemDropped(int p_149650_1_, Random parRand, int parFortune)  {
		return Item.getItemFromBlock(this);
	}



	/**
	 * The type of render function that is called for this block
	 */
	@Override
	public int getRenderType() {
		return 1; // Cross like flowers
	}



	/**
	 * Gets the block's texture. Args: side, meta
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int parSide, int parGrowthStage) {
		return icons[parGrowthStage];
	}



	/**
	 * Ticks the block if it's been scheduled
	 */
	@Override
	public void updateTick(World parWorld, int parX, int parY, int parZ, Random parRand) {
		super.updateTick(parWorld, parX, parY, parZ, parRand);
		int growStage = parWorld.getBlockMetadata(parX, parY, parZ) + 1;

		if (growStage > 7) {
			growStage = 7;
		}

		parWorld.setBlockMetadataWithNotify(parX, parY, parZ, growStage, 2);
	}


	@Override
	// checks if finished growing (a grow stage of 7 is final stage)
	public boolean func_149851_a(World parWorld, int parX, int parY, int parZ, boolean p_149851_5_)  {
		return parWorld.getBlockMetadata(parX, parY, parZ) != 7;
	}


	@Override
	public boolean func_149852_a(World p_149852_1_, Random parRand, int p_149852_3_, int p_149852_4_, int p_149852_5_) {
		return true;
	}


	@Override
	public void func_149853_b(World parWorld, Random parRand, int parX, int parY, int parZ) {
		incrementGrowthStage(parWorld, parRand, parX, parY, parZ);
	}


}
