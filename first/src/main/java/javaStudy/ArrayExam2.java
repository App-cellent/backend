package javaStudy;

public class ArrayExam2 {
    public static void main(String[] args){
        int[][] array4 = new int[3][4];
        array4[0][1] = 20;

        int[][] array5 = new int[3][];
        // 아직 열이 가리키는 게 없음
        array5[0] = new int[1];
        array5[1] = new int[2]; // 행마다 길이가 다름
        array5[0][0] = 10;

        int[][] array6 = {{1}, {1, 2}, {1, 2, 3}};
    }
}
