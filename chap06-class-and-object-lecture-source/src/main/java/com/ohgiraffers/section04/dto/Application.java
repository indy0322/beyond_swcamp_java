package com.ohgiraffers.section04.dto;

public class Application {
    public static void main(String[] args) {
        UserDTO user1 = new UserDTO();
        System.out.println(user1); // UserDTO 객체의 toString() 메소드 덕분에 필드값을 가져온다.

        UserDTO user2 = new UserDTO("user01", "pass01", "홍길도", new java.util.Date());
        System.out.println("user = " + user2);

        /* 설명. JSP, Spring Framework, Mybatis, ... 등에서 사용할 예정 */
        user2.setName("유관순");
        System.out.println("user2 = " + user2.getName());
    }
}
