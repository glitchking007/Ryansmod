
package me.roggero.ryan.stuff.items;

import cpw.mods.fml.common.registry.GameRegistry;
import me.roggero.ryan.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
public class ryaniumpickaxe extends ItemPickaxe{
    public static final String name = "";
    public ryaniumpickaxe(ToolMaterial mat){
        super(mat);
        setMaxDamage(93);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName(Main.MODID + "_" + name);
        GameRegistry.registerItem(this, name);
        setTextureName(Main.MODID + "_" + name);
    }
}
