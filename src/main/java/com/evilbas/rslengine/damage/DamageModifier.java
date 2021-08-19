package com.evilbas.rslengine.damage;

import com.evilbas.rslengine.ability.property.SpellType;

import lombok.Data;

@Data
public class DamageModifier {
    private SpellType damageType;
    private Long amount;
    private Boolean temporary;
    private Integer temporaryRemaining;

    public DamageModifier(SpellType damageType, Long amount) {
        this.damageType = damageType;
        this.amount = amount;
        this.temporary = false;
    }

    public DamageModifier() {

    }

    public DamageModifier(SpellType damageType, Long amount, Integer temporaryRemaining) {
        this.damageType = damageType;
        this.amount = amount;
        this.temporary = true;
        this.temporaryRemaining = temporaryRemaining;
    }
}
