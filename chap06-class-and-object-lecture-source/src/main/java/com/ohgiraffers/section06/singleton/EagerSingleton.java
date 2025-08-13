package com.ohgiraffers.section06.singleton;

public class EagerSingleton {

    private static EagerSingleton eager = new EagerSingleton(); // 자바를 작동시키자마자 생성되는 단 하나의 객체여야 하기 때문에 static을 붙인다.
                                                                // 메모리의 method(static) 영역에 저장된다.

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return eager;
    }
}
