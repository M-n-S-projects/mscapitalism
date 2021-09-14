package com.github.m_n_s_projects.mscapitalism.block;

import com.github.m_n_s_projects.mscapitalism.MSCapitalism;
import com.github.m_n_s_projects.mscapitalism.util.Registration;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {


    public  static void register( ) {}

    private  static <T extends Block>RegistryObject<T> register(String name , Supplier<T> block){
        RegistryObject<T> toretern =  Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name,() -> new BlockItem(toretern.get(),
                new Item.Properties().group(MSCapitalism.MSCAPITALISM)));
        return  toretern;
    }
}

