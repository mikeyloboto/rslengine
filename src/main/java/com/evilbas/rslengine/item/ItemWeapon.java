package com.evilbas.rslengine.item;

import java.util.ArrayList;
import java.util.List;

import com.evilbas.rslengine.damage.DamageModifier;

public class ItemWeapon extends Item {
    private Long baseDamage;
    private List<DamageModifier> modifiers;
    private List<DamageModifier> tempModifiers;

    public Long getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(Long baseDamage) {
        this.baseDamage = baseDamage;
    }

    public List<DamageModifier> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<DamageModifier> modifiers) {
        this.modifiers = modifiers;
    }

    public List<DamageModifier> getTempModifiers() {
        return tempModifiers;
    }

    public void setTempModifiers(List<DamageModifier> tempModifiers) {
        this.tempModifiers = tempModifiers;
    }

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
