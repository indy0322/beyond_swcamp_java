package com.ohgiraffers.section04.interfacesegrgation.resolved;

public class BasicPrinter implements PrintOnly{

    @Override
    public void print() {
        System.out.println("깔끔하게 문서를 출력합니다.");
    }
}
