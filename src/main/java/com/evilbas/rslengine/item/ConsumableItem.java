package com.evilbas.rslengine.item;

import com.evilbas.rslengine.ability.property.Effect;
import com.evilbas.rslengine.ability.property.SpellType;
import com.evilbas.rslengine.ability.property.Target;
import com.evilbas.rslengine.item.property.ItemRarity;

import lombok.Data;

@Data
public class ConsumableItem extends Item {
    private Target target;
    private Effect effect;
    private SpellType type;
    private Long value;

    public static Item generateHealingItem() {
        ConsumableItem item = new ConsumableItem();
        item.setName("Health Potion");
        item.setStackable(true);
        item.setEffect(Effect.HEAL);
        item.setTarget(Target.SELF);
        item.setIcon("🧪");
        item.setValue(20L);
        item.setRarity(ItemRarity.COMMON);
        item.setType(SpellType.NATURE);
        return item;
    }

    public static Item generateHarmItem() {
        ConsumableItem item = new ConsumableItem();
        item.setName("Firebomb");
        item.setStackable(true);
        item.setEffect(Effect.HARM);
        item.setTarget(Target.ENEMY);
        item.setIcon("💣");
        item.setValue(20L);
        item.setRarity(ItemRarity.COMMON);
        item.setType(SpellType.FIRE);
        return item;
    }

    public static Item generateAoeItem() {
        ConsumableItem item = new ConsumableItem();
        item.setName("Fire Powder");
        item.setStackable(true);
        item.setEffect(Effect.HARM);
        item.setTarget(Target.MULTI_ENEMY);
        item.setIcon("💥");
        item.setValue(10L);
        item.setRarity(ItemRarity.COMMON);
        item.setType(SpellType.FIRE);
        return item;
    }

}
