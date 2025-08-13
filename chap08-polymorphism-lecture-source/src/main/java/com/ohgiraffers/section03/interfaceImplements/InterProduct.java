package com.ohgiraffers.section03.interfaceImplements;

public interface InterProduct extends ParentInterProduct, AnotherInterProduct {//인터페이스는 다른 인터페이스를 상속할 수 있고 다중 상속이 가능하다.
    /* 설명. 상수 필드(feat. public static final) */
    public static final int MAX_NUM = 10; // public static final를 작성하지 않아도 알아서 public static final가 상수에 붙는다.
    int MIN_NUM = 1;

    /* 설명. 인터페이스는 생성자를 가지지 않는다. */

    /* 설명. 추상 메소드(feat. public abstract) */
    public abstract void nonStaticMethod(int num);
    void nonStaticMethod2();

    /* 설명. JDK 1.8부터 추가된 body가 있는 메소드들 */
    
    /* 설명. static 메소드 */
    public static void staticMethod(){
        
    }
    
    /* 설명. non-static 메소드 */
    public default void defaultMethod(){
    }
    
    /* 설명. private 접근 제어자 메소드 */
    private void privateMethod(){
        
    }
    
}
