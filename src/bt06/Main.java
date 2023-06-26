package bt06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
    }
    public static void insertionSortByStep(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            // insert list[i] into a sorted sublist list[0..i-1] so that
            // list[0..i] is sorted
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            // Insert the current element into list[k+1]
            list[k + 1] = currentElement;
        }
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
        }

