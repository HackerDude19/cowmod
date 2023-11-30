
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cowmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.cowmod.world.features.ores.CowOreFeature;
import net.mcreator.cowmod.CowmodMod;

@Mod.EventBusSubscriber
public class CowmodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CowmodMod.MODID);
	public static final RegistryObject<Feature<?>> COW_ORE = REGISTRY.register("cow_ore", CowOreFeature::new);
}
