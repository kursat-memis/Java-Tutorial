package bolum_7_oop_introduction;

public class Introduction {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.showInfos();

        Student student2 = new Student("Muhammet Kürşat", "Memiş", 317454178, true);
        student2.showInfos();

        Student student3 = new Student("Ahmet", "Harun");
        student3.showInfos();

        System.out.println("--------------------------------------------------------------------------------");

        Student student = new Student();
        student.setAge(18);
        System.out.println("Age: " + student.getAge());
    }
}

class Student {
    String name, surname;
    long tcNo;
    boolean isActive;
    private int age;

    public Student() {
        System.out.println("An object created. (Default Const.)");
        name = "----";
        surname = "----";
        tcNo = 000;
        isActive = false;
    }

    public Student(String name, String surname, long tcNo, boolean isActive) {
        System.out.println("An object created. (Full Parametres Const.)");
        this.name = name;
        this.surname = surname;
        this.tcNo = tcNo;
        this.isActive = isActive;
    }

    public Student(String name, String surname) {
        this(123456789, false);
        System.out.println("An object created. (Two String Parametres Const.)");
        this.name = name;
        this.surname = surname;
    }

    public Student(long tcNo, boolean isActive) {
        System.out.println("An object created. (Two Parametres Const.)");
        this.tcNo = tcNo;
        this.isActive = isActive;
    }

    public void showInfos() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("TC No: " + tcNo);
        System.out.println("Active: " + isActive);
        System.out.println("-------------");
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }
}