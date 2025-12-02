package com.yunosta.learningmod.item;

import com.yunosta.learningmod.LearningMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LearningMod.MODID);

    public static final Supplier<CreativeModeTab> VEHICLE_TAB = CREATIVE_MODE_TAB.register("vehicle_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CAOUTCHOUC.get()))
                    .title(Component.translatable("creativetab.learningmod.vehicle_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CAOUTCHOUC.get());
                        output.accept(ModItems.TIRE.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
