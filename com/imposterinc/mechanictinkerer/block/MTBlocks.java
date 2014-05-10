package com.imposterinc.mechanictinkerer.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.imposterinc.mechanictinkerer.MechanicTinkerer;

import cpw.mods.fml.common.registry.GameRegistry;

public class MTBlocks 
{
	public static Block vehicleAssemblerTable;
    public static Block vehicleAssemblerCore;
    public static Block vehicleAssemblerBench;
	
	public static void register()
	{
		initialiseBlocks();
		registerBlocks();
	}
	
	public static void initialiseBlocks()
	{
		vehicleAssemblerTable = new BlockMechanicTinkerer(Material.iron).setBlockName("vehicleAssemblerTable").setBlockTextureName(MechanicTinkerer.modid + ":" + "Device_Side");
    	vehicleAssemblerCore = new BlockVehicleAssemblerTableCore().setBlockName("vehicleAssemblerTableCore");
        vehicleAssemblerBench = new BlockVehicleAssemblerBench().setBlockName("vehicleAssemblerBench");
	}
	
	public static void registerBlocks()
	{
		GameRegistry.registerBlock(vehicleAssemblerTable, "vehicleAssemblerTable");
    	GameRegistry.registerBlock(vehicleAssemblerCore, "vehicleAssemblerTableCore");
    	GameRegistry.registerBlock(vehicleAssemblerBench, "vehicleAssemblerBench");
	}

}
