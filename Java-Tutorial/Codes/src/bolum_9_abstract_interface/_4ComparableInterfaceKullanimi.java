package bolum_9_abstract_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _4ComparableInterfaceKullanimi {
    public static void main(String[] args) {
        int[] sayilar = {3, 1, 2};
        System.out.println("Sıralanmadan önce sayılar: ");
        printArray(sayilar);
        Arrays.sort(sayilar); // primitive tipten verileri sıraladı.
        System.out.println("Sıralandıktan sonra sayılar: ");
        printArray(sayilar);

        System.out.println("--------------------");

        Integer[] numbers = {3, 1, 2};
        String[] names = {"emre", "ali", "hasan"};

        System.out.println("Sıralanmadan önce sayılar: ");
        printArray(numbers);
        Arrays.sort(numbers); // Wrapper Class tipindeki verileri sıraladı.
        System.out.println("Sıralandıktan sonra sayılar: ");
        printArray(numbers);

        System.out.println("--------------------");

        System.out.println("Sıralanmadan önce isimler: ");
        printArray(names);
        Arrays.sort(names); // String tipinden verileri sıraladı.
        System.out.println("Sıralandıktan sonra isimler: ");
        printArray(names);

        System.out.println("--------------------");

        ArrayList<Integer> numbersArrayList = new ArrayList<>();
        numbersArrayList.add(3);
        numbersArrayList.add(1);
        numbersArrayList.add(2);
        System.out.println("Sıralanmadan önce sayılar: ");
        printArrayList(numbersArrayList);
        Collections.sort(numbersArrayList); // Wrapper tipinden verileri sıraladı.
        System.out.println("Sıralandıktan sonra sayılar: ");
        printArrayList(numbersArrayList);

        System.out.println("--------------------");

        Student student1 = new Student(3, "Emre");
        Student student2 = new Student(1, "Hakan");
        Student student3 = new Student(2, "Ali");
        Student student4 = new Student(1, "Betul");
        Student student5 = new Student(1, "Zeynep");

        Student[] studentsArr = {student1, student2, student3, student4, student5};
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);


        System.out.println("Sıralanmadan önce Student dizisi: ");
        printArray(studentsArr);
        System.out.println("Sıralanmadan önce Student ArrayListi: ");
        printArrayList(studentArrayList);

        Arrays.sort(studentsArr);
        Collections.sort(studentArrayList);

        System.out.println("Sıralandıktan sonra Student dizisi: ");
        printArray(studentsArr);
        System.out.println("Sıralandıktan sonra Student ArrayListi: ");
        printArrayList(studentArrayList);

    }

    private static void printArray(Object[] arr) {
        for (Object temp : arr) {
            System.out.println(temp);
        }
    }

    private static void printArray(int[] arr) {
        for (int temp : arr) {
            System.out.println(temp);
        }
    }

    private static <T extends Object> void printArrayList(ArrayList<T> arrayList) {
        for (Object temp : arrayList) {
            System.out.println(temp);
        }
    }
}

class Student implements Comparable<Student>{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + " Name: " + this.name;
    }



    /*
        id degerine gore elemanları sıralar.
        id degerleri aynı olanları isme göre sıralar.
     */
    @Override
    public int compareTo(Student o) {
        if (this.id < o.id) return -1;
        else if (this.id > o.id) return 1;
        else {
            if (this.name.compareTo(o.name) < 0) return -1;
            else if (this.name.compareTo(o.name) > 0) return 1;
            else return 0;
        }
    }
}
