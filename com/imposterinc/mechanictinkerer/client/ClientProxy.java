package com.imposterinc.mechanictinkerer.client;

import com.imposterinc.mechanictinkerer.CommonProxy;
import com.imposterinc.mechanictinkerer.entity.EntityCar;
import com.imposterinc.mechanictinkerer.model.ModelCar;
import com.imposterinc.mechanictinkerer.render.RenderCar;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy 
{
        
        @Override
        public void registerRenderers() 
        {
    		RenderingRegistry.registerEntityRenderingHandler(EntityCar.class, new RenderCar(new ModelCar(), 0));
        }
        
}
