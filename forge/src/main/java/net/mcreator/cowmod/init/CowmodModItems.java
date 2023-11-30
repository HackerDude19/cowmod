
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cowmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cowmod.item.CowPeeItem;
import net.mcreator.cowmod.item.CowItem;
import net.mcreator.cowmod.item.CowIngotItem;
import net.mcreator.cowmod.item.CowDimensionItem;
import net.mcreator.cowmod.CowmodMod;

public class CowmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CowmodMod.MODID);
	public static final RegistryObject<Item> COW_INGOT = REGISTRY.register("cow_ingot", () -> new CowIngotItem());
	public static final RegistryObject<Item> COW_BLOCK = block(CowmodModBlocks.COW_BLOCK);
	public static final RegistryObject<Item> COW_PEE_BUCKET = REGISTRY.register("cow_pee_bucket", () -> new CowPeeItem());
	public static final RegistryObject<Item> COW_LOG = block(CowmodModBlocks.COW_LOG);
	public static final RegistryObject<Item> COW_DIMENSION = REGISTRY.register("cow_dimension", () -> new CowDimensionItem());
	public static final RegistryObject<Item> COW_ORE = block(CowmodModBlocks.COW_ORE);
	public static final RegistryObject<Item> COW_HELMET = REGISTRY.register("cow_helmet", () -> new CowItem.Helmet());
	public static final RegistryObject<Item> COW_CHESTPLATE = REGISTRY.register("cow_chestplate", () -> new CowItem.Chestplate());
	public static final RegistryObject<Item> COW_LEGGINGS = REGISTRY.register("cow_leggings", () -> new CowItem.Leggings());
	public static final RegistryObject<Item> COW_BOOTS = REGISTRY.register("cow_boots", () -> new CowItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
