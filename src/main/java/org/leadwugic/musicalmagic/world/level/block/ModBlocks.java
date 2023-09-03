package org.leadwugic.musicalmagic.world.level.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.leadwugic.musicalmagic.MusicalMagic;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MusicalMagic.MOD_ID);

    public static final RegistryObject<Block> HARMONIC_ORE =
            BLOCKS.register("harmonic_ore", () -> new OreBlock(
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(4.0f, 4.0f),
                    UniformInt.of(3, 7)
            ) );

    public static final RegistryObject<Block> TONEMOND_ORE =
            BLOCKS.register("tonemond_ore", () -> new OreBlock(
                    BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(5.0f, 5.0f),
                    UniformInt.of(4, 8)
            ) );
}
