package org.leadwugic.musicalmagic.world.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.leadwugic.musicalmagic.MusicalMagic;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MusicalMagic.MOD_ID);

    public static final RegistryObject<Item> TONE_DEBRIS =
            ITEMS.register("tone_debris", () -> new Item(new Item.Properties().tab(MusicalMagic.CREATIVE_MODE_TAB)));

}
