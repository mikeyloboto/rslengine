package com.evilbas.rslengine.creature;

public class Creature {
    private String name;
    private Long maxHp;
    private Long currentHp;
    private Integer level;

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

}
