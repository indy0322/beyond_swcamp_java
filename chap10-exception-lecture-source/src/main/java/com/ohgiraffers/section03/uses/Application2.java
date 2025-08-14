package com.ohgiraffers.section03.uses;

import java.io.*;

public class Application2 {
    public static void main(String[] args) {
        /* 수업목표. try-with-resaurce 구문을 이해하고 활용할 수 있다.(feat. finally 안씀) */
        try(BufferedReader br=new BufferedReader(new FileReader(new File("test.dat")))){//(BufferedReader br=new BufferedReader(new FileReader(new File("test.dat"))))는 BufferedReader br = null;와 br = new BufferedReader(new FileReader(new File("test1.dat")));를 합친 것이고
            //(BufferedReader br=new BufferedReader(new FileReader(new File("test.dat"))))는 finally{
            //
            //            try {
            //
            //                if(br != null){ //NPE(NullPointerException) 코드
            //                    br.close();
            //                }
            //            } catch (IOException e) {
            //                throw new RuntimeException(e);
            //            }
            //        }를 자동으로 만들어 준다.

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
