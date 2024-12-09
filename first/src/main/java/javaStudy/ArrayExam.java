package javaStudy;

public class ArrayExam {

    public static void main(String[] args){
        int[] array1 = new int[100];
        // 배열은 처음 생성할 때의 크기가 변하지 않음
        // 꼭 new를 이용해 선언해주어야 함
        array1[0] = 50;
        array1[10] = 100;

        int[] array2 = new int[]{1, 2, 3, 4};
        int[] array3 = {1, 2, 3, 4};
        // 4개짜리 배열을 생성했고, 각 1, 2, 3, 4가 들어간 배열이다.

        System.out.println(array3[3]);
        int value = array3[0];

        System.out.println(value);

        // -------------

        for(int i = 0; i < array1.length; i ++){
            array1[i] = i + 1;
        }

        int sum = 0;
        for(int i = 0; i < array1.length; i++){
            sum += array1[i];
        }
    }
}
