package com.imposterinc.mechanictinkerer.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCar extends ModelBase
{

	public ModelRenderer[] carSides = new ModelRenderer[5];
    private static final String __OBFID = "CL_00000832";

    public ModelCar()
    {
        this.carSides[0] = new ModelRenderer(this, 0, 8);
        this.carSides[1] = new ModelRenderer(this, 0, 0);
        this.carSides[2] = new ModelRenderer(this, 0, 0);
        this.carSides[3] = new ModelRenderer(this, 0, 0);
        this.carSides[4] = new ModelRenderer(this, 0, 0);
        byte var1 = 24;
        byte var2 = 6;
        byte var3 = 20;
        byte var4 = 4;
        this.carSides[0].addBox((float)(-var1 / 2), (float)(-var3 / 2 + 2), -3.0F, var1, var3 - 4, 4, 0.0F);
        this.carSides[0].setRotationPoint(0.0F, (float)var4, 0.0F);
        this.carSides[1].addBox((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
        this.carSides[1].setRotationPoint((float)(-var1 / 2 + 1), (float)var4, 0.0F);
        this.carSides[2].addBox((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
        this.carSides[2].setRotationPoint((float)(var1 / 2 - 1), (float)var4, 0.0F);
        this.carSides[3].addBox((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
        this.carSides[3].setRotationPoint(0.0F, (float)var4, (float)(-var3 / 2 + 1));
        this.carSides[4].addBox((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
        this.carSides[4].setRotationPoint(0.0F, (float)var4, (float)(var3 / 2 - 1));
        this.carSides[0].rotateAngleX = ((float)Math.PI / 2F);
        this.carSides[1].rotateAngleY = ((float)Math.PI * 3F / 2F);
        this.carSides[2].rotateAngleY = ((float)Math.PI / 2F);
        this.carSides[3].rotateAngleY = (float)Math.PI;
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        for (int var8 = 0; var8 < 5; ++var8)
        {
            this.carSides[var8].render(par7);
        }
    }
}
