package com.mcmoddev.poweradvantage.item.tool.gem;

import com.mcmoddev.poweradvantage.misc.Crystal;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GemHoe extends ItemHoe implements IItemColor {
    private Crystal crystal;
    public GemHoe(Crystal crystal) {
        super(ToolMaterial.DIAMOND);
        this.crystal = crystal;
        setRegistryName("hoe_" + crystal.getOreDict().toLowerCase());
        setUnlocalizedName("poweradvantage.hoe_" + crystal.getOreDict().toLowerCase());
        GameRegistry.register(this);
    }

    @Override
    public int getColorFromItemstack(ItemStack stack, int tintIndex) {
        if (tintIndex == 1)
            return this.crystal.getRGB();
        return 0xFFFFFF;
    }
}