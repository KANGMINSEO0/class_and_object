package com.ohgiraffers.section06.statickeyworld;

public class StaticFieldTest {

    private int nonStaticCount;
    private static int staticCount;

    public StaticFieldTest() {} // 기본생성자

    /* getter 메소드 */
    public int getNonStaticCount() {
        return this.nonStaticCount;
    }
    public int getStaticCount() {

        /* static 필드에 접근하기 위해서는 클래스명.필드명 으로 접근한다. */
        return StaticFieldTest.staticCount;
    }

    /* 호출 할 때 마다 두 필드 값을 1씩 증가시키시 위한 용도의 메소드 생성 */
    public void increaseNonStaticCount() {
        this.nonStaticCount++;
    }
    public void increaseStaticCount() {
        StaticFieldTest.staticCount++;
    }
}
