package com.evilbas.rslengine.damage;

import com.evilbas.rslengine.ability.SpellType;

public class DamageModifier {
    private SpellType damageType;
    private Long amount;
    private Boolean temporary;
    private Integer temporaryRemaining;

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
