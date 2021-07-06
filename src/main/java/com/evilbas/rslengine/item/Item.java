package com.evilbas.rslengine.item;

import com.evilbas.rslengine.item.property.ItemRarity;

public class Item {
    private String name;
    private Boolean stackable;
    private String icon;
    private ItemRarity rarity;

    public Boolean getStackable() {
        return stackable;
    }

    public ItemRarity getRarity() {
        return rarity;
    }

    public void setRarity(ItemRarity rarity) {
        this.rarity = rarity;
    }

    public void setStackable(Boolean stackable) {
        this.stackable = stackable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
