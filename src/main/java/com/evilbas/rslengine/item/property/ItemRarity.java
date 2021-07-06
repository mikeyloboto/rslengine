package com.evilbas.rslengine.item.property;

public enum ItemRarity {
    COMMON, RARE, EPIC, LEGENDARY, MYTHIC;

    public static String toReadable(ItemRarity rarity) {
        switch (rarity) {
            case COMMON:
                return "Common";
            case RARE:
                return "Rare";
            case EPIC:
                return "Epic";
            case LEGENDARY:
                return "Legendary";
            case MYTHIC:
                return "Mythic";
        }
        return "Other";
    }
}
