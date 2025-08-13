package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        /* 수업목표. 메소드의 파라미터(매개변수)에 대해 이해하고 사용할 수 있다. */
        ParameterTest pt = new ParameterTest();

        /* 목차. 1. 기본자료형을 매개변수로 전달 받는 메소드 호출 */
        int num = 20;
        System.out.println("call by value 전: " + num);
        pt.testPrimitiveTypeParameter(num);
        System.out.println("call by value 후: " + num);

        /* 목차. 2. 기본자료형 배열을 매개변수로 전달 받는 메소드 호출 */
        int[] iArr = new int[]{1,2,3,4,5};
        System.out.println("호출 전: " + Arrays.toString(iArr));
        pt.testPrimitiveArrayTypeParameter(iArr);
        System.out.println("호출 후: " + Arrays.toString(iArr));

        /* 목차. 3. 클래스 자료형을 매개변수로 전달 받는 메소드 호출 */
        Rectangle rect = new Rectangle(4,5);
        // rect.calArea();
        // rect.calRound();
        pt.testClassTypeParameter(rect);

        /* 목차. 4. 객체 배열은 배우지 않았으므로 뒤에서 다시 나올 예정 */
        /* 목차. 5. 가변인자를 매개변수로 전달 받는 메소드 호출(자바는 왠만하면 권장하지 않는다.) */
        pt.testVariableLengthArrayParameter();
        pt.testVariableLengthArrayParameter("홍길동");
        pt.testVariableLengthArrayParameter("유관순","볼링");
        pt.testVariableLengthArrayParameter("유관순", "낚시", "독서");

    }
}
