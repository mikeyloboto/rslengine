package com.evilbas.rslengine.util;

import com.evilbas.rslengine.ability.SpellType;
import com.evilbas.rslengine.damage.DamageModifier;

public class CombatUtil {

    private static DamageModifier unarmedMod;

    public static Long getExpCap(Integer level) {
        return (long) (Math.pow((double) level, 1.5) * 20);
    }

    public static Long getMonsterExpDrop(Integer level) {
        return (long) (Math.pow((double) level, 1.1) * 5);
    }

    public static DamageModifier getUnarmedDamageModifier() {
        if (unarmedMod == null) {
            DamageModifier mod = new DamageModifier();
            mod.setDamageType(SpellType.PHYSICAL);
            mod.setAmount(5L);
            unarmedMod = mod;
        }
        return unarmedMod;
    }

    public static DamageModifier convertPhysicalDamageModifier(Long amount) {
        DamageModifier mod = new DamageModifier();
        mod.setDamageType(SpellType.PHYSICAL);
        mod.setAmount(amount);
        return mod;
    }
}
