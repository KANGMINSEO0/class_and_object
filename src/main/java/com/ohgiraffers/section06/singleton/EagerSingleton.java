package com.ohgiraffers.section06.singleton;

public class EagerSingleton {

    private static EagerSingleton eager = new EagerSingleton(); // 선언을 하자마자 객체를 만듬

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return eager;       // 위에서 만들었던 객체로 return
    }
}
