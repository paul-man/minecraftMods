package me.kidOYO.OyoOre;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OyoOre extends Block {
	private Item drop;
	private int meta;
	private int lowerBound;
	private int upperBound;

	public OyoOre(Material material, String name, Item drop, int meta, int lowerBound, int upperBound) {
		super(material);
		this.setBlockName(name);
		this.setBlockTextureName("oom:oyoOre");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setStepSound(soundTypeStone);
        this.setHardness(1.0f);
        this.setResistance(1.0f);
        //this.setHarvestLevel("pickaxe", 2);
        
        //For the item drop info
        this.drop = drop;
        this.meta = meta;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        
	}
	
	@Override
	public Item getItemDropped(int meta, Random random, int fortune) {
	    return this.drop;
	}

	@Override
	public int damageDropped(int metadata) {
	    return this.meta;
	}

	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
	    if (this.lowerBound >= this.upperBound)
	        return this.lowerBound;
	    return this.lowerBound + random.nextInt(this.upperBound - this.lowerBound + fortune + 1);
	}
	
}
