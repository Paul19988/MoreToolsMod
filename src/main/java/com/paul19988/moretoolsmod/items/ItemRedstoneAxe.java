package com.paul19988.moretoolsmod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ItemRedstoneAxe extends ItemAxe{
	
	   public ItemRedstoneAxe(Item.ToolMaterial mat){
		   super(mat);
	   }

	   @SideOnly(Side.CLIENT)
	   public void registerIcons(IIconRegister reg) {
		   this.itemIcon = reg.registerIcon("moretoolsmod:redstoneAxe");
	   }

}
