package com.evilbas.rslengine.item;

import java.util.ArrayList;
import java.util.List;

import com.evilbas.rslengine.damage.DamageModifier;

import lombok.Data;

@Data
public class ItemWeapon extends Item {
    private Long baseDamage;
    private List<DamageModifier> modifiers;
    private List<DamageModifier> tempModifiers;

    public void addModifier(DamageModifier modifier) {
        if (this.modifiers == null) {
            this.modifiers = new ArrayList<>();
        }
        this.modifiers.add(modifier);
    }

    public void addTempModifier(DamageModifier modifier) {
        if (this.tempModifiers == null) {
            this.tempModifiers = new ArrayList<>();
        }
        this.tempModifiers.add(modifier);
    }

    public Long getTotalScore() {
        Long result = baseDamage;
        if (modifiers != null) {
            for (DamageModifier mod : modifiers) {
                result += mod.getAmount();
            }
        }
        return result;
    }
}
