package com.evilbas.rslengine.damage;

import com.evilbas.rslengine.ability.property.SpellType;

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

    public SpellType getDamageType() {
        return damageType;
    }

    public void setDamageType(SpellType damageType) {
        this.damageType = damageType;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Boolean getTemporary() {
        return temporary;
    }

    public void setTemporary(Boolean temporary) {
        this.temporary = temporary;
    }

    public Integer getTemporaryRemaining() {
        return temporaryRemaining;
    }

    public void setTemporaryRemaining(Integer temporaryRemaining) {
        this.temporaryRemaining = temporaryRemaining;
    }
}
