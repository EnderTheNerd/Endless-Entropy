package net.ender.endless_entropy.registries;

import net.ender.endless_entropy.EndlessEntropy;
import net.ender.endless_entropy.item.curio.EntropicCurio;
import net.ender.endless_entropy.item.curio.basic_curio.HeatedTablet;
import net.ender.endless_entropy.item.curio.hidden_mechanics.NormalRing;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Collection;
import java.util.function.Function;
import java.util.function.Supplier;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EndlessEntropy.MOD_ID);

    //PASSIVE CURIO
    public static final Supplier<EntropicCurio> CURSED_RING = registerItem("normal_ring",
            (properties) -> new NormalRing(properties.stacksTo(1).fireResistant()));

    public static final Supplier<EntropicCurio> LUKEWARM_TABLET = registerItem("heated_tablet",
            (properties) -> new HeatedTablet(properties.stacksTo(1)));




    public static Collection<DeferredHolder<Item, ? extends Item>> getItems() {
        return ITEMS.getEntries();
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    private static <T extends Item> DeferredHolder<Item, T> registerItem(String name, Function<Item.Properties, T> itemFactory) {
        return ITEMS.register(name, () -> itemFactory.apply(new Item.Properties()));
    }
}
