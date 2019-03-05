package me.ghg.crafting;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Item {

	/**
	 * Creates an item stack of the given material with the given name
	 * @param material
	 * @param name
	 * @return			returns the requested ItemStack
	 */
	public static ItemStack create(Material material, String name){
		ItemStack item = new ItemStack(material);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(name);
		item.setItemMeta(itemMeta);
		return item;
	}
	
}
