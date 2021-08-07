package com.evilbas.rslengine.ability;

import java.util.ArrayList;
import java.util.List;

public class Spellbook {
    private List<Spell> spells;

    public Spellbook() {
        this.spells = new ArrayList<>();
    }

    public List<Spell> getSpells() {
        return spells;
    }

    public void setSpells(List<Spell> spells) {
        this.spells = spells;
    }

    public void addSpell(Spell spell) {
        if (this.spells == null) {
            this.spells = new ArrayList<>();
        }
        this.spells.add(spell);
    }
}
