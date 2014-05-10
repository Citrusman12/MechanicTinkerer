package com.imposterinc.mechanictinkerer;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.imposterinc.mechanictinkerer.block.MTBlocks;
import com.imposterinc.mechanictinkerer.entity.EntityCar;
import com.imposterinc.mechanictinkerer.item.ItemCar;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid=MechanicTinkerer.modid, name="Mechanic Tinkerer", version=MechanicTinkerer.version)
public class MechanicTinkerer 
{
	public static final String modid = "MechanicTinkerer";
	public static final String version = "MC 1.7.2";
	
	@Instance(value = "MechanicTinkerer")
    public static MechanicTinkerer instance;
    
    @SidedProxy(clientSide="com.imposterinc.mechanictinkerer.client.ClientProxy", serverSide="com.imposterinc.mechanictinkerer.CommonProxy")
    public static CommonProxy proxy;
    
    public static Item car;
	
    public static CreativeTabs tabMechanicTinkerer = new CreativeTabs("tabMechanicTinkerer")
    {
    	public Item getTabItemIcon() 
    	{
    		return Items.minecart;
    	}

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() 
		{
			return Items.minecart;
		}
    };
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) 
    {
    	MTBlocks.register();
    	
    	car = new ItemCar().setUnlocalizedName("car").setTextureName(modid + ":" + "car");
    	
    	EntityRegistry.registerGlobalEntityID(EntityCar.class, "Car", 7890);
    	EntityRegistry.registerModEntity(EntityCar.class, "Car", 7890, MechanicTinkerer.instance, 64, 1, true);
    	EntityList.entityEggs.put(Integer.valueOf(7890), new EntityList.EntityEggInfo(7890, 0x11111, 0x21312));
    	
    	GameRegistry.registerItem(car, car.getUnlocalizedName().substring(5));
    	
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event) 
    {
            proxy.registerRenderers();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) 
    {
    
    }
    
}
