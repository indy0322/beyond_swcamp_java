package com.ohgiraffers.section02.encapsulation.resolve;

public class Monster {
    private String name; //encapsulation
    private int hp; //encapsulation

    public void setInfo1(String info1){
        this.name = info1;
    }
    public void setInfo2(int info2){
        if(info2 >= 0){
            this.hp = info2;
        }else{
            this.hp = 0;
        }

    }

    public String getInfo(){
        return this.name + "의 hp는 " + this.hp;
    }

}
