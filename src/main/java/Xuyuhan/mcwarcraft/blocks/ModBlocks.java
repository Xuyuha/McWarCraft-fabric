package Xuyuhan.mcwarcraft.blocks;

import Xuyuhan.mcwarcraft.ModItemGroup;
import Xuyuhan.mcwarcraft.mcwarcraft;
import Xuyuhan.mcwarcraft.items.ModItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block LAZURITE_ORE=registerBlock("lazurite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f,3.0f).requiresTool(), UniformIntProvider.create(3,7)),
            ModItemGroup.WAR_CRAFT
    );
    public static final Block LAZURITE_BLOCK=registerBlock("lazurite_bl ock",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5.0f,6.0f)),
            ModItemGroup.WAR_CRAFT
    );
    public static final Block DEEPSLATE_LAZURITE_ORE=registerBlock("deepslate_lazurite_ore.json",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.METAL).strength(4.5f,3.0f).requiresTool(), UniformIntProvider.create(3,7)),
            ModItemGroup.WAR_CRAFT
    );

    public static Block registerBlock(String name, Block block, ItemGroup... itemGroups){
        ModItems.registerItem(name,new BlockItem(block,new FabricItemSettings()),itemGroups);
        return Registry.register(Registries.BLOCK,new Identifier(mcwarcraft.MOD_ID,name), block);
    }
    public  static  void registerModBlocks(){

        mcwarcraft.LOGGER.debug("Registering mod blocks for"+mcwarcraft.MOD_ID);
    }

}
