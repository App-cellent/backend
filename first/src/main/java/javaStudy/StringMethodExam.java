package javaStudy;

public class StringMethodExam {
    public static void main(String[] args) {
        String str = new String("hello");
        String str_same = "hello";
        System.out.println(str.length());
        System.out.println(str.concat(" world"));
        System.out.println(str);

        str = str.concat(" world");
        System.out.println(str);

        System.out.println(str.substring(3, 7));
        // substring(3, 7) : 3번 인덱스부터 6번 인덱스까지 자르기
    }
}
