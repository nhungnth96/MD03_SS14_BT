package bt02;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SortingStudent sortingStudent = new SortingStudent();
        Student[] students1 = sortingStudent.getAll();
        Student[] students2 = sortingStudent.getAll();
        Student[] students3 = sortingStudent.getAll();
        System.out.println("Ori:"+Arrays.toString(students1));
        sortingStudent.selectionSort(students1);
        System.out.println("SS: "+Arrays.toString(students1));
        sortingStudent.insertionSort(students2);
        System.out.println("IS: "+Arrays.toString(students2));
        sortingStudent.bubbleSort(students3);
        System.out.println("BS: "+Arrays.toString(students3));

    }
}
