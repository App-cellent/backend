package com.eightcruz.javastudy;

import javaStudy.AccessObj;

public class AccessObjExam extends AccessObj{
    public static void main(String[] args){
        AccessObjExam obj = new AccessObjExam();
        System.out.println(obj.p);
        System.out.println(obj.p2);
        // System.out.println(obj.k);   default : 패키지가 달라서 접근 불가
        // System.out.println(obj.i);   private만 접근 불가
    }
}
