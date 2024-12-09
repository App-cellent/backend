package javaStudy;

public class ExceptionExam2 {
    public static void main(String[] args){
        int i = 10;
        int j = 0;
        try {
            int k = divide(i, j);
            System.out.println(k);
        }catch (IllegalAccessException e){
            System.out.println(e);
        }
    }
//    throws
//    public static int divide(int i, int j) throws ArithmeticException{
//        int k = i/j;
//        return k;
//    }

    // throw
    public static int divide(int i, int j) throws IllegalAccessException {
        if(j == 0){
//            System.out.println("no zero");
//            return 0;
            throw new IllegalAccessException("no zero");
        }
        int k = i / j;
        return k;
    }
}
