package com.ohgiraffers.section06.statickeyworld;

public class StaticMethodTest {

    private int count;

    public void nonStaticMethod() {
        this.count++;

        System.out.println("nonStaticMethod 호출됨...");
    }

    public static void staticMethod() {
//        this.count++;   // 인스턴스를 생성하지 않았기 때문에 this에 주소값이 생길 수 없음

        System.out.println("staticMethod 호출됨...");
    }
}
