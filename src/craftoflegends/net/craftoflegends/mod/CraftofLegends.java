package net.craftoflegends.mod;

import net.craftoflegends.mod.blocks.BronzeBlock;
import net.craftoflegends.mod.blocks.CopperBlock;
import net.craftoflegends.mod.blocks.CopperOre;
import net.craftoflegends.mod.blocks.CrystalBlock;
import net.craftoflegends.mod.blocks.CrystalOre;
import net.craftoflegends.mod.blocks.ManganeseBlock;
import net.craftoflegends.mod.blocks.ManganeseOre;
import net.craftoflegends.mod.blocks.PainiteBlock;
import net.craftoflegends.mod.blocks.PainiteOre;
import net.craftoflegends.mod.blocks.SteelBlock;
import net.craftoflegends.mod.blocks.TinBlock;
import net.craftoflegends.mod.blocks.TinOre;
import net.craftoflegends.mod.blocks.VaniteBlock;
import net.craftoflegends.mod.blocks.VaniteOre;
import net.craftoflegends.mod.items.COLItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;



@Mod(modid = CraftofLegends.modid, version = CraftofLegends.version)
public class CraftofLegends {
	
	public static final String modid = "CraftofLegends";
	public static final String version = "0.0.1";
	
	public static CreativeTabs craftoflegendsTab;
	
	//Items
	public static Item itemBronzeIngot;
	public static Item itemCopperIngot;
	public static Item itemCrystalShard;
	public static Item itemManganeseIngot;
	public static Item itemPainisteelIngot;
	public static Item itemPainiteGem;
	public static Item itemSteelIngot;
	public static Item itemTinIngot;
	public static Item itemVanisteelIngot;
	public static Item itemVaniteGem;
	
	//Blocks
	public static Block oreCopperOre;
	public static Block oreCrystalOre;
	public static Block oreManganeseOre;
	public static Block orePainiteOre;
	public static Block oreTinOre;
	public static Block oreVaniteOre;
	
	public static Block blockCopperBlock;
	public static Block blockBronzeBlock;
	public static Block blockCrystalBlock;
	public static Block blockManganeseBlock;
	public static Block blockPainiteBlock;
	public static Block blockSteelBlock;
	public static Block blockTinBlock;
	public static Block blockVaniteBlock;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent){
		
		craftoflegendsTab = new CreativeTabs("Craft of Legends") {
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem() {
				return Item.getItemFromBlock(CraftofLegends.oreCopperOre);
			}
		};
		
		//Names
		
		//Blocks
		oreCopperOre = new CopperOre(Material.rock).setBlockName("CopperOre");
		oreCopperOre = new CrystalOre(Material.rock).setBlockName("CrystalOre");
		oreCopperOre = new ManganeseOre(Material.rock).setBlockName("ManganeseOre");
		oreCopperOre = new PainiteOre(Material.rock).setBlockName("PainiteOre");
		oreCopperOre = new TinOre(Material.rock).setBlockName("TinOre");
		oreCopperOre = new VaniteOre(Material.rock).setBlockName("VaniteOre");
		
		blockCopperBlock = new CopperBlock(Material.iron).setBlockName("CopperBlock");
		blockCopperBlock = new BronzeBlock(Material.iron).setBlockName("BronzeBlock");
		blockCopperBlock = new CrystalBlock(Material.iron).setBlockName("CrystalBlock");
		blockCopperBlock = new ManganeseBlock(Material.iron).setBlockName("ManganeseBlock");
		blockCopperBlock = new PainiteBlock(Material.iron).setBlockName("PainiteBlock");
		blockCopperBlock = new SteelBlock(Material.iron).setBlockName("SteelBlock");
		blockCopperBlock = new TinBlock(Material.iron).setBlockName("TinBlock");
		blockCopperBlock = new VaniteBlock(Material.iron).setBlockName("VaniteBlock");
		
		//Items
		itemBronzeIngot = new COLItems().setUnlocalizedName("BronzeIngot");
		itemCopperIngot = new COLItems().setUnlocalizedName("CopperIngot");
		itemCrystalShard = new COLItems().setUnlocalizedName("CrystalShard");
		itemManganeseIngot = new COLItems().setUnlocalizedName("ManganeseIngot");
		itemPainisteelIngot = new COLItems().setUnlocalizedName("PainisteelIngot");
		itemPainiteGem = new COLItems().setUnlocalizedName("PainiteGem");
		itemSteelIngot = new COLItems().setUnlocalizedName("SteelIngot");
		itemTinIngot = new COLItems().setUnlocalizedName("TinIngot");
		itemVanisteelIngot = new COLItems().setUnlocalizedName("VanisteelIngot");
		itemVaniteGem = new COLItems().setUnlocalizedName("VaniteGem");
		
		//Registry
		
		//Blocks
		GameRegistry.registerBlock(oreCopperOre, "CopperOre");
		GameRegistry.registerBlock(oreCrystalOre, "CrystalOre");
		GameRegistry.registerBlock(oreManganeseOre, "ManganeseOre");
		GameRegistry.registerBlock(orePainiteOre, "PainiteOre");
		GameRegistry.registerBlock(oreTinOre, "TinOre");
		GameRegistry.registerBlock(oreVaniteOre, "VaniteOre");
		
		GameRegistry.registerBlock(blockCopperBlock, "CopperBlock");
		GameRegistry.registerBlock(blockBronzeBlock, "BronzeBlock");
		GameRegistry.registerBlock(blockCrystalBlock, "CrystalBlock");
		GameRegistry.registerBlock(blockManganeseBlock, "ManganeseBlock");
		GameRegistry.registerBlock(blockPainiteBlock, "PainiteBlock");
		GameRegistry.registerBlock(blockSteelBlock, "SteelBlock");
		GameRegistry.registerBlock(blockTinBlock, "TinBlock");
		GameRegistry.registerBlock(blockVaniteBlock, "VaniteBlock");
		
		
		//Items
		GameRegistry.registerItem(itemBronzeIngot, "BronzeIngot");
		GameRegistry.registerItem(itemCopperIngot, "CopperIngot");
		GameRegistry.registerItem(itemCrystalShard, "CrystalShard");
		GameRegistry.registerItem(itemManganeseIngot, "ManganeseIngot");
		GameRegistry.registerItem(itemPainisteelIngot, "PainisteelIngot");
		GameRegistry.registerItem(itemPainiteGem, "PainiteGem");
		GameRegistry.registerItem(itemSteelIngot, "SteelIngot");
		GameRegistry.registerItem(itemTinIngot, "TinIngot");
		GameRegistry.registerItem(itemVanisteelIngot, "VanisteelIngot");
		GameRegistry.registerItem(itemVaniteGem, "VaniteGem");
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){
		
	}

}
