package bolum_14_exception_ve_dosya_islemleri.dosya_islemleri;

import java.io.*;
import java.util.ArrayList;

public class _1InputOutputStream {
    public static void main(String[] args) {
        dosyayaYaz();

        dosyadanOku();
    }

    private static void dosyadanOku() {
        DataInputStream dataInputStream = null;
        ArrayList<Student> arraylist = new ArrayList<>();
        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("ogrenciler.dat")));
            boolean endOfFile = false;
            while (!endOfFile) {
                try {
                    arraylist.add(new Student(dataInputStream.readInt(), dataInputStream.readUTF(), dataInputStream.readBoolean()));
                } catch (EOFException eofException) {
                    endOfFile = true;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dataInputStream != null) {
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("ArrayList: " + arraylist);
    }

    private static void dosyayaYaz() {
        DataOutputStream dataOutputStream = null;
        try {
            Student student = new Student(1, "Kürşat", true);
            Student studen2 = new Student(2, "Ahmet", false);
            Student studen3 = new Student(3, "Mehmet", true);
            Student[] students = {student, studen2, studen3};
            dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("ogrenciler.dat")));

            for (int i = 0; i < students.length; i++) {
                dataOutputStream.writeInt(students[i].id);
                dataOutputStream.writeUTF(students[i].name);
                dataOutputStream.writeBoolean(students[i].isActive);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
