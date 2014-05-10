package com.imposterinc.mechanictinkerer.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.imposterinc.mechanictinkerer.container.ContainerVehicleAssembler;
import com.imposterinc.mechanictinkerer.tileentity.TileEntityVehicleAssemblerBench;

public class GuiVehicleAssembler extends GuiContainer
{
	private static final ResourceLocation guiTexture = new ResourceLocation("textures/gui/crafting_table.png");

	public GuiVehicleAssembler(Container container) 
	{
		super(container);
	}
	
	public GuiVehicleAssembler(InventoryPlayer playerInventory, TileEntityVehicleAssemblerBench vehicleAssemblerBench)
	{
		super(new ContainerVehicleAssembler(playerInventory, vehicleAssemblerBench));
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		 GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	        this.mc.getTextureManager().bindTexture(guiTexture);
	        int k = (this.width - this.xSize) / 2;
	        int l = (this.height - this.ySize) / 2;
	        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
	}

}
