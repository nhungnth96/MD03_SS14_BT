package bt01;

import java.util.Arrays;

public class Main {
    // tăng dần
    public static void main(String[] args) {
        int[] arr1 = new int[20];
        for (int i = 0; i < 20; i++) {
            arr1[i] = (int) (Math.random() * 100);
        }
        int[] arr2 = new int[20];
        for (int i = 0; i < 20; i++) {
            arr2[i] = (int) (Math.random() * 100);
        }
        int[] arr3 = new int[20];
        for (int i = 0; i < 20; i++) {
            arr3[i] = (int) (Math.random() * 100);
        }
        System.out.println("Ori: " + Arrays.toString(arr1));
        selectionSort(arr1);
        System.out.println("SS: " + Arrays.toString(arr1));
        System.out.println("Ori: " + Arrays.toString(arr2));
        insertionSort(arr2);
        System.out.println("IS: " + Arrays.toString(arr2));
        System.out.println("Ori: " + Arrays.toString(arr3));
        bubbleSort(arr3);
        System.out.println("BS: " + Arrays.toString(arr3));

    }

    // chọn
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // chèn
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // nổi bọt
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}