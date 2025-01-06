package com.cosmicgelatin.peculiars.core.data.server.tags;

import com.cosmicgelatin.peculiars.core.Peculiars;
import com.cosmicgelatin.peculiars.core.registry.PeculiarsBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class PeculiarsBlockTagsProvider extends BlockTagsProvider {

    public PeculiarsBlockTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, Peculiars.MODID, existingFileHelper);
    }

    @Override
    public void addTags(HolderLookup.Provider provider) {

        tag(BlockTags.MINEABLE_WITH_SHOVEL).add(
                PeculiarsBlocks.ALOE_ICE_CREAM_BLOCK.get(),
                PeculiarsBlocks.PASSION_FRUIT_ICE_CREAM_BLOCK.get(),
                PeculiarsBlocks.YUCCA_ICE_CREAM_BLOCK.get()
        );
        tag(BlockTags.CAULDRONS).add(
                PeculiarsBlocks.YUCCA_MILKSHAKE_CAULDRON.get(),
                PeculiarsBlocks.ALOE_MILKSHAKE_CAULDRON.get(),
                PeculiarsBlocks.PASSION_FRUIT_MILKSHAKE_CAULDRON.get()
        );
    }
}
