package com.ohgiraffers.chap04.section01.greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/* 설명. 추가 클래스를 활용한 정렬 방법 */
public class Application3_1 {
    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static Integer solution(String input) throws IOException {
        int max_count = 0;

        BufferedReader br = toBufferedReader(input);
        int N = Integer.parseInt(br.readLine());

        ArrayList<Time> timeList = new ArrayList<>();

        StringTokenizer st;
        for(int i = 0;i < N;i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            timeList.add(new Time(start,end));
        }

        /* 설명. 컬렉션을 활용한 정렬 */
        Collections.sort(timeList);
        //timeLIst.sort(null);

//        timeList.stream().forEach(System.out::println);

        /* 설명. 첫 회의도 0시 이후라는 생각으로 조건에 만족하는 회의들로 최대 회의를 개최하게 함 */
        int lastEndTime = 0;
        for(int i = 0;i < N;i++){
            if(timeList.get(i).start == timeList.get(i).end){
                max_count++;
                continue;
            }

            if(timeList.get(i).start >= lastEndTime){ //겹치지 않게
                max_count++;
                lastEndTime = timeList.get(i).end;
            }
        }


        return max_count;

    }


}
/* 설명. 각 회의 객체를 만들 수 있는 클래스(end 시간 오름차순 정의) */
class Time implements Comparable<Time>{
    public int start, end;
    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override //compareTo 메소드는 객체끼리 크기(순서)를 비교해야 할 때 사용
    public int compareTo(Time o) { // Collections.sort();,Arrays.sort(); 와 같은 정렬을 위해 사용
//        if(this.end == o.end) return o.start - this.start; // start 시간으로 내림차순 정렬
        return this.end - o.end;  // end 시간으로 오름차순 정렬
    }//음수 → this가 o보다 작다, 0 → 두 객체가 같다, 양수 → this가 o보다 크다


    /* 설명. 중간 값 확인용 toString() */
//    @Override
//    public String toString() {
//        return "Time{" +
//                "start=" + start +
//                ", end=" + end +
//                '}';
//    }
}