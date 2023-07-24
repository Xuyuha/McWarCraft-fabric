package Xuyuhan.mcwarcraft.registry;

import Xuyuhan.mcwarcraft.mcwarcraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item FILLED_COMMAND_MAP=registerItem("filled_command_map",
            new Item(new FabricItemSettings()),
            ModItemGroup.WAR_CRAFT);
    public static final Item COMMAND_MAP=registerItem("command_map",
            new Item(new FabricItemSettings()),
            ModItemGroup.WAR_CRAFT);
    public static final Item MAP_CORE=registerItem("map_core",
            new Item(new FabricItemSettings()),
            ModItemGroup.WAR_CRAFT);
    public static final Item LOCATE_MAP_CORE=registerItem("locate_map_core",
            new Item(new FabricItemSettings()),
            ModItemGroup.WAR_CRAFT);
    public static final Item ZOOM_MAP_CORE=registerItem("zoom_map_core",
            new Item(new FabricItemSettings()),
            ModItemGroup.WAR_CRAFT);
    public static final Item SCAN_MAP_CORE=registerItem("scan_map_core",
            new Item(new FabricItemSettings()),
            ModItemGroup.WAR_CRAFT);
    public static final Item CHOPPER_KNIFE=registerItem("chopper_knife",
            new Item(new FabricItemSettings()),
            ModItemGroup.WAR_CRAFT);
    public  static Item registerItem(String name, Item item, ItemGroup... itemGroups)
    {
        Item registeredItem= Registry.register(Registries.ITEM,new Identifier(mcwarcraft.MOD_ID,name),item);
        for (ItemGroup itemGroup:itemGroups){
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(registeredItem));
        }
        return registeredItem;
    }
    public  static  void registerModItems(){

        mcwarcraft.LOGGER.debug("Registering mod items for"+mcwarcraft.MOD_ID);
    }
}
