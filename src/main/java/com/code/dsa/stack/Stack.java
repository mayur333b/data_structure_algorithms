package com.code.dsa.stack;

import java.lang.reflect.Array;

public class Stack<T> {

    private int top = -1;
    private int capacity;
    private T[] arr;

    @SuppressWarnings("unchecked")
    public Stack(Class<T> clazz, int capacity) {
        this.capacity = capacity;
        arr = (T[]) Array.newInstance(clazz, capacity);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top + 1 == capacity;
    }

    public T pop() {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty. Can not pop element.");
        }
        return arr[top--];
    }

    public void push(T element) {
        if (isFull()) {
            throw new StackOverflowException("Stack is full. Can not push element.");
        }
        arr[++top] = element;
    }

    public int size() {
        return top + 1;
    }

    public void print() {
        for (T element : arr) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>(Integer.class, 2);
        intStack.push(1);
        intStack.push(2);
        //intStack.push(3);
        intStack.print();

    }
}
