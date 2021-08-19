package com.evilbas.rslengine.creature;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.evilbas.rslengine.ability.property.SpellType;
import com.evilbas.rslengine.damage.DamageModifier;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CreatureTest {

    static Creature tested;

    @BeforeAll
    public static void setup() {
        System.out.println("Setting up creature test");
        tested = new Creature();
        tested.setDifficultyFactor(10);
        tested.setName("tested");
        tested.setCurrentHp(20L);
        tested.setLevel(1);
        tested.setMaxHp(20L);
    }

    @Test
    public void testDamage() {
        tested.damage(10L);
        assertEquals(10L, tested.getCurrentHp());
        tested.setCurrentHp(20L);
    }

    @Test
    public void testDamage2() {
        DamageModifier mod = new DamageModifier(SpellType.PHYSICAL, 10L);
        tested.damage(mod);
        assertEquals(10L, tested.getCurrentHp());
        tested.setCurrentHp(20L);
    }

    @Test
    public void testDamage3() {
        List<DamageModifier> modifiers = new ArrayList<>();
        modifiers.add(new DamageModifier(SpellType.PHYSICAL, 5L));
        modifiers.add(new DamageModifier(SpellType.FIRE, 5L));
        tested.damage(modifiers);
        assertEquals(10L, tested.getCurrentHp());
        tested.setCurrentHp(20L);
    }

    @Test
    public void testGetCurrentHp() {
        assertEquals(20L, tested.getCurrentHp());
    }

    @Test
    public void testGetDifficultyFactor() {
        assertEquals(10, tested.getDifficultyFactor());
    }

    @Test
    public void testGetLevel() {
        assertEquals(1, tested.getLevel());
    }

    @Test
    public void testGetMaxHp() {
        assertEquals(20L, tested.getMaxHp());
    }

    @Test
    public void testGetName() {
        assertEquals("tested", tested.getName());
    }

    @Test
    public void testHeal() {
        tested.damage(15L);
        assertEquals(5L, tested.getCurrentHp());
        tested.heal(15L);
        assertEquals(20L, tested.getCurrentHp());
        tested.heal(5L);
        assertEquals(20L, tested.getCurrentHp());
    }

    @Test
    public void testHeal2() {
        List<DamageModifier> modifiers = new ArrayList<>();
        modifiers.add(new DamageModifier(SpellType.NATURE, 20L));
        tested.damage(15L);
        assertEquals(5L, tested.getCurrentHp());
        tested.heal(modifiers);
        assertEquals(20L, tested.getCurrentHp());
        tested.heal(modifiers);
        assertEquals(20L, tested.getCurrentHp());
    }

    @Test
    public void testSetCurrentHp() {
        tested.setCurrentHp(10L);
        assertEquals(10L, tested.getCurrentHp());
        tested.setCurrentHp(20L);
    }

    @Test
    public void testSetDifficultyFactor() {
        tested.setDifficultyFactor(5);
        assertEquals(5, tested.getDifficultyFactor());
        tested.setDifficultyFactor(10);
    }

    @Test
    public void testSetLevel() {
        tested.setLevel(5);
        assertEquals(5, tested.getLevel());
        tested.setLevel(1);
    }

    @Test
    public void testSetMaxHp() {
        tested.setMaxHp(30L);
        assertEquals(30L, tested.getMaxHp());
        tested.setMaxHp(20L);
    }

    @Test
    public void testSetName() {
        tested.setName("tested2");
        assertEquals("tested2", tested.getName());
        tested.setName("tested");
    }
}
