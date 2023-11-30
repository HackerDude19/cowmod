
package net.mcreator.cowmod.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.cowmod.init.CowmodModItems;
import net.mcreator.cowmod.init.CowmodModFluids;
import net.mcreator.cowmod.init.CowmodModFluidTypes;
import net.mcreator.cowmod.init.CowmodModBlocks;

public abstract class CowPeeFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> CowmodModFluidTypes.COW_PEE_TYPE.get(), () -> CowmodModFluids.COW_PEE.get(), () -> CowmodModFluids.FLOWING_COW_PEE.get())
			.explosionResistance(100f).bucket(() -> CowmodModItems.COW_PEE_BUCKET.get()).block(() -> (LiquidBlock) CowmodModBlocks.COW_PEE.get());

	private CowPeeFluid() {
		super(PROPERTIES);
	}

	public static class Source extends CowPeeFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CowPeeFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
