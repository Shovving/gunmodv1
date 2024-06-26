package net.shoving.gunmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.shoving.gunmod.block.ModBlocks;
import net.shoving.gunmod.item.ModItems;
import net.shoving.gunmod.util.ModTags;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GUNPOWDER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.STEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEELMIX, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_GEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_BOLT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_ROD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SCREW, Models.GENERATED);
        itemModelGenerator.register(ModItems.METALDETECTOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SWORD, Models.HANDHELD);


    }
}
