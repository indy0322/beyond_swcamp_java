package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. java.util.Scanner에서 제공하는 기능을 사용해 콘솔로부터 입력받기(feat.web 배우기 전까지) */
        Scanner sc = new Scanner(System.in);

        /* 설명. next(): 띄어쓰기 전까지 입력받은 문자열을 String으로 반환하는 메소드 */
        System.out.print("소속을 입력하세오: ");
        String className = sc.next(); // 공백(스페이스바)전까지만 인식한다. (공백(스페이스), 엔터는 인식을 못한다.)
        // String className2 = sc.next(); // '첫번째 분반'이라고 className에서 입력을하면 className은 첫번째, className2는 분반이 들어간다.
        System.out.println("className = " + className);
        // System.out.println("className2 = " + className2);

        /* 설명. nextLine(): 띄어쓰기 포함 개행 전까지 입력받아 Stirng으로 반환하는 메소드 */
        /* 설명. 버퍼에 남아있는 것이 있을 경우 별도로 nextLine() 메소드를 써서 버퍼 비우기 진행할 것 */
        //sc.nextLine();
        System.out.println("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.println("name = " + name);

        System.out.println("나이를 입력하세요: ");
        int age = sc.nextInt();
        System.out.println("age = " + age);

        System.out.println("키를 입력하세요: ");
        double height = sc.nextDouble();
        System.out.println("height = " + height);

    }
}
