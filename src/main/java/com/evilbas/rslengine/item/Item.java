package com.evilbas.rslengine.item;

import com.evilbas.rslengine.item.property.ItemRarity;

import lombok.Data;

@Data
public class Item {
    private String name;
    private Boolean stackable;
    private String icon;
    private ItemRarity rarity;

}
