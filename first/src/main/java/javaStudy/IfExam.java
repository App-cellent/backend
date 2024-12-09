package javaStudy;

public class IfExam {

    public static void main(String[] args){
        int x = 50;
        int y = 60;

        if (x < y){
            System.out.println("x < y");
        }

        if(x == y)
            System.out.println("x == y");

        if (x == y){
            System.out.println("x == y");
        }else if(x < y) {
            System.out.println("x < y");
        }else {
            System.out.println("x != y");
        }
    }
}
