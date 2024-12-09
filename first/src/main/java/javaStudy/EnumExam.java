package javaStudy;

public class EnumExam {
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";
    public static void main(String[] args){
        String gender1;
        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;

        gender1 = "boy";  // error X

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;

        // gender2 = "boy"; // error O
        // 이처럼 특정 값만 가져다 사용하고 싶다면 enum 사용!
    }
}

enum Gender{
    MALE, FEMALE;
}
