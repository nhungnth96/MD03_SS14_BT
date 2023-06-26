package bt02;

public class SortingStudent {
    private Student[] students = {  new Student(1, "Nhung", 65.5),
    new Student(2, "Duy", 80.6),
    new Student(3, "Thùy", 88.9),
      new Student(4, "Khánh", 96.7),
    new Student(5, "Bình", 97.8)};
    public Student[] getAll(){
        return students;
    }
    // chọn
    public void selectionSort(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (students[j].getScore() > students[maxIndex].getScore()) {
                    maxIndex = j;
                }
            }
            Student temp = students[maxIndex];
            students[maxIndex] = students[i];
            students[i] = temp;
        }
    }
    // chèn
    public void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; ++i) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getScore() < key.getScore()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }
    // nổi bọt
    public void bubbleSort (Student[] students){
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].getScore() < students[j + 1].getScore()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}

