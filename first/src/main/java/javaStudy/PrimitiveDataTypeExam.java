package javaStudy;

public class PrimitiveDataTypeExam {

    public static void main(String[] args){

        // byte < short, char < int < long < float < double

        int x = 50000;
        long y = x;

        long x2 = 5;
        // int y2 = x2; <- long을 int로 옮기려면 에러 발생
        int y2 = (int) x2;
    }
}
