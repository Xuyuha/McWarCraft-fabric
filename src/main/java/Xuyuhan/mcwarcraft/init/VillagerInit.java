package Xuyuhan.mcwarcraft.init;

import Xuyuhan.mcwarcraft.items.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class VillagerInit {
    public static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(ModItems.MAP_CORE, 1),
                            6, 2, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 7),
                            new ItemStack(Items.MAP,1),
                            new ItemStack(ModItems.COMMAND_MAP, 1),
                            6, 5, 0.02f
                    )));
                });
    }
}
