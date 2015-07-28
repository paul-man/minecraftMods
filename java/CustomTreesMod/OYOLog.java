package me.kidOYO.CustomTreesMod;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class OYOLog extends BlockLog {
	public static final String[] logs = new String[] {"redwood", "whitewood", "brownwood", "tanwood"};
	//private static final String __OBFID = "CL_00000281";


	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs tab, List list)
	{
		list.add(new ItemStack(item, 1, 0));
		list.add(new ItemStack(item, 1, 1));
		list.add(new ItemStack(item, 1, 2));
		list.add(new ItemStack(item, 1, 3));
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconReg)
	{
		this.field_150167_a = new IIcon[logs.length];
		this.field_150166_b = new IIcon[logs.length];

		for (int i = 0; i < this.field_150167_a.length; i++)
		{
			this.field_150167_a[i] = iconReg.registerIcon(this.getTextureName() + "_" + logs[i]);
			this.field_150166_b[i] = iconReg.registerIcon(this.getTextureName() + "_" + logs[i] + "_top");
		}
	}
}
