package me.kidOYO.OYOMod;

//import me.kidOYO.OYOreMod.OYOreMod;
import net.minecraft.item.ItemSword;

public class OyoSword extends ItemSword {

	public OyoSword(ToolMaterial toolMaterial) {
		super(toolMaterial);
		this.setUnlocalizedName("OyoSword");
		this.setTextureName("oom:oyoSword");
		this.setCreativeTab(OYOMod.oyoTab);
	}

}
