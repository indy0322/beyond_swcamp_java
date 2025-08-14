package com.ohgiraffers.section4.override;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();

        try{
            superClass.method();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
