package bolum_13_collection_framework_app.sansli_10_numara;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1.compareTo(o2) < 0) return -1;
                else if (o1.compareTo(o2) > 0) return 1;
                else return 0;
            }
        });
        createMap(map);
        ArrayList<Integer> arrayList = new ArrayList<>();
        createArrayList(map, arrayList);
        Set<Integer> set = new HashSet<>();
        createSet(arrayList, set);
        System.out.println("Şanslı 10 tane numara: " + set);

    }

    private static void createSet(ArrayList<Integer> arrayList, Set<Integer> set) {
        int randomIndex;
        while (set.size() != 5) {
            randomIndex = (int) (Math.random() * (arrayList.size())+1);
            set.add(arrayList.get(randomIndex));
        }
    }

    private static void createArrayList(Map<Integer, Integer> map, ArrayList<Integer> arrayList) {
        for (Map.Entry<Integer, Integer> temp : map.entrySet()) {
            for (int i = 0; i < temp.getValue(); i++) {
                arrayList.add(temp.getKey());

            }
        }
    }

    private static void createMap(Map<Integer, Integer> map) {
        int randomNumber;

        for (int i = 0; i < 10000000; i++) {
            randomNumber = (int) (Math.random() * 60);
            if (map.isEmpty() || !map.containsKey(randomNumber)) {
                map.put(randomNumber, 1);
            } else {
                map.put(randomNumber, map.get(randomNumber) + 1);
            }
        }

    }
}
