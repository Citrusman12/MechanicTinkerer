package com.imposterinc.mechanictinkerer.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.imposterinc.mechanictinkerer.entity.EntityCar;
import com.imposterinc.mechanictinkerer.model.ModelCar;

public class RenderCar extends RenderLiving
{
	private static final ResourceLocation carTextures = new ResourceLocation("textures/entity/boat.png");

    protected ModelBase modelCar;
    private static final String __OBFID = "CL_00000984";

    public RenderCar(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityCar par1EntityCar)
    {
        return carTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityCar)par1Entity);
    }
}
