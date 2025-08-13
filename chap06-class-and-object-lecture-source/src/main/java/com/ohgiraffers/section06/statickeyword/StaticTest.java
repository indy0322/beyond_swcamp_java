package com.ohgiraffers.section06.statickeyword;

public class StaticTest {
    private int nonStaticCount; //private는 나만 접근이 가능하다는 뜻
    private static int staticCount; //private static은 자바가 작동할 때 인식은 되지만 나만 접근이 가능하다는 뜻, 여러 인스턴스가 공유를 함.
    
    public StaticTest(){
        
    }

    public int getNonstaticCount() {
        return nonStaticCount; //this.nonStaticCount; 와 같다.
    }

    public static int getStaticCount() { //static 변수는 static 메소드에서 반환해야한다.
        return staticCount; //StaticTest.staticCount; 와 같다.
    }

    public int increaseNonStaticCount() {
        return nonStaticCount++; //this.nonStaticCount++; 와 같다.
    }

    public static int increaseStaticCount() {
        return staticCount++; //StaticTest.staticCount++; 와 같다.
    }
}
