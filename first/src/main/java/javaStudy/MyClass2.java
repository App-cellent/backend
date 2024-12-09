package javaStudy;

public class MyClass2 {
    public int Plus(int x, int y){
        return x + y;
    }

    public int Plus(int x, int y, int z){
        return x + y + z;
    }

    public String Plus(String x, String y){
        return x + y;
    }

    // 메소드 오버로딩 (메소드 명이 동일)
    // 타입은 같지만 매개변수 수가 다름
    // 매개변수 수는 같지만 리턴 타입이 다름
}
