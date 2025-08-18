package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {
        /* 수업목표. stakc에 대해 이해하고 사용할 수 있다. */
        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println("integerStack = " + integerStack);

        System.out.println("peek(): " + integerStack.peek());

        /* 설명. search()는 위에서부터 몇 번쨰에 있는 것인지를 통해 확인할 수 있다. */
        System.out.println("위에서 두 번째: " + integerStack.search(4));

        System.out.println("integerStack = " + integerStack);

        System.out.println("pop(): " + integerStack.pop());
        System.out.println("pop(): " + integerStack.pop());
        System.out.println("pop(): " + integerStack.pop());
        System.out.println("pop(): " + integerStack.pop());
        System.out.println("pop(): " + integerStack.pop());
        System.out.println("integerStack = " + integerStack);
    }
}
