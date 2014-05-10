package com.imposterinc.mechanictinkerer.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEntityVehicleAssemblerBench extends TileEntity implements ISidedInventory
{
	
	public int getInventoryStackLimit()
    {
        return 64;
    }
	
	@Override
	public boolean isUseableByPlayer(EntityPlayer player) 
	{
		return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : player.getDistanceSq((double) this.xCoord + 0.5D, (double) this.yCoord + 0.5D, (double) this.zCoord + 0.5D) <= 64.0D;
	}
	
	@Override
	public void closeInventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ItemStack decrStackSize(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getInventoryName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSizeInventory() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ItemStack getStackInSlot(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasCustomInventoryName() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isItemValidForSlot(int arg0, ItemStack arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void openInventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setInventorySlotContents(int arg0, ItemStack arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canExtractItem(int arg0, ItemStack arg1, int arg2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canInsertItem(int arg0, ItemStack arg1, int arg2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int[] getAccessibleSlotsFromSide(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}
