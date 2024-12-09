package javaStudy;

public class SwitchExam {

    public static void main(String[] args){
        // switch, case, default, break

        int value = 1;

        switch(value){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("other");
        }

        String str = "A";  // JDK 7 부터는 switch 문에 문자열도 사용 가능
        switch (str){
            case "A":
                System.out.println("A");
                break;
        }
    }
}
