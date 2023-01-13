package mahmut;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {

        int[] arr = {1, 2, 96, 0, 0, 4, 8, 68, 0};



        System.out.println(Arrays.toString( print(arr)));
    }

    public static int[] print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length-1; j++) {

                if (arr[j] >arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
                System.out.println(Arrays.toString(arr));
            }
        }
        return arr;

    }
}
