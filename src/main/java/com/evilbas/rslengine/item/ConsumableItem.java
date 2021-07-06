package com.evilbas.rslengine.item;

import com.evilbas.rslengine.ability.SpellType;
import com.evilbas.rslengine.item.property.ItemEffect;
import com.evilbas.rslengine.item.property.ItemTarget;

public class ConsumableItem extends Item {
    private ItemTarget target;
    private ItemEffect effect;
    private SpellType type;
    private Long value;

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public ItemTarget getTarget() {
        return target;
    }

    public void setTarget(ItemTarget target) {
        this.target = target;
    }

    public ItemEffect getEffect() {
        return effect;
    }

    public void setEffect(ItemEffect effect) {
        this.effect = effect;
    }

    public SpellType getType() {
        return type;
    }

    public void setType(SpellType type) {
        this.type = type;
    }

}
