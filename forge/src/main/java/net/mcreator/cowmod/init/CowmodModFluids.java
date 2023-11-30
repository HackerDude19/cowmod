
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cowmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.cowmod.fluid.CowPeeFluid;
import net.mcreator.cowmod.CowmodMod;

public class CowmodModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, CowmodMod.MODID);
	public static final RegistryObject<FlowingFluid> COW_PEE = REGISTRY.register("cow_pee", () -> new CowPeeFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_COW_PEE = REGISTRY.register("flowing_cow_pee", () -> new CowPeeFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(COW_PEE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_COW_PEE.get(), RenderType.translucent());
		}
	}
}
