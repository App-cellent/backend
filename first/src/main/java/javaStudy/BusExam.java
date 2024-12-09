package javaStudy;

public class BusExam {
    public static void main(String[] args){
//        Bus bus = new Bus();
//        bus.run();
//        bus.ppang();
//
//        Car car = new Car();
//        car.run();
//        // car.ppang(); : 부모가 가지고 있는 건 자식이 사용할 수 없음

        Car c = new Bus();
        // 부모 타입인 Car라는 타입으로 자식인 Bus를 가리킬 수 잇음
        c.run(); // 사용에 문제가 없지만 bus가 사용됨
        // c.ppang(); 부모타입으로 자식을 가리킬 순 있지만 부모에 있는 것만 사용 가능 -> 형변환해서 사용하자

        // Bus bus = c; : 에러 발생(큰 그릇을 작은 그릇에 넣을 수 없음)
        Bus bus = (Bus) c; // 형변환하면 가능 (bus가 car를 상속받았기에 가능함)
        bus.run();
        bus.ppang();
    }
}
