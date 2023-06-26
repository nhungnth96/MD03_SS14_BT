package bt03;

import java.util.Arrays;

public class Main {
     // string alphabet
    public static void main(String[] args) {
        String[] fruits1 = {"banana", "apple", "orange", "grape", "peach"};
        System.out.println("Ori: "+Arrays.toString(fruits1));
        selectionSort(fruits1);
        System.out.println("SS: " + Arrays.toString(fruits1));
        String[] fruits2 = {"banana", "apple", "orange", "grape", "peach"};
        System.out.println("Ori: "+Arrays.toString(fruits2));
        insertionSort(fruits2);
        System.out.println("IS: " + Arrays.toString(fruits2));
        String[] fruits3 = {"banana", "apple", "orange", "grape", "peach"};
        System.out.println("Ori: "+Arrays.toString(fruits3));
       bubbleSort(fruits3);
        System.out.println("BS: " + Arrays.toString(fruits3));

    }
    // chọn
    public static void selectionSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }
    // chèn
    public static void insertionSort(String[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
    // nổi bọt
    public static void bubbleSort(String[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
