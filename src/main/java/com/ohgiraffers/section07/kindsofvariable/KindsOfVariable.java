package com.ohgiraffers.section07.kindsofvariable;

public class KindsOfVariable {

    /* 수업목표. 다양한 변수들을 이해하고 사용할 수 있다. */
    /* 필기.
    *  클래스 영역에 작성하는 변수를 필드라고 한다.
    *  필드 == 멤버변수(클래스가 가지는 멤버라는 의미) == 전역변수(클래스 전역에서 사용할 수 있는 변수라는 의미)
    * */

    /* non-static field를 인스턴스변수라고 한다. (인스턴스 생성 시점에 사용 가능한 변수라는 의미) */
    private int globalNum;

    /* static field를 정적필드(클래스변수)라고 한다. (정적(클래스)영역에 생성되는 변수라는 의미) */
    private static int staticNum;

    public void testMethod(int num) {
        int localNum;       // 얘는 지역변수

        /* 필기.
        *  메소드 영역에서 작성한 변수를 지역변수라고 한다.
        *  메소드의 괄호 안에 선언하는 변수를 매개변수라고 한다.
        *  매개변수도 일종의 지역변수로 생각하면 된다.
        *  지역변수와 매개변수 모두 메소드 호출 시 stack에 할당 받아 stack에 생성된다.
        * */
        System.out.println(num);

        System.out.println(globalNum);

        System.out.println(staticNum);
    }

    public void testMethod1() {
//        System.out.println(localNum);   // 지역변수는 해당 지역(블럭 내)에서만 가능하다.
        System.out.println(globalNum);
        System.out.println(staticNum);
    }
}
