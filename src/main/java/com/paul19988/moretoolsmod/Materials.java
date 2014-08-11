package com.paul19988.moretoolsmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.paul19988.moretoolsmod.items.ItemRedstonePickaxe;
import com.paul19988.moretoolsmod.items.ItemRedstoneSpade;
import com.paul19988.moretoolsmod.items.ItemRedstoneAxe;
import com.paul19988.moretoolsmod.items.ItemRedstoneSword;
import com.paul19988.moretoolsmod.items.ItemRedstoneHoe;

import cpw.mods.fml.common.registry.GameRegistry;

public class Materials {

	public static Item ItemRedstonePickaxe;
	public static Item ItemRedstoneSpade;
	public static Item ItemRedstoneAxe;
	public static Item ItemRedstoneSword;
	public static Item ItemRedstoneHoe;

	public static ToolMaterial enumToolMaterialRedstone = EnumHelper.addToolMaterial("REDSTONE", 3, 1700, 100.0F, 10.0F, 30);


	public static void initTools()
	{
		ItemRedstonePickaxe = new ItemRedstonePickaxe(enumToolMaterialRedstone).setUnlocalizedName("redstonePickaxe").setCreativeTab(CreativeTabs.tabTools);
		GameRegistry.registerItem(ItemRedstonePickaxe, "redstonePickaxe");
		
		ItemRedstoneSpade = new ItemRedstoneSpade(enumToolMaterialRedstone).setUnlocalizedName("redstoneSpade").setCreativeTab(CreativeTabs.tabTools);
		GameRegistry.registerItem(ItemRedstoneSpade, "redstoneSpade");
		
		ItemRedstoneAxe = new ItemRedstoneAxe(enumToolMaterialRedstone).setUnlocalizedName("redstoneAxe").setCreativeTab(CreativeTabs.tabTools);
		GameRegistry.registerItem(ItemRedstoneAxe, "redstoneAxe");
		
		ItemRedstoneSword = new ItemRedstoneSword(enumToolMaterialRedstone).setUnlocalizedName("redstoneSword").setCreativeTab(CreativeTabs.tabCombat);
		GameRegistry.registerItem(ItemRedstoneSword, "redstoneSword");
		
		ItemRedstoneHoe = new ItemRedstoneHoe(enumToolMaterialRedstone).setUnlocalizedName("redstoneHoe").setCreativeTab(CreativeTabs.tabTools);
		GameRegistry.registerItem(ItemRedstoneHoe, "redstoneHoe");
	}
}