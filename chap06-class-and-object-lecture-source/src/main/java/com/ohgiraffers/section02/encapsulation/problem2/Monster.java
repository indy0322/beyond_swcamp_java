package com.ohgiraffers.section02.encapsulation.problem2;

public class Monster {
    String name;
    // int hp;
    int mp;

    public void setInfo2(int info2){ //은닉화(hiding)
        // this.hp = info2;
        this.mp = info2;
    }
}
