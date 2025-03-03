package com.example.demo34.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
class MathUtilsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testSumArray_ValidCases() {
        assertEquals(10, MathUtils.sumArray(new int[]{1,2,3,4}));
        assertEquals(0, MathUtils.sumArray(new int[]{0,0,0}));
        assertEquals(-10, MathUtils.sumArray(new int[]{-5,-5}));
    }
    @Test
    void testSumArray_EmptyArray(){
        assertEquals(0, MathUtils.sumArray(new int[]{}));
    }


    @Test
    void tesstSumArray_NullArray(){
        assertThrows(IllegalArgumentException.class, () -> MathUtils.sumArray(null));

    }
}