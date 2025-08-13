package com.ohgiraffers.section01.array;

import java.util.Arrays;

public class Application1 {
    /* 수업목표. 배열에 대해 이해하고 배열의 사용 목적을 이해할 수 있다. */
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        int sum = 0;

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;

        System.out.println("sum = " + sum);

        int[] arr = new int[5]; // heap 영역에 [0][0][0][0][0]을 할당.
        System.out.println(arr[0]);

        System.out.println(arr); //[I@6b884d57 => [:배열이라는 뜻, I:int형, @:at이라는 뜻, 6b884d57: 힙영역의 주소

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for(int i = 0;i < 5; i++){
            arr[i] = 10 * (i + 1);
        }

        /* 설명. 반복문 없이 1차원 배열 출력해 보기 */
        // System.out.println(Arrays.toString(arr)); //배열을 문자열로 바꿔준다.

        for(int i = 0;i < 5; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
