package com.ohgiraffers.section04.dto;

public class PracticeDTO {

    private int number;             // 회원번호
    private String name;            // 회원명
    private int age;                // 나이
    private char gender;            // 성별
    private double height;          // 키
    private double weight;          // 몸무게
    private boolean isActivated;    // 회원탈퇴여부 (활성화여부)

    /* setter(설정자) 연습 */
    public void setNumber(int number) {
        this.number = number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setActivated(boolean isActivated) {
        this.isActivated = isActivated;
    }

    /* getter(접근자) 연습*/
    public int getNumber() {
        return this.number;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public char getGender() {
        return this.gender;
    }
    public double getHeight() {
        return this.height;
    }
    public double getWeight() {
        return this.weight;
    }
    public boolean isActivated() {
        return this.isActivated;
    }
}
