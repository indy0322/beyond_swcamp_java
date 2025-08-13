package com.ohgiraffers.section01.method;

public class Application2 {
    public static void main(String[] args) {
        System.out.println("main() 시작됨...");
        /* 설명. static method일 경우 */
        // methodA();
        // methodB();

        /* 설명. non-static method일 경우 */
        Application2 app = new Application2();
        app.methodA();  // 접근연산자(.)를 활용해서 접근해서 호출
        app.methodB();  // 접근연산자(.)를 활용해서 접근해서 호출

        System.out.println("main() 종료됨...");
    }

    public  void methodA(){
        System.out.println("methodA() 호출됨...");
        System.out.println("methodA() 종료됨...");
    } // static 메서드는 static이 있는 메서드이고 non-static 메서드는 static이 없는 메서드이다.
     // static은 자바가 처음인지 할 수 있도록 하는 기능이 있다.

    public  void methodB(){
        System.out.println("methodB() 호출됨...");
        System.out.println("methodB() 종료됨...");
    }
}
