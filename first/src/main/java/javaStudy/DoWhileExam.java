package javaStudy;

import java.util.Scanner;

public class DoWhileExam {
    public static void main(String[] args){
        int value = 0;
        Scanner scan = new Scanner(System.in);

        do{
            // 반복할 문장들
            value = scan.nextInt(); // 정수 값을 입력 받음
            System.out.println("입력받은 값 : " + value);
        } while (value != 10);  // 한 번은 무조건 수행하고 다음부터는 while이 만족해야 수행됨
        System.out.println("반복문 종료");
    }
}
