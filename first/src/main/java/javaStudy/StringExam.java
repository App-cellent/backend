package javaStudy;

public class StringExam {
    public static void main(String[] args){
        String str1 = "hello";
        String str2 = "hello";
        // str1과 str2는 같은 값을 참조하고 있다.

        String str3 = new String("hello");
        String str4 = new String("hello");
        // str3과 str4는 서로 다른 값을 가리킨다.

        if(str1 == str2)
            System.out.println("str1 and str2 same");
        if(str1 == str3)
            System.out.println("str1 and str3 same");
        if(str3 == str4)
            System.out.println("str3 and str4 same");
            // str3.equals(str4)는 true


        System.out.println(str1.substring(3));
        // substring(3) : 3부터 잘라서 출력하는 것
        // 그러나 스트링 값은 원래 변하지 않음
    }
}
