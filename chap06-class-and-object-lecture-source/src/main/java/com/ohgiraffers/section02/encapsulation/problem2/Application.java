package com.ohgiraffers.section02.encapsulation.problem2;

public class Application {
    public static void main(String[] args) {
        Monster m = new Monster();
        m.name = "드라큘라";
        // m.hp = 200; //직접 접근(강결합)
        m.setInfo2(200); //직접 접근을 방지
    }
}
