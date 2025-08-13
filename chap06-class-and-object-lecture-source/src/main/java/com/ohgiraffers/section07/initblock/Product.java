package com.ohgiraffers.section07.initblock;

public class Product {
    private String name = "아이폰"; // 인스턴스 변수1
    private int price; // 인스턴스 변수2
    private static String brand; // 클래스 변수

    //name = "엘지"; ->  에러가 나옴. 메서드 내에서 초기화를 시켜야한다.

    /* 설명.
     *  초기화 블럭은 생성자 이전에 실행되며 어떤 생성자로 생성하든
     *  공통적인 로직이 있다면 작성.
    * */
    {// 초기화 블럭은 생성자보다 먼저 호출됨.
        System.out.println("초기화 블럭 실행.....");
        name = "폴드";
        price = 100;
        brand = "삼성";
    }

    static{ // 객체가 생성될 때 static 초기화 블럭(생성자, 일반 초기화 블럭, static 초기화 블럭 중에서)이 가장 먼저 동작한다.
        // price = 200; -> 에러가 나옴. //static 초기화 블럭에서 인스턴스 변수(non-static)에 접근이 불가능하다.
        brand = "현대";
    }

    public Product() {
        System.out.println("product 기본 생성자 호출됨...");
        brand = "퓨리오사AI";
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
