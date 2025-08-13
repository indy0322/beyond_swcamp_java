package com.ohgiraffers.section03.interfaceImplements;

public class Application {
    public static void main(String[] args) {
        Product product = new Product();
        product.nonStaticMethod(1);

        /* 설명. 추상 클래스와 마찬가지로 생성자를 활요한 객체 생성을 못함(생성자 자체가 없다.) */
//        InterProduct i = new InterProduct();

        InterProduct inter = new Product();
        inter.nonStaticMethod(2);
    }
}
