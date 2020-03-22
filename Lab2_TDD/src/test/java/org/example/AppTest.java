package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.currency.Dollar;

/**
 * Unit test for currency App
 */
public class AppTest 
{
    public void testMultiplication()
    {
        Dollar five=new Dollar(5);
        five.times(2);
        assertEquals(10,five.amount);
    }
}
