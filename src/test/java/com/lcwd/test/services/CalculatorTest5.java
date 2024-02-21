package com.lcwd.test.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest5 {
@Test
        public void addTwoNumbers()
        {
            int actual = Calculator.addTwoNumbers(12,12);

            int expected = 24;

            Assertions.assertEquals(expected,actual);
        }
}
