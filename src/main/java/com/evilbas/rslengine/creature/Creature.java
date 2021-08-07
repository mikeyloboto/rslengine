package com.evilbas.rslengine.creature;

import java.util.List;

import com.evilbas.rslengine.damage.DamageModifier;

public class Creature {
    private String name;
    private Long maxHp;
    private Long currentHp;
    private Integer level;
    private Integer difficultyFactor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(Long maxHp) {
        this.maxHp = maxHp;
    }

    public Long getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(Long currentHp) {
        this.currentHp = currentHp;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getDifficultyFactor() {
        return difficultyFactor;
    }

    public void setDifficultyFactor(Integer difficultyFactor) {
        this.difficultyFactor = difficultyFactor;
    }

    public void heal(Long hp) {
        currentHp += hp;
        if (currentHp > maxHp)
            currentHp = maxHp;
    }

    public Boolean damage(Long hp) {
        currentHp -= hp;
        if (currentHp <= 0) {
            currentHp = 0L;
            return true;
        }
        return false;
    }

    public Boolean damage(DamageModifier damage) {
        currentHp -= damage.getAmount();
        if (currentHp <= 0) {
            currentHp = 0L;
            return true;
        }
        return false;
    }

    public Boolean damage(List<DamageModifier> damage) {
        for (DamageModifier mod : damage) {
            currentHp -= mod.getAmount();
        }

        if (currentHp <= 0) {
            currentHp = 0L;
            return true;
        }
        return false;
    }

    public Boolean heal(List<DamageModifier> modifiers) {
        for (DamageModifier mod : modifiers) {
            currentHp += mod.getAmount();
        }

        if (currentHp > maxHp) {
            currentHp = maxHp;
            return true;
        }
        return false;
    }

}
