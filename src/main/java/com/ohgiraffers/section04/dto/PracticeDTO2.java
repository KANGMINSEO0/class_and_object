package com.ohgiraffers.section04.dto;

public class PracticeDTO2 {

    private int number;
    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;
    private String phone;
    private String email;
    private boolean activateCheck;

    /* setter */
    public void setNumber(int number) {this.number = number;}
    public void setId(String id) {this.id = id;}
    public void setPwd(String pwd) {this.pwd = pwd;}
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public void setGender(char gender) {this.gender = gender;}
    public void setPhone(String phone) {this.phone = phone;}
    public void setEmail(String email) {this.email = email;}
    public void setActivateCheck(boolean activateCheck) {this.activateCheck = activateCheck;}

    /* getter */
    public int getNumber() {
        return this.number;
    }




}
