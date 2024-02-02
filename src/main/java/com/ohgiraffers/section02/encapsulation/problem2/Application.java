package com.ohgiraffers.section02.encapsulation.problem2;

public class Application {


    public static void main(String[] args) {

        /* 수업목표. 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해할 수 있다. */

        Monster monster1 = new Monster();
        monster1.name = "드라큘라";
        monster1.hp = 200;

        Monster monster2 = new Monster();
        monster2.name = "프랑켄슈타인";
        monster2.hp = 300;

        Monster monster3 = new Monster();
        monster3.name = "미이라";
        monster3.hp = 400;

        System.out.println("monster1 = " + monster1.name);
        System.out.println("monster1 = " + monster1.hp);
        System.out.println("monster2 = " + monster2.name);
        System.out.println("monster2 = " + monster2.hp);
        System.out.println("monster3 = " + monster3.name);
        System.out.println("monster3 = " + monster3.hp);

        // 필드명을 바꿀경우 등 유지보수가 힘들어진다.





    }
}
