package com.imposterinc.mechanictinkerer.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.imposterinc.mechanictinkerer.MechanicTinkerer;
import com.imposterinc.mechanictinkerer.tileentity.TileEntityVehicleAssemblerBench;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockVehicleAssemblerBench extends BlockContainer 
{
	
	private TileEntityVehicleAssemblerBench tileEntityBench;
	private int lastProgressTime;
	private int lastBurnTime;
	private int lastItemBurnTime;
	
	public static final int INPUT[] = {0,1,2,3,4,5,6};
	public static final int DISCHARGE[] = {7,8,9,10,11,12,13};
	
	@SideOnly(Side.CLIENT)
	protected IIcon tableTop;
	protected IIcon tableSide;
	
	public BlockVehicleAssemblerBench()
	{
		super(Material.iron);
		this.setCreativeTab(MechanicTinkerer.tabMechanicTinkerer);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register)
	{
		tableTop = register.registerIcon(MechanicTinkerer.modid + ":" + "crafting_table_top");
		tableSide = register.registerIcon(MechanicTinkerer.modid + ":" + "crafting_table_side");
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata)
	{
		if (side == 1) 
		{
			return tableTop;
		}
		else
		{
			return tableSide;
		}
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) 
	{
		player.openGui(MechanicTinkerer.instance, 0, world, x, y, z);
		return true;
	}
	
	public TileEntity createNewTileEntity(World world, int par2)
    {
        return new TileEntityVehicleAssemblerBench();
    }
}
