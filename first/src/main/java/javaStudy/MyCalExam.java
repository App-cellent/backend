package javaStudy;

public class MyCalExam {
    public static void main(String[] args){
        Calculator cal = new MyCal();
        cal.plus(3, 4);
        int i = cal.exec(5, 6);
        System.out.println(i);

        // static 호출하려면 참조변수(cal)로 호출 불가
        Calculator.exec2(3, 4);
    }


}
