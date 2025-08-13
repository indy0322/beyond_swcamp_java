package com.ohgiraffers.section02.abstractclass;

public class Phone extends Product {

    public Phone(){
        super();
    }

    @Override
    public void abstractMethod() {
        System.out.println("안빼먹고 오버라이딩 잘 했다잉!~");
    }// 자식 클래스는 추상 클래스인 부모의 추상 메소드를 반드시 오버라이딩을 해야한다.
}
