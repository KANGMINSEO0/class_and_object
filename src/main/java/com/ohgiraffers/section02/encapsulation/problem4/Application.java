package com.ohgiraffers.section02.encapsulation.problem4;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 접근제한자에 대해 이해하고 직접 필드에 접근하지 못하게 강제화 할 수 있다. */

        /* 목차 1. private 필드에 직접 접근하여 확인 */
        Monster monster1 = new Monster();
//        monster1.kinds = "프랑켄슈타인";
//        monster1.hp = 200;        // 필드에 직접 접근하는 것은 에러 발생

        /* 목차 2. public 메소드를 이용하여 필드에 간접 접근 */
        monster1.setKinds("프랑켄슈타인");
        monster1.setHp(200);

        System.out.println(monster1.getInfo());
        // 특정한 목적이나 이유가 없는 한 캡슐화의 원칙을 지켜야 한다.


    }
}
