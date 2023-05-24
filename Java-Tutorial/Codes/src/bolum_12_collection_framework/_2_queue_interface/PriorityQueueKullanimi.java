package bolum_12_collection_framework._2_queue_interface;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueKullanimi {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>();
        priorityQueue1.offer(3);
        priorityQueue1.offer(1);
        priorityQueue1.offer(2);
        priorityQueue1.offer(5);
        priorityQueue1.offer(4);

        // Elemanlar varsayılan olarak küçükken büyüğe doğru sıralandı. Bu yüzden ilk çıkacak olan eleman 1'dir.
        System.out.println("Cikan eleman: " + priorityQueue1.poll());

        PriorityQueue<String> priorityQueue2 = new PriorityQueue<>();
        priorityQueue2.offer("C");
        priorityQueue2.offer("A");
        priorityQueue2.offer("B");

        System.out.println("Cikan eleman: " + priorityQueue2.poll());

        // Kendi yazdığımız class tipinden objelerin nasıl sıralanacağını java bilmez. Bu yüzden classımızın Comparable interface'ini implement ederek
        // comparator methodunu implement etmesi gerekir.

        PriorityQueue<Student> students = new PriorityQueue<>();
        students.offer(new Student(3, 50));
        students.offer(new Student(1, 90));
        students.offer(new Student(2, 70));

        System.out.println("Cikan eleman: " + students.poll());
        System.out.println("Cikan eleman: " + students.poll());
        System.out.println("Cikan eleman: " + students.poll());

        // Queue oluştururken, constructor'a parametre olarak bir comparator göndererek istediğimiz sıralamayıda yaptırabiliriz.
        PriorityQueue<Person> people = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.name.compareTo(o2.name) > 0) return 1;
                else if(o1.name.compareTo(o2.name) < 0) return -1;
                else return 0;
            }
        });

        people.offer(new Person(3, "Ali"));
        people.offer(new Person(1, "Zeynep"));
        people.offer(new Person(2, "Hakan"));

        System.out.println("Cikan eleman: " + people.poll());
        System.out.println("Cikan eleman: " + people.poll());
        System.out.println("Cikan eleman: " + people.poll());



    }
}

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class Student implements Comparable<Student>{
    int id;
    int note;

    public Student(int id, int note) {
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

    @Override
    public int compareTo(Student o) {
        if (this.id > o.id) return 1;
        else if (this.id < o.id) return -1;
        else return 0;
    }
}