/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAdd() {
        App calc = new App();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtract() {
        App calc = new App();
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        App calc = new App();
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        App calc = new App();
        assertEquals(2, calc.divide(6, 3));
    }
}
