package javaStudy;

public class TruckExam {
    public static void main(String[] args){
        Truck truck = new Truck();
        // 생성자가 호출될 때 자동으로 부모의 생성자가 호출되면서 부모 객체를 초기화한다.
        // 자신을 가리키는 키워드는 this, 부모를 가리키는 키워드는 super



        Car car = new Car();
    }
}
