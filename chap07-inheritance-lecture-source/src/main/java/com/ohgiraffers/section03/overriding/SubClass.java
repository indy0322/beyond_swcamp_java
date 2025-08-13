package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass{

    /* 설명.
     *  @Override
     *  1. 오버라이딩 메소드를 확인하기 용이하도록 가독성 측면
     *  2. 오버라이딩 문법 위반 시 컴파일 에러 발생(feat. 개발 시 오류 감소)
    * */
    
    /* 설명. 부모 메소드와 헤드부 완전 일치 */
    @Override
    public void method(int num) {}
    
    /* 설명. 부모 메소드와 반환형 달라도 되는 경우(feat.부모 메소드의 반환형의 자식 타입으로는 가능 => 부모 메소드의 반환형은 Object이다.) */
    @Override
    public String method2(int num) {
        return null;
    }
    
    /* 설명. 부모 메소드가 private이면 오버라이딩 할 수 없다. */
    //@Override -> 에러가 나옴
    //private void privateMethod() {}
    
    /* 설명. 부모 메소드가 final이면 오버라이딩 할 수 없다. */
    //public final void finalMethod() {}
    
    /* 설명. protected */
    protected void protectedMethod() {}
    
    /* 설명. default */
    void defaultMethod() {}
}
