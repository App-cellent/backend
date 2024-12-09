package javaStudy;

public class CarExam2 {
    public static void main(String[] args){
        // Car c1 = new Car();
        // Car에서 생성자 만들었더니 기본 생성자는 안만들어지면서 오류 코드 됨
        Car c2 = new Car("소방차");
        Car c3 = new Car("구급차");
        System.out.println(c2.name);
        System.out.println(c3.name);
    }
}
