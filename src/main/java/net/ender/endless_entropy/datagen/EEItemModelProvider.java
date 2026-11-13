package net.ender.endless_entropy.datagen;

import net.ender.endless_entropy.EndlessEntropy;
import net.ender.endless_entropy.registries.ItemRegistry;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class EEItemModelProvider extends ItemModelProvider {
    public EEItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EndlessEntropy.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ItemRegistry.CURSED_RING.get());
        basicItem(ItemRegistry.LUKEWARM_TABLET.get());
    }

}