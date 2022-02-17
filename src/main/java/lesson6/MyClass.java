package lesson6;

import java.util.Arrays;

public class MyClass {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayAfter4(new int[]{1, 3, 4, 4, 2, 3, 4, 1, 7})));
        System.out.println(Arrays.toString(arrayAfter4(new int[]{1, 3, 4, 8, 5, 3, 3, 2})));
        System.out.println(Arrays.toString(arrayAfter4(new int[]{1, 1, 7, 4, 2, 3, 44, 4, 7})));
        System.out.println(Arrays.toString(arrayAfter4(new int[]{1, 1, 7, 22, 3, 444, 7})));

       /* System.out.println(Arrays.toString(new boolean[]{arrayContains1And4(new int[]{1, 1, 7, 4, 2, 3, 44, 4, 7})}));
        System.out.println(Arrays.toString(new boolean[]{arrayContains1And4(new int[]{1, 1, 7, 4, 2, 3, 44, 4, 7})}));
        System.out.println(Arrays.toString(new boolean[]{arrayContains1And4(new int[]{44, 4, 4})}));
        System.out.println(Arrays.toString(new boolean[]{arrayContains1And4(new int[]{1, 4, 1, 1})}));*/

    }

    public static int[] arrayAfter4(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                return Arrays.copyOfRange(arr, i + 1, arr.length);
            }
        }
        throw new RuntimeException("Массив без  4");
    }

    public static boolean arrayContains1And4(int[] arr) {
        boolean has1 = false;
        boolean has4 = false;
        for (int j : arr) {
            if (j != 1 && j != 4) {
                return false;
            }
            if (j == 1) {
                has1 = true;
            }
            if (j == 4) {
                has4 = true;
            }
        }
        return has1 && has4;
    }

}