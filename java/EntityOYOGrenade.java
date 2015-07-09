package me.kidOYO.OYOGrenadeMod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;

public class EntityOYOGrenade extends EntityThrowable {
	

	public EntityOYOGrenade(World world) {
		super(world);
	}

	public EntityOYOGrenade(World world, EntityPlayer player) {
		super(world, player);
	}

	@Override
	protected void onImpact(MovingObjectPosition mop) {
		
		if (mop.typeOfHit == MovingObjectType.BLOCK || mop.typeOfHit == MovingObjectType.ENTITY) {
			
			switch(mop.sideHit) {
			case 0: // BOTTOM
				mop.blockY--;
				break;
			case 1: // TOP
				mop.blockY++;
				break;
			case 2: // EAST
				mop.blockX--;
				break;
			case 3: // WEST
				mop.blockX++;
				break;
			case 4: // NORTH
				mop.blockZ--;
				break;
			case 5: // SOUTH
				mop.blockZ++;
				break;
			}
			
			this.worldObj.newExplosion(this, mop.blockX, mop.blockY, mop.blockZ, 2.0F, true, true);
		}
		if (!this.worldObj.isRemote) {
			this.setDead();
		}
	}


}
