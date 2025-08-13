package com.ohgiraffers.section03.stringbuilder;

public class Application2 {
    public static void main(String[] args) {
        /* 수업목표. StringBuilder의 자주 사용되는 메소드의 용법 및 원리를 이해할 수 있다. */
        //StringBuilder sb = new StringBuilder("javamariaDB");
        StringBuffer sb = new StringBuffer("javamariaDB"); //내부적으로 thread-safe 하다.

        /* 설명. 1. delete() */
        System.out.println("delete(): " + sb.delete(2, 5)); //jaariaDB => vam이 잘려나감.

        /* 설명. 2. deleteCharAt() */
        System.out.println("deleteCharAt(): " + sb.deleteCharAt(5));

        /* 설명. 3. insert() */
        System.out.println("insert(): " + sb.insert(1, "vao"));
        System.out.println("insert(): " + sb.insert(0, "j"));
        System.out.println("insert(): " + sb.insert(sb.length(), "jdbc")); //문자열에 가장 마지막(끝)에 붙인다.

        /* 설명. 4. reverse() */
        System.out.println("reverse(): " + sb.reverse());

    }
}
