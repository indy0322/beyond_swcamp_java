package com.ohgiraffers.section02.superkeyword;

public class Application {
    public static void main(String[] args) {
        /* 수업목표. supper. 과 super()에 대해 이해할 수 있다. */
        Product produect1 = new Product();
        System.out.println(produect1);

        Product product2 = new Product("p01","플레이데이터","자바",1000,new java.util.Date());

        Computer computer1 = new Computer();
        System.out.println(computer1);

        Computer computer2 = new Computer("퀄컴 스냅드래곤", 512, 16, "안드로이드");
        System.out.println(computer2);

        Computer computer3 = new Computer("p02","구글","픽셀", 1000000, new java.util.Date(), "퀄컴 스냅드레곤", 1024, 32, "윈도우");
        System.out.println(computer3);
    }
}
