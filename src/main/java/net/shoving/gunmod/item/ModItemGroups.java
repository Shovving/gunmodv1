package net.shoving.gunmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.shoving.gunmod.GunMod;
import net.shoving.gunmod.block.ModBlocks;

// Creates a new Creative Mode Tab.
public class ModItemGroups {
    public static final ItemGroup GUN_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(GunMod.MOD_ID, "guns"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.guns"))
                    .icon(() -> new ItemStack(Items.GUNPOWDER)).entries((displayContext, entries) -> {
                        // all items in the tab.

                        // Custom Tools
                        entries.add(ModItems.METALDETECTOR);
                        // Steel Items
                        entries.add(ModItems.STEEL);
                        entries.add(ModItems.STEELMIX);
                        entries.add(ModItems.STEEL_GEAR);
                        entries.add(ModItems.STEEL_ROD);
                        entries.add(ModItems.STEEL_SCREW);
                        entries.add(ModItems.STEEL_BOLT);
                        // Vanilla Items
                        entries.add(Items.DIAMOND);
                        // Blocks
                        entries.add(ModBlocks.GUNPOWDER_BLOCK);
                        entries.add(ModBlocks.SOUND_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        GunMod.LOGGER.info("Registering Item Groups for " + GunMod.MOD_ID);
    }
}
