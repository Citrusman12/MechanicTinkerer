package com.imposterinc.mechanictinkerer.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.imposterinc.mechanictinkerer.MechanicTinkerer;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockVehicleAssemblerTableCore extends Block 
{
	
	boolean multiblock = false;
	
	@SideOnly(Side.CLIENT)
	protected IIcon tableTop;
	@SideOnly(Side.CLIENT)
	protected IIcon tableSide;
	@SideOnly(Side.CLIENT)
	protected IIcon tableBottom;
	
	public BlockVehicleAssemblerTableCore() 
	{
		super(Material.iron);
		this.setCreativeTab(MechanicTinkerer.tabMechanicTinkerer);
	}

	public int onBlockPlaced(World world, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9) 
	{
		isMultiBlock(world, par2, par3, par4, par5, par6, par7, par8, par9);
		return 1;
	}
	
	public void onPostBlockPlaced(World world, int par2, int par3, int par4, int par5)
	{
		if (multiblock)
		{
			world.setBlock(par2, par3, par4, Blocks.air);
		}
	}
	
	
	public boolean isMultiBlock(World world, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
	{
		if(		world.getBlock(par2 - 1, par3 - 1, par4 - 1) == MTBlocks.vehicleAssemblerTable &&
				world.getBlock(par2 - 1, par3, par4 - 1) == MTBlocks.vehicleAssemblerTable &&
				world.getBlock(par2 - 1, par3 + 1, par4 - 1) == MTBlocks.vehicleAssemblerTable &&

				world.getBlock(par2 - 1, par3 - 1, par4) == MTBlocks.vehicleAssemblerTable &&
				world.getBlock(par2 - 1, par3, par4) == Blocks.furnace &&
				world.getBlock(par2 - 1, par3 + 1, par4) == MTBlocks.vehicleAssemblerTable &&
				
				world.getBlock(par2 - 1, par3 - 1, par4 + 1) == MTBlocks.vehicleAssemblerTable &&
				world.getBlock(par2 - 1, par3, par4 + 1) == MTBlocks.vehicleAssemblerTable &&
				world.getBlock(par2 - 1, par3 + 1, par4 + 1) == MTBlocks.vehicleAssemblerTable &&

				world.getBlock(par2, par3 - 1, par4 - 1) == MTBlocks.vehicleAssemblerTable &&
				world.getBlock(par2, par3, par4 - 1) == Blocks.furnace &&
				world.getBlock(par2, par3 + 1, par4 - 1) == MTBlocks.vehicleAssemblerTable &&
				
				world.getBlock(par2, par3 - 1, par4 + 1) == MTBlocks.vehicleAssemblerTable &&
				world.getBlock(par2, par3, par4 + 1) == Blocks.furnace &&
				world.getBlock(par2, par3 + 1, par4 + 1) == MTBlocks.vehicleAssemblerTable &&
				
				world.getBlock(par2 + 1, par3 - 1, par4 - 1) == MTBlocks.vehicleAssemblerTable &&
				world.getBlock(par2 + 1, par3, par4 - 1) == MTBlocks.vehicleAssemblerTable &&
				world.getBlock(par2 + 1, par3 + 1, par4 - 1) == MTBlocks.vehicleAssemblerTable &&
				
				world.getBlock(par2, par3 - 1, par4) == Blocks.furnace &&
				
				world.getBlock(par2 + 1, par3 - 1, par4) == MTBlocks.vehicleAssemblerTable &&
				world.getBlock(par2 + 1, par3, par4) == Blocks.furnace &&
				world.getBlock(par2 + 1, par3 + 1, par4) == MTBlocks.vehicleAssemblerTable &&
				
				world.getBlock(par2 + 1, par3 - 1, par4 + 1) == MTBlocks.vehicleAssemblerTable &&
				world.getBlock(par2 + 1, par3, par4 + 1) == MTBlocks.vehicleAssemblerTable &&	
				world.getBlock(par2 + 1, par3 + 1, par4 + 1) == MTBlocks.vehicleAssemblerTable)
				
	    {
	      multiblock = true;
	      createStructure(world, par2, par3, par4);
	    }
	    else
	    {
	    	multiblock = false;
	    }
		return multiblock;
	}
	
	public void createStructure(World world, int par2, int par3, int par4)
	{
		int x,y,z;
		for (x=-1;x<=1;x++) 
		{
			for (y=-1;y<=1;y++) 
			{
				for (z=-1;z<=1;z++) 
				{
					world.setBlock(par2 + x, par3 + y, par4 + z, Blocks.air);
				}
			}
		}

		world.setBlock(par2, par3 - 1, par4, MTBlocks.vehicleAssemblerBench);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister register)
	{
		tableTop = register.registerIcon(MechanicTinkerer.modid + ":" + "vehicle_assembly_bench_top");
		tableSide = register.registerIcon(MechanicTinkerer.modid + ":" + "vehicle_assembly_bench_side");
		tableBottom = register.registerIcon(MechanicTinkerer.modid + ":" + "vehicle_assembly_bench_bottom");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int metadata) 
	{
		if (side == 1) 
		{
			return tableTop;
		}
		else if (side == 0)
		{
			return tableBottom;
		}
		else
		{
			return tableSide;
		}
	}
	
}
