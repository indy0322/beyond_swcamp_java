package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_IfElse {
    public void testSimpleIfElseSatatement() {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 하나 입력하세요: ");
        int input = sc.nextInt();

//        만약에(홀수라면) {
//            "입력하신 정수는 홀수 입니다." 출력
//        } 그렇지 않다면 {
//            "입력하신 정수는 짝수 입니다." 출력

        if(input % 2 != 0){
            System.out.println("입력하신 정수는 홀수 입니다.");
        }else{
            System.out.println("입력하신 정수는 짝수입니다.");
        }
    }

    public void testNestedIfElseStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 하나 입력하세요: ");
        int input = sc.nextInt();

        /* 설명. 양수이면서 짝수, 양수이면서 홀수, 0 */
        if(input != 0){
            if(input > 0){
                if(input % 2 == 0){
                    System.out.println("양수이면서 짝수");
                }else {
                    System.out.println("양수이면서 홀수");
                }
            }
        }else{
            System.out.println("0");
        }

    }
}
