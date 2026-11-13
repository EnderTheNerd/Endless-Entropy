package net.ender.endless_entropy.item.curio.basic_curio;

import net.ender.endless_entropy.item.curio.EntropicCurio;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class HeatedTablet extends EntropicCurio {

    public HeatedTablet(Properties properties) {
        super(new Item.Properties());

    }

    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);

        if (tooltipFlag.hasShiftDown()) {
            tooltipComponents.add(Component.translatable("item.endless_entropy.heated_tablet.lore").
                    withStyle(ChatFormatting.GRAY).
                    withStyle(ChatFormatting.ITALIC));
            tooltipComponents.add(Component.translatable("item.endless_entropy.heated_tablet.details").
                    withStyle(ChatFormatting.DARK_PURPLE).
                    withStyle(ChatFormatting.ITALIC));


        }
        else {
            tooltipComponents.add(Component.translatable("item.endless_entropy.curio_more_details").
                    withStyle(ChatFormatting.DARK_GRAY).
                    withStyle(ChatFormatting.ITALIC));
        }

    }
}
