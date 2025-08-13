package com.ohgiraffers.section03.interfaceImplements;

import java.io.Serializable;

/* 설명. 인터페이스는 다중 구현(implements)이 가능하다. */
public class Product implements InterProduct, Serializable/*, AnotherInterProduct */{ //InterProduct 인터페이스가 AnotherInterProduct를 상속하고 있으면 굳이 구현 클래스에서 AnotherInterProdect까지 넣을 필요가 없다.

    @Override
    public void nonStaticMethod(int num) {
        System.out.println("넘어온 값은 " + num + "입니다.");
    }

    @Override
    public void nonStaticMethod2() {

    }

    @Override
    public void plusItems(String item, int num) {

    }
}
