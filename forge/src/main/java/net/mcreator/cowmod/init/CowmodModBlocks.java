
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cowmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.cowmod.block.CowPeeBlock;
import net.mcreator.cowmod.block.CowOreBlock;
import net.mcreator.cowmod.block.CowLogBlock;
import net.mcreator.cowmod.block.CowDimensionPortalBlock;
import net.mcreator.cowmod.block.CowBlockBlock;
import net.mcreator.cowmod.CowmodMod;

public class CowmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CowmodMod.MODID);
	public static final RegistryObject<Block> COW_BLOCK = REGISTRY.register("cow_block", () -> new CowBlockBlock());
	public static final RegistryObject<Block> COW_PEE = REGISTRY.register("cow_pee", () -> new CowPeeBlock());
	public static final RegistryObject<Block> COW_LOG = REGISTRY.register("cow_log", () -> new CowLogBlock());
	public static final RegistryObject<Block> COW_DIMENSION_PORTAL = REGISTRY.register("cow_dimension_portal", () -> new CowDimensionPortalBlock());
	public static final RegistryObject<Block> COW_ORE = REGISTRY.register("cow_ore", () -> new CowOreBlock());
}
