package com.imposterinc.mechanictinkerer.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.imposterinc.mechanictinkerer.MechanicTinkerer;

public class BlockMechanicTinkerer extends Block 
{

	public BlockMechanicTinkerer(Material material)
	{
		super(material);
		this.setCreativeTab(MechanicTinkerer.tabMechanicTinkerer);
	}
}
