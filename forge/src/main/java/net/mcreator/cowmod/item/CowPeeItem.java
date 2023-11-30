
package net.mcreator.cowmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.cowmod.init.CowmodModFluids;

public class CowPeeItem extends BucketItem {
	public CowPeeItem() {
		super(CowmodModFluids.COW_PEE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
