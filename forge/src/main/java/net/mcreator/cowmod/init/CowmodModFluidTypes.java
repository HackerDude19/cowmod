
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cowmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.cowmod.fluid.types.CowPeeFluidType;
import net.mcreator.cowmod.CowmodMod;

public class CowmodModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CowmodMod.MODID);
	public static final RegistryObject<FluidType> COW_PEE_TYPE = REGISTRY.register("cow_pee", () -> new CowPeeFluidType());
}
