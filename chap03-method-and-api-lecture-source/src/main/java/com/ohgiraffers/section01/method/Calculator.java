package com.ohgiraffers.section01.method;

public class Calculator {
    public int plusTwoNumbers(int first, int second) {

        return first + second;
    }

    public int minTwoNumbers(int first, int second) {
        return (first < second) ? first : second;
    }

    /* 설명. static method일 경우 */
    public static int maxTwoNumbers(int first, int second) {
        return (first > second) ? first : second;
    }
}
