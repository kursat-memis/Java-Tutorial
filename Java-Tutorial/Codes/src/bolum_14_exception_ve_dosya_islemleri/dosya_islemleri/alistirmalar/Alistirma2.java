package bolum_14_exception_ve_dosya_islemleri.dosya_islemleri.alistirmalar;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Alistirma2 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = openFile();
        ArrayList<Person> employees = readEmployees(bufferedReader);
        System.out.println("Employees before sorting: " + employees);
        closeFile(bufferedReader);
        Collections.sort(employees);
        System.out.println("Employees after sorting: " + employees);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("siralanmisMaas.txt"))){
            ;
            for (int i = 0; i< employees.size(); i++) {
                bufferedWriter.write(employees.get(i).name);
                bufferedWriter.write(" ");
                bufferedWriter.write(String.valueOf(employees.get(i).salary));
                bufferedWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<Person> readEmployees(BufferedReader bufferedReader) {
        ArrayList<Person> employees = new ArrayList<>();
        String name;
        int salary;
        String line;

        try {
            while ((line = bufferedReader.readLine()) != null) {
                name = line.split(" ")[0];
                salary = Integer.parseInt(line.split(" ")[1]);
                employees.add(new Person(name, salary));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return employees;
    }

    private static void closeFile(BufferedReader bufferedReader) {
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static BufferedReader openFile() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("maas.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return bufferedReader;
    }
}

class Person implements Comparable<Person> {
    String name;
    int salary;

    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.salary < o.salary) return 1;
        else if (this.salary > o.salary) return -1;
        else return 0;
    }
}