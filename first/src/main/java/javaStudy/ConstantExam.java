package javaStudy;

public class ConstantExam {
    public static void main(String[] args){
        // Variable (변수)
        int i;
        i = 10;
        i = 5;

        // Constant (상수)
        final int J; // 상수는 대문자로만 사용하는 게 일반적
        J = 10;
        // J = 5; <- 상수는 값을 또 넣는 거 불가능

        double circleArea;
        final double PI = 3.141592;
        circleArea = 3 * 3 * PI;

        final int OIL_PRICE = 1450;
        int totalPrice = 50 * OIL_PRICE;
    }
}
