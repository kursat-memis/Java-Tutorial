package bolum_14_exception_ve_dosya_islemleri.dosya_islemleri;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class _3ObjectInputOutputStream {
    public static void main(String[] args) {
        // Dosyaya object yazmamızı veya dosyadan object okumamızı saglar.
        // Yazılacak-okunacak objenin üretildiği classın Serializable interface'ini implement etmesi gerekir.
        // Yazılacak-okunacak objenin üretildiği classın içinde final long serialVersionUID = 1F; adlı değişkenin tanımlanması gerekir. (Bunu elle belirtmemiz öneriliyo. Istersen belirtme.)

        dosyayaYaz();
        dosyadanOku();
        System.out.println("-------------------------------");

        // ArrayList'i dosyaya yazdırma veya dosyadan okuma:

        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Bayburt");
        sehirler.add("Istanbul");
        sehirler.add("Bursa");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("arrayList.dat")))) {
            objectOutputStream.writeObject(sehirler);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("arrayList.dat")))) {
            System.out.println(objectInputStream.readObject());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("-------");
        String[] sehirlerArray = {"Bayburt", "Istanbul", "Erzurum"};

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("array.dat")))) {
            objectOutputStream.writeObject(sehirlerArray);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("array.dat")))) {
            String[] s = (String[]) objectInputStream.readObject();
            for(String temp : s) {
                System.out.println(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("----------");

        // Map'i dosyaya yazma veya okuma:

        Map<Integer, String> sehirPlakalar = new HashMap<>();
        sehirPlakalar.put(69, "Bayburt");
        sehirPlakalar.put(34, "Istanbul");
        sehirPlakalar.put(61, "Trabzon");
        sehirPlakalar.put(16, "Bursa");

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("map.dat")))) {
            objectOutputStream.writeObject(sehirPlakalar);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("map.dat")))) {
            System.out.println(objectInputStream.readObject());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void dosyadanOku() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("ogrenciler1.dat")))) {
            try {
                while (true) {
                    System.out.println(objectInputStream.readObject());
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (EOFException eof) {
                System.out.println("Dosya sonuna gelindi.");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void dosyayaYaz() {
        Student s1 = new Student(1, "Kürşat", true);
        Student s2 = new Student(2, "Habib", false);
        Student s3 = new Student(3, "Furkan", true);
        Student s4 = new Student(4, "İlyas", false);
        Student s5 = new Student(5, "İbraaam", true);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("ogrenciler1.dat")))) {
            objectOutputStream.writeObject(s1);
            objectOutputStream.writeObject(s2);
            objectOutputStream.writeObject(s3);
            objectOutputStream.writeObject(s4);
            objectOutputStream.writeObject(s5);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
