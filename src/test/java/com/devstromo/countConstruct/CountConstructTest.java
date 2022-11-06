package com.devstromo.countConstruct;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CountConstructTest {
    private final CountConstruct countConstruct = new CountConstruct();

    @Test
    public void testCountConstruct() {
        assertEquals(1, countConstruct.solve("abcdef", new String[] { "ab", "abc", "cd", "def", "abcd" }));
        assertEquals(2, countConstruct.solve("purple", new String[] { "purp", "p", "ur", "le", "purpl" }));
        assertEquals(0, countConstruct.solve("skateboard", new String[] { "bo", "rd", "ate", "t", "ska", "sk", "boar" }));
        assertEquals(4, countConstruct.solve("enterapotentpot", new String[] { "a", "p", "ent", "enter", "ot", "o", "t" }));
        assertEquals(0, countConstruct.solve("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[] {
            "e",
            "ee",
            "eee",
            "eeee",
            "eeeee",
            "eeeeee" }));
    }

}