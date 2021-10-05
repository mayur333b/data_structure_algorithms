package com.code.dsa.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {
    @Test
    public void testStackFull() {
        Stack<Integer> intStack = new Stack<>(Integer.class, 2);
        intStack.push(1);
        intStack.push(2);
        Assertions.assertThrows(StackOverflowException.class, () -> intStack.push(3));
    }

    @Test
    public void testStackEmpty() {
        Stack<Integer> intStack = new Stack<>(Integer.class, 2);
        intStack.push(1);
        intStack.push(2);
        intStack.pop();
        intStack.pop();
        Assertions.assertThrows(StackUnderflowException.class, () -> intStack.pop());
    }

    @Test
    public void testStackSize() {
        Stack<Integer> intStack = new Stack<>(Integer.class, 2);
        intStack.push(1);
        Assertions.assertEquals(intStack.size(), 1);
    }
}
