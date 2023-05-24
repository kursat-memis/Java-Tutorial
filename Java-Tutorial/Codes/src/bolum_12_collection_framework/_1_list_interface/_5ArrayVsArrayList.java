package bolum_12_collection_framework._1_list_interface;

import java.util.ArrayList;

public class _5ArrayVsArrayList {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10000000];
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>(10000000);

        long start, finish;
        start = System.currentTimeMillis();
        createArray(arr);
        finish = System.currentTimeMillis();
        long result = finish - start;

        System.out.println("Array olusturma suresi: " + result);

        start = System.currentTimeMillis();
        createArrayList(arrayList1);
        finish = System.currentTimeMillis();
        result = finish - start;

        System.out.println("ArrayList1 olusturma suresi: " + result);

        start = System.currentTimeMillis();
        createArrayList(arrayList2);
        finish = System.currentTimeMillis();
        result = finish - start;

        System.out.println("ArrayList2 olusturma suresi: " + result);

        // Basa eleman ekleme:
        start = System.currentTimeMillis();
        arr[0] = -1;
        finish = System.currentTimeMillis();
        result = finish - start;

        System.out.println("Arrayin basina eleman ekleme suresi: " + result);

        start = System.currentTimeMillis();
        arrayList1.add(0, -1);
        finish = System.currentTimeMillis();
        result = finish - start;

        System.out.println("ArrayList1'in basina eleman ekleme suresi: " + result);



    }

    private static void createArrayList(ArrayList<Integer> arrayList1) {
        for (int i = 0; i<10000000; i++) {
            arrayList1.add(1);
        }
    }

    private static void createArray(Integer[] arr) {
        for (int i = 0; i<10000000; i++) {
            arr[i] = i;
        }
    }
}
