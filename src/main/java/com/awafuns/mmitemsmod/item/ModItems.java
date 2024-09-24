package com.awafuns.mmitemsmod.item;

import com.awafuns.mmitemsmod.MMitemsMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item AWA_CREATE = registerItem("awa_create",new Item(new Item.Settings()));
//    private static final Item AWA_CREATE = registerItem("awa_create",new Item(new Item.Settings()));

    private static Item registerItem(String id, Item item){
        //return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(MMitemsMod.MOD_ID,id)), item);
        return Registry.register(Registries.ITEM,Identifier.of(MMitemsMod.MOD_ID,id), item);
    }

    private static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(AWA_CREATE);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIG);
        MMitemsMod.LOGGER.info("Registering Items");
    }
}
