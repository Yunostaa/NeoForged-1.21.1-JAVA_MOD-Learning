package com.yunosta.learningmod.item;

import com.yunosta.learningmod.LearningMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LearningMod.MODID);

    public static final DeferredItem<Item> RUBBER = ITEMS.register("rubber",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIRE = ITEMS.register("tire",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> RIM = ITEMS.register("rim",
            () -> new Item(new Item.Properties().stacksTo(16)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
