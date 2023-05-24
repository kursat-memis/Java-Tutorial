package bolum_14_exception_ve_dosya_islemleri.dosya_islemleri;

import java.io.Serializable;

public class Student implements Serializable {
    int id;
    String name;
    boolean isActive;
    // private final long serialVerionUID = 3;

    public Student(int id, String name, boolean isActive) {
        this.id = id;
        this.name = name;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
