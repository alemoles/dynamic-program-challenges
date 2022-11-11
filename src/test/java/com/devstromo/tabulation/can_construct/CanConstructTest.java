package com.devstromo.tabulation.can_construct;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CanConstructTest {
    private final CanConstruct canConstruct = new CanConstruct();
    @Test
    public void testCanConstruct() {
        assertTrue(canConstruct.solve("", new String[] { "ab", "abc", "cd", "def", "abcd" }));
        assertTrue(canConstruct.solve("ab", new String[] { "ab" }));
        assertTrue(canConstruct.solve("abcdef", new String[] { "ab", "abc", "cd", "def", "abcd" }));
    }

    @Test
    public void testCanNotConstruct() {
        assertFalse(canConstruct.solve("skateboard", new String[] { "bo", "rd", "ate", "t", "ska", "sk", "boar" }));
        assertFalse(canConstruct.solve("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[] {
            "e",
            "ee",
            "eee",
            "eeee",
            "eeeee",
            "eeeeee" }));
        assertFalse(canConstruct.solve("abcdef", new String[] { "ab", "abc", "cd", "dfe", "abcd" }));
    }
}