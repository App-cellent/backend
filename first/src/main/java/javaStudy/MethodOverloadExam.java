package javaStudy;

public class MethodOverloadExam {
    public static void main(String[] args){
        MyClass2 m = new MyClass2();

        System.out.println(m.Plus(4, 5));
        System.out.println(m.Plus(4, 5, 6));
        System.out.println(m.Plus("hello", " world"));
    }
}
