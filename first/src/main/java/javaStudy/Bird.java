package javaStudy;

import java.beans.JavaBean;

public abstract class Bird {
    // 모호한 클래스는 부모만 될 수 있고, 객체는 구체적인 것만 될 수 있음
    public abstract void sing();  //
    public void fly(){
        System.out.println("fly");
    }
}
