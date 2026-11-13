package net.ender.endless_entropy.item;

import net.ender.endless_entropy.EndlessEntropy;
import net.ender.endless_entropy.registries.ItemRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EndlessEntropy.MOD_ID);


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }


    public static final Supplier<CreativeModeTab> ENDLESS_ENTROPY_CURIO = CREATIVE_MODE_TAB.register("entropy_curio_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemRegistry.CURSED_RING.get()))
                    .title(Component.translatable("creativetab.endless_entropy_curio"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ItemRegistry.CURSED_RING.get());

                    })

                    .build());
}
