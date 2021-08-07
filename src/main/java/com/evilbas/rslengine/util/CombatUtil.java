package com.evilbas.rslengine.util;

import com.evilbas.rslengine.ability.property.SpellType;
import com.evilbas.rslengine.creature.Creature;
import com.evilbas.rslengine.damage.DamageModifier;
import com.evilbas.rslengine.item.ItemArmor;
import com.evilbas.rslengine.item.ItemWeapon;
import com.evilbas.rslengine.item.property.ItemRarity;

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

    public static ItemWeapon generateStartingWeapon() {
        ItemWeapon weapon = new ItemWeapon();
        weapon.setName("Broken Dagger");
        weapon.setStackable(false);
        weapon.setRarity(ItemRarity.COMMON);
        weapon.setBaseDamage(10L);
        return weapon;
    }

    public static ItemArmor generateStartingArmor() {
        ItemArmor armor = new ItemArmor();
        armor.setName("Fithy Rags");
        armor.setStackable(false);
        armor.setRarity(ItemRarity.COMMON);
        armor.setBaseArmor(10L);
        return armor;
    }

    public static Long calculateDamage(Creature creature) {
        return (long) Math.floor((creature.getDifficultyFactor() / 3d) * Math.sqrt((double) creature.getLevel()) * 2);
    }
}
