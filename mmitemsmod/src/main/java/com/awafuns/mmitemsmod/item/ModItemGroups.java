package com.awafuns.mmitemsmod.item;

import com.awafuns.mmitemsmod.MMitemsMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
//    public static final RegistryKey<ItemGroup> MMI_GROUP = register("MMI_GROUP");
//
//    private static RegistryKey<ItemGroup> register(String id) {
//        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(MMitemsMod.MOD_ID, id));
//    }
//
//    public static void registerItemGroups() {
//        Registry.register(Registries.ITEM_GROUP, MMI_GROUP,
//                ItemGroup.create(ItemGroup.Row.TOP, 7)
//                        .displayName(Text.translatable("itemgroup.MMI_GROUP"))
//                        .icon(() -> new ItemStack(ModItems.AWA_CREATE))
//                        .entries((displayContext, entries) -> {
//                             entries.add(ModItems.AWA_CREATE);
//                        }).build());
//        MMitemsMod.LOGGER.info("Registering ItemGroups");
//    }

    public static final ItemGroup MMI_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(MMitemsMod.MOD_ID, "mmi_group"),
        ItemGroup.create(null,-1).displayName(Text.translatable("itemgroup.mmi_group"))
                .icon(() -> new ItemStack(ModItems.AWA_CREATE))
                .entries((displayContext, entries) -> {
                    entries.add(ModItems.AWA_CREATE);
                    entries.add(Blocks.BRICKS);
                    entries.add(Items.DIAMOND);
                }).build());

    public static void registerItemGroups() {
        MMitemsMod.LOGGER.info("Registering ItemGroups");
    }
}
