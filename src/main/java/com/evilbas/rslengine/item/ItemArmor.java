package com.evilbas.rslengine.item;

import java.util.ArrayList;
import java.util.List;

import com.evilbas.rslengine.damage.DamageModifier;

import lombok.Data;

@Data
public class ItemArmor extends Item {
    private Long baseArmor;
    private List<DamageModifier> modifiers;

    public void addModifier(DamageModifier modifier) {
        if (this.modifiers == null) {
            this.modifiers = new ArrayList<>();
        }
        this.modifiers.add(modifier);
    }

    public Long getTotalScore() {
        Long result = baseArmor;
        if (modifiers != null) {
            for (DamageModifier mod : modifiers) {
                result += mod.getAmount();
            }
        }
        return result;
    }

}
