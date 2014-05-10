package com.imposterinc.mechanictinkerer;

import com.imposterinc.mechanictinkerer.gui.GuiHandler;

import cpw.mods.fml.common.network.NetworkRegistry;

public class CommonProxy 
{
    public void registerRenderers() 
    {
            // Nothing here as the server doesn't render graphics or entities!
    }
    
    public void registerNetworkStuff(){
		NetworkRegistry.INSTANCE.registerGuiHandler(MechanicTinkerer.instance, new GuiHandler());
	}

	public void registerTileEntities(){
	}
}
