package javaStudy;

public class ForExam {
    public static void main(String[] args){
        int total = 0;
        for (int i = 1; i <= 100; i++){ // 초기화, 조건식, 수행문
            if (i % 2 != 0){
                continue; // 그 아래 실행문은 실행하지 않고 다음 for로 실행 = 짝수만 total에 더할 수 있음
            }
            if (i == 50){
                break; // 만난 순간 반복문 아예 탈출 
            }
            total += i;
        }
        System.out.println(total);
    }
}
