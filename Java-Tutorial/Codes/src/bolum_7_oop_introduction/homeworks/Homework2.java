package bolum_7_oop_introduction.homeworks;

public class Homework2 {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        generateStudents(students);
        sortByNotes(students);
        System.out.println("---------------------------------");
        printArray(students);
    }

    private static void printArray(Student[] students) {
        for (Student temp : students) {
            System.out.println(temp);
        }
    }

    private static void sortByNotes(Student[] students) {
        Student temp;
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getNote() > students[j].getNote()) {
                    temp = students[j];
                    students[j] = students[i];
                    students[i] = temp;
                }
            }
        }
    }

    private static void generateStudents(Student[] students) {
        int randomId, randomNote;
        Student student;

        for (int i = 0; i < 10; i++) {
            randomId = (int) (Math.random() * 101);
            randomNote = (int) (Math.random() * 101);
            student = new Student(randomId, randomNote);
            students[i] = student;
            System.out.println(student);
        }
    }
}

class Student {
    private int id;
    private double note;

    public Student(int id, double note) {
        this.id = id;
        this.note = note;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", note=" + note +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

}