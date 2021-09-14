package com.github.m_n_s_projects.mscapitalism.itam;


import com.github.m_n_s_projects.mscapitalism.MSCapitalism;
import com.github.m_n_s_projects.mscapitalism.block.ModBlocks;
import com.github.m_n_s_projects.mscapitalism.util.Registration;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public  static final RegistryObject<Item> Copper_ingot =
           Registration.ITEMS.register("coper_ingot",
                   () -> new Item(new Item.Properties().group(MSCapitalism.MSCAPITALISM)));
}



