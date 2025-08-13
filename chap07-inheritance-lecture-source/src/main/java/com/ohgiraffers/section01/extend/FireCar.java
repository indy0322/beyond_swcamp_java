package com.ohgiraffers.section01.extend;

public class FireCar extends Car{

    /* 설명. 자식 클래스의 생성자 */
    public FireCar() {
        super(); //작성하지 않아도 기본적으로 작성되어있음(모든 클래스에 해당됨.), 자식 클래스의 객체를 생성하면 부모 클래스의 객체도 생성된다.
        // 그래서 자식 클래스의 객체를 생성하면 자식(FireCar), 부모(Car), Object 3개 객체가 생성된다.
        System.out.println("FireCar 클래스의 기본 생성자 호출됨...");
    }

    /* 설명. 부모로부터 물려받은 메소드가 아닌 자식이 추가한 메소드 */
    public void sprayWater() {
        System.out.println("불난 곳을 찾았습니다. 물을 뿌립니다.");
    }


}
