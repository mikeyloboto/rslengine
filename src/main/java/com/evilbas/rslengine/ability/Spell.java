package com.evilbas.rslengine.ability;

import java.util.ArrayList;
import java.util.List;

import com.evilbas.rslengine.ability.property.Effect;
import com.evilbas.rslengine.ability.property.SpellType;
import com.evilbas.rslengine.ability.property.Target;
import com.evilbas.rslengine.damage.DamageModifier;

public class Spell extends Ability {
    private String spellName;
    private String icon;

    private Effect effect;
    private Target target;

    private Long manaCost;

    public Long getManaCost() {
        return manaCost;
    }

    public void setManaCost(Long manaCost) {
        this.manaCost = manaCost;
    }

    private List<DamageModifier> modifiers;

    public Spell(String spellName, Effect effect, Target target, Long manaCost, String icon) {
        this.spellName = spellName;
        this.effect = effect;
        this.target = target;
        this.icon = icon;
        this.manaCost = manaCost;
    }

    public Spell() {
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Effect getEffect() {
        return effect;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public List<DamageModifier> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<DamageModifier> modifiers) {
        this.modifiers = modifiers;
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public void addModifier(DamageModifier modifier) {
        if (this.modifiers == null) {
            this.modifiers = new ArrayList<>();
        }
        this.modifiers.add(modifier);
    }

    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        switch (this.effect) {
            case HEAL:
                sb.append("Heals ");
                switch (this.target) {
                    case SELF:
                        sb.append("you.");
                        break;
                    case ENEMY:
                        sb.append("first enemy.");
                        break;
                    case MULTI_ENEMY:
                        sb.append("all enemies.");
                        break;
                }
                break;
            case HARM:
                sb.append("Damages ");

                switch (this.target) {
                    case SELF:
                        sb.append("you ");
                        break;
                    case ENEMY:
                        sb.append("first enemy ");
                        break;
                    case MULTI_ENEMY:
                        sb.append("all enemies ");
                        break;
                }
                sb.append("for:");
                for (DamageModifier dm : modifiers) {
                    sb.append("\n   " + dm.getAmount() + " " + dm.getDamageType().getReadableName(false) + " damage");
                }
                break;
        }

        return sb.toString();

    }

    public static Spell generateDamageSpell() {
        var spell = new Spell();
        spell.setSpellName("Fire Bolt");
        spell.setEffect(Effect.HARM);
        spell.setTarget(Target.ENEMY);
        spell.setIcon("🔥");
        spell.addModifier(new DamageModifier(SpellType.FIRE, 20L));
        spell.setManaCost(5L);
        return spell;
    }

    public static Spell generateBigDamageSpell() {
        var spell = new Spell();
        spell.setSpellName("Chaos Bolt");
        spell.setEffect(Effect.HARM);
        spell.setTarget(Target.ENEMY);
        spell.setIcon("✨");
        spell.addModifier(new DamageModifier(SpellType.CHAOS, 50L));
        spell.setManaCost(10L);
        return spell;
    }

    public static Spell generateAoeSpell() {
        var spell = new Spell();
        spell.setSpellName("Blizzard");
        spell.setEffect(Effect.HARM);
        spell.setTarget(Target.MULTI_ENEMY);
        spell.setIcon("❄️");
        spell.addModifier(new DamageModifier(SpellType.FROST, 20L));
        spell.setManaCost(10L);
        return spell;
    }

    public static Spell generateHealingSpell() {
        var spell = new Spell();
        spell.setSpellName("Blizzard");
        spell.setEffect(Effect.HEAL);
        spell.setTarget(Target.SELF);
        spell.setIcon("🌿");
        spell.addModifier(new DamageModifier(SpellType.NATURE, 50L));
        spell.setManaCost(5L);
        return spell;
    }
}
