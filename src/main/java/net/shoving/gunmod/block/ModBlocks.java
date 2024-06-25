package net.shoving.gunmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GravelBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.shoving.gunmod.GunMod;
import net.shoving.gunmod.block.custom.SoundBlock;

public class ModBlocks {
    public  static final Block GUNPOWDER_BLOCK = registerBlock("gunpowder_block",
            new Block(FabricBlockSettings.copyOf(Blocks.TNT).sounds(BlockSoundGroup.GRAVEL)));

    public  static final Block SOUND_BLOCK = registerBlock("sound_block",
            new SoundBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(GunMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem (String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(GunMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        GunMod.LOGGER.info("Registering Modded Blocks for " + GunMod.MOD_ID);
    }
}
