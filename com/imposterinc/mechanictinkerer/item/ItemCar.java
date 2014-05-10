package com.imposterinc.mechanictinkerer.item;


import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import com.imposterinc.mechanictinkerer.MechanicTinkerer;

public class ItemCar extends Item 
{
	public ItemCar()
	{
		this.maxStackSize = 1;
		this.setCreativeTab(MechanicTinkerer.tabMechanicTinkerer);
	}
	
}
