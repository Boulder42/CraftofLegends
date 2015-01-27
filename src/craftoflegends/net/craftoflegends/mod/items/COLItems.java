package net.craftoflegends.mod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.craftoflegends.mod.CraftofLegends;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class COLItems extends Item{

	public COLItems() {
		this.setCreativeTab(CraftofLegends.craftoflegendsTab);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(CraftofLegends.modid + ":" + this.getUnlocalizedName().substring(5));
	}
}
