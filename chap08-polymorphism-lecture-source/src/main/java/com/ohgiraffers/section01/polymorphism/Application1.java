package com.ohgiraffers.section01.polymorphism;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표. 다형성과 타입 형변환에 대해 이해할 수 있다. */
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        System.out.println();

        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();
        
        Animal an1 = new Animal(); // 다형성 적용 X
        Animal an2 = new Tiger(); // (Animal) new Tiger(); 과 같다. => 다형성 적용 O
        Animal an3 = new Rabbit(); // 다형성 적용 O
        
        Object obj = new Animal(); // 다형성 적용 O
        
        /* 설명. Animal은 Tiger 또는 Rabbit 타입이 아니다.(지니고 있지 않다.) */
        //Tiger tr = new Animal(); -> 불가능 하다. 다형성 적용 X

        /* 필기. 은닉화 기술
        *   1. 필드 및 메소드 은닉(캡슐화)
        *   2. 타입 은닉(다형성)
        *   3. 구현 은닉
        * */

        an2.eat();      // 런타임 시점(코드를 실행시킬 때)에는 오버라이딩 된 자식 객체의 메소드가 동작(동적 바인딩)
        an3.eat();
        //an3.jump();  // 컴파일 시점(코드를 작성할 때)에는 이직 an3는 정적 바인딩만 지원됨.
        ((Rabbit)an3).jump(); //강제로 알려주면(강제 다운 캐스팅) 추가 메소드 호출 가능.


    }
}
