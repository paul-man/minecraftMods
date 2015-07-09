package me.kidOYO.OYOGrenadeMod;

import net.minecraft.client.renderer.entity.RenderSnowball;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class OYOGrenadeClient extends OYOGrenadeCommon{
	@Override
	public void registerRenderThings()
	{
	RenderingRegistry.registerEntityRenderingHandler(EntityOYOGrenade.class, new RenderSnowball(OYOGrenadeMod.oyoGrenade));
	}

	@Override
	public void registerSounds() {}
}
