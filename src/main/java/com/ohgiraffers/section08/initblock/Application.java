package com.ohgiraffers.section08.initblock;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 초기화블럭의 동작 순서를 이해하고 이를 활용하여 인스턴스를 생성할 수 있다. */
        /* 초기화블럭?
        *  복잡한 초기화를 수행할 수 있는 블럭을 제공하며, 인스턴스 초기화 블럭과 정적 초기화 블럭으로 구분된다.
        *  1. 인스턴스 초기화 블럭
        *  : 인스턴스가 생성되는 시점에 생성자가 호출되기 이전에 먼저 실행이 된다.
        *    인스턴스를 호출하는 시점마다 호출이 된다.
        *    인스턴스변수를 초기화하며 정적필드에는 실행시점마다 값을 덮어쓴다.
        *    {
        *        초기화 내용 작성
        *    }
        *  2. 정적 초기화 블럭
        *  : 클래스가 로드 될 때 한 번 동작한다.
        *    정적 필드를 초기화하며, 인스턴스변수는 초기화하지 못한다.
        *  static{
        *       초기화 내용 작성
        *     }
        * */
        Product product = new Product();

        System.out.println(product.getInformation());   // 자료형별 기본값으로 출력됨

        Product product2 = new Product("대륙폰", 300000, "샤우미");
        System.out.println(product2.getInformation());
    }
}
