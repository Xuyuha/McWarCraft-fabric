package Xuyuhan.mcwarcraft.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import Xuyuhan.mcwarcraft.mcwarcraft;
public class ModItemGroup {
    public static ItemGroup WAR_CRAFT= FabricItemGroup.builder(new Identifier(mcwarcraft.MOD_ID,"war_car"))
            .displayName(Text.translatable("itemgroup.mcwarcraft.war_craft"))
            .icon(()->new ItemStack(ModItems.MAP_CORE))
            .build();
    public static void registerModItemGroup(){
        mcwarcraft.LOGGER.debug("Registering mod item group for"+mcwarcraft.MOD_ID);
    }
}
