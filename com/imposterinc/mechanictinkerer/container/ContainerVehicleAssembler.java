package com.imposterinc.mechanictinkerer.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

import com.imposterinc.mechanictinkerer.tileentity.TileEntityVehicleAssemblerBench;

public class ContainerVehicleAssembler extends Container
{
	private TileEntityVehicleAssemblerBench vehicleAssemblerBench;
	
	public ContainerVehicleAssembler(InventoryPlayer playerInventory, TileEntityVehicleAssemblerBench tileEntityVehicleAssemblerBench)
	{
		this.vehicleAssemblerBench = tileEntityVehicleAssemblerBench;
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return true;
	}

}
