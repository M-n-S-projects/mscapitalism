package com.gmail.sashabb07.mscapitalism.util;


import com.gmail.sashabb07.mscapitalism.MSCapitalism;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class regestration {
    public  static final DeferredRegister<Block> BlOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, MSCapitalism.Mod_ID);

    public  static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, MSCapitalism.Mod_ID);
    public  static  void register() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BlOCKS.register(eventBus);
        ITEMS.register(eventBus);

    }
}
