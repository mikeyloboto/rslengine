package com.evilbas.rslengine.item;

import java.util.ArrayList;
import java.util.List;

import com.evilbas.rslengine.damage.DamageModifier;

public class ItemArmor extends Item {
    private Long baseArmor;
    private List<DamageModifier> modifiers;

    public Long getBaseArmor() {
        return baseArmor;
    }

    public void setBaseArmor(Long baseArmor) {
        this.baseArmor = baseArmor;
    }

    public List<DamageModifier> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<DamageModifier> modifiers) {
        this.modifiers = modifiers;
    }

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
