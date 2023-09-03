package org.leadwugic.musicalmagic.world.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.leadwugic.musicalmagic.MusicalMagic;
import org.leadwugic.musicalmagic.world.level.block.ModBlocks;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MusicalMagic.MOD_ID);

    public static final RegistryObject<Item> TONE_DEBRIS =
            ITEMS.register("tone_debris", () -> new Item(new Item.Properties().tab(MusicalMagic.CREATIVE_MODE_TAB)));

    public static final RegistryObject<Item> HARMONIC_ORE =
            ITEMS.register("harmonic_ore", () ->
                    new BlockItem(ModBlocks.HARMONIC_ORE.get(), new Item.Properties().tab(MusicalMagic.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> HARMONIC_CRYSTAL =
            ITEMS.register("harmonic_crystal",() -> new Item(new Item.Properties().tab(MusicalMagic.CREATIVE_MODE_TAB)));

    public static final RegistryObject<Item> TONEMOND_ORE =
            ITEMS.register("tonemond_ore",
                    () -> new BlockItem(ModBlocks.TONEMOND_ORE.get(), new Item.Properties().tab(MusicalMagic.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> TONEMOND =
            ITEMS.register("tonemond", () ->new Item(new Item.Properties().tab(MusicalMagic.CREATIVE_MODE_TAB)));

}
