package com.ohgiraffers.section03.stringbuilder;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표. String과 StringBuilder(또는 StringBuffer)와의 차이점에 대해 이해하고 사용할 수 있다. */
        /* 설명.
         *  String은 불변객체(immutable object) => 가진 값이 변하지 않는 객체, StringBuilder(또는 StringBuffer)는 가변객체(mutable object) => 가진 값이 변하는 객체
         *
        * */

        String testStr = "java";
        // StringBuilder sb = "kotlin";
        StringBuilder testSb = new StringBuilder("kotlin");

        for(int i = 0;i < 20;i++){
            testStr += i;
            testSb.append(i);

            System.out.println("String의 경우: " + System.identityHashCode(testStr)); //변화를 줄 때마다 String 주소에 변화가 생긴다.(변화가 생길 때마다 객체를 계속 생성) 변화가 많이 생길 때는 String을 사용하면 안된다.
            System.out.println("StringBuilder의 경우: " + System.identityHashCode(testSb)); //변화를 줘도 주소에 변화가 없다.
        }

        System.out.println("testStr = " + testStr);
        System.out.println("testSb = " + testSb);

        /* 설명. StringBuilder가 가변인 이유 */
        StringBuilder sb2 = new StringBuilder();
        System.out.println("StringBuilder의 초기 용량: " + sb2.capacity()); //16이 나옴

        StringBuilder sb3 = new StringBuilder("java");
        System.out.println("StringBuilder의 초기 용량(\"java\"): " + sb3.capacity()); //20이 나옴 -> 처음 용량에서 문자를 추가한 만큼 용량이 커져서 나옴.

        for(int i = 0;i < 30;i++){
            System.out.println(sb3);
            sb3.append(i);
            System.out.println(sb3.capacity()); //용량이 찰 때, 용량을 2배에 + 2씩 용량을 키움.
        }
    }
}
