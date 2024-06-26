package net.shoving.gunmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.shoving.gunmod.GunMod;
import net.shoving.gunmod.item.custom.MetalDetectorItem;

public class ModItems {
    // All new added modded Items.


    // Custom Tools
    public static final Item METALDETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(24)));
    public static final Item Glock = registerItem("glock_item",
            new Item(new FabricItemSettings().maxCount(1)));
    // Steel Tools
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new PickaxeItem(ModToolMaterial.STEEL, 2, 2, new FabricItemSettings()));
    public static final Item STEEL_AXE = registerItem("steel_axe",
            new AxeItem(ModToolMaterial.STEEL, 2, 2, new FabricItemSettings()));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ShovelItem(ModToolMaterial.STEEL, 2, 2, new FabricItemSettings()));
    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModToolMaterial.STEEL, 2, 2, new FabricItemSettings()));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new HoeItem(ModToolMaterial.STEEL, 2, 2, new FabricItemSettings()));

    // Steel Items
    public static final Item STEEL = registerItem("steel", new Item(new FabricItemSettings()));
    public static final Item STEELMIX = registerItem("steel_mixture", new Item(new FabricItemSettings()));
    public static final Item STEEL_BOLT = registerItem("steel_bolt", new Item(new FabricItemSettings()));
    public static final Item STEEL_SCREW = registerItem("steel_screw", new Item(new FabricItemSettings()));
    public static final Item STEEL_ROD = registerItem("steel_rod", new Item(new FabricItemSettings()));
    public static final Item STEEL_GEAR = registerItem("steel_gear", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        // All items In the Ingredient tab.

        // Steel Items
        entries.add(STEEL);
        entries.add(STEELMIX);
        entries.add(STEEL_BOLT);
        entries.add(STEEL_SCREW);
        entries.add(STEEL_ROD);
        entries.add(STEEL_GEAR);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GunMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        GunMod.LOGGER.info("Registering Mod Items for " + GunMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
