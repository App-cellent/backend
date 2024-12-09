package javaStudy;

public class Truck extends Car{
    public Truck(){
        // Truck이 호출되면 자동으로 super();가 호출된 거임
        super(); // 부모의 생성자를 호출
        System.out.println("Truck의 기본 생성자입니다");
    }
}
