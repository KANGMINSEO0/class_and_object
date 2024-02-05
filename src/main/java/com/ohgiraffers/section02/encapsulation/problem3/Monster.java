package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {

    String name;
//    String nemes; // 필드명 바꾸면 여기 밑에 메소드에서 오류가 뜸
    int hp;

    public void setInfo (String info) {
        this.name = info;
//        this.name = name;     // 이렇게 하면 null로 나옴
    }

    public void setHp (int hp) {

        if (hp > 0) {
            this.hp = hp;
        } else {
            this.hp = 0;
        }
    }

    public String getInfo () {
        return  "몬스터의 이름은" + this.name + "이고, 체력은" + this.hp + "입니다.";
    }
}
