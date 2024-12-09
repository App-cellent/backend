package javaStudy;

public class Car {
    // 타입 필드명 : 타입,
    String name;
    int number;

    public Car(){
        System.out.println("Car의 기본 생성자입니다.");
    }

    public Car(String name){
        // name = n;
        // name = name;
        this.name = name; // this : 객체 자신을 참조하는 키워드
    }

//    public Car(){
//        this.name = "no name";
//        this.number = 0;
//        this("no name", 0); // 자신의 생성자 호출
//    }

    public Car(String name, int number){
        this.name = name;
        this.number = number;
    }

    public void run(){
        System.out.println("run");
    }
}
