package com.ohgiraffers.chap02.section01.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Application5Test {

    private static int low1 = 0, low2 = 0;
    private static int high1, high2;
    private static int[] act1, act2;
    private static int[] exp1, exp2;

    public Application5Test() {
    }

    @BeforeAll
    public static void set() {

        /* 예시1 */
        high1 = 5;      // size는 8
        act1 = new int[]{30, 7, 35, 40, 34, 18};
        exp1 = new int[]{40, 35, 34, 30, 18, 7};

        /* 예시2 */
        high2 = 9;      // size는 9
        act2 = new int[]{22, 19, 33, 7, 8, 39, 32, 11, 26, 20};
        exp2 = new int[]{39, 33, 32, 26, 22, 20, 19, 11, 8, 7};
    }

    public static Stream<Arguments> provideDescendingSource() { //Arguments는 JUnit5의 파라미터라이즈드 테스트에서 테스트 메서드에 전달할 인자 묶음을 표현하는 클래스이다.
        return Stream.of( //Stream.of는 배열이나 여러 개의 값을 받아서 스트림 객체를 만들어준다.
                arguments(low1, high1, act1, exp1), //arguments(...)는 한 세트의 테스트 케이스를 의미.
                arguments(low2, high2, act2, exp2)
        ); //반환형이 Stream<Arguments>이므로, 여러 개의 테스트 케이스를 한 번에 공급할 수 있다.
    }

    @DisplayName("병합 정렬 테스트")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest
    @MethodSource("provideDescendingSource")
    public void mergeSortTests(int low, int high, int[] actual, int[] expected) {
        Application5.solution(low, high, actual);
        Assertions.assertArrayEquals(expected, actual);
    }
}