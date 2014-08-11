package com.paul19988.moretoolsmod;

import com.paul19988.moretoolsmod.crafting.CraftingRecipies;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MoreToolsMod.MODID, version = MoreToolsMod.VERSION)
public class MoreToolsMod
{
    public static final String MODID = "MoreToolsMod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	Materials.initTools();
   
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        CraftingRecipies.init();
    }
}
