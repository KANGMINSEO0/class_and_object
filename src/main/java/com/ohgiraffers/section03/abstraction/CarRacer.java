package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    private final Car car = new Car(); // 이 자동차는 카레이서만 쓸 수 있게 하는 것

    public void startUp() {
        car.startUp();;

    }
    public void stepAccelator() {
        car.go();

    }
    public void stapBreak() {
        car.stop();
    }
    public void turnOff() {
        car.turnOff();
    }
}
