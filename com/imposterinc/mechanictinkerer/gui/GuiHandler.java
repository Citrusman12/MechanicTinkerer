package com.imposterinc.mechanictinkerer.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.imposterinc.mechanictinkerer.container.ContainerVehicleAssembler;
import com.imposterinc.mechanictinkerer.tileentity.TileEntityVehicleAssemblerBench;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler 
{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == 0)
		{
			TileEntityVehicleAssemblerBench tileEntityFurnace = (TileEntityVehicleAssemblerBench) world.getTileEntity(x, y, z);
			return new ContainerVehicleAssembler(player.inventory, tileEntityFurnace);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == 0)
		{
			TileEntityVehicleAssemblerBench tileEntityVehicleAssembler = (TileEntityVehicleAssemblerBench) world.getTileEntity(x, y, z);
			return new GuiVehicleAssembler(player.inventory, tileEntityVehicleAssembler);
		}
		return null;
	}

}
