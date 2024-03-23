package playground;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/*
by hashset doesn't follow the insertion order
 */
public class Hashing {


    public static void main(String[] args) {
        int[] array = {2, 2, 5, 6, 77, 77, 99};
//        hashing(array);
        hashMap(array);
    }



    private static void hashing(int[] array) {
        HashSet hashValues = new HashSet<>();
        for(int i:array){
            hashValues.add(i);
        }
        System.out.println(hashValues);
        Iterator it = hashValues.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    private static void hashMap(int[] array) {
        HashMap<String, String> hashValues = new HashMap<>();
        hashValues.put("Perugu","Prasad");
        hashValues.put("Tagore","Writer");
        hashValues.put("Mega","Chiru");
//        System.out.println(hashValues.get("Perugu"));
                for(Map.Entry i:hashValues.entrySet()){
                    System.out.println(i.getValue());
        }

    }



}
