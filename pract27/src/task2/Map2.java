package task2;

import java.util.HashMap;
import java.util.Map;

public class Map2{
    public static HashMap<String,String> createMap()
    {
        HashMap<String,String> hashMap = new HashMap<>();
        for(int i = 0; i<10; i++)
            hashMap.put("Sn" + i, "Name");
        return hashMap;
    }
    public static int getSameFirstNameCount(HashMap<String,String> hashMap,String name) {
        int counter = 0;
        for (Map.Entry<String,String> pair : hashMap.entrySet()) {
            if (pair.getValue().equals(name))
                counter++;
        }
        return counter;
    }
    public static int getSameSecondNameCount(HashMap<String,String> hashMap,String name) {
        int counter = 0;
        for (Map.Entry<String,String> pair : hashMap.entrySet()) {
            if (pair.getKey().equals(name))
                counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        HashMap <String,String> hashMap = new HashMap<>();
        hashMap = createMap();
        System.out.print("Count of names \"Name\": ");
        System.out.println(getSameFirstNameCount(hashMap,"Name"));
        System.out.print("Count of second names \"Sn1\": ");
        System.out.println(getSameSecondNameCount(hashMap,"Sn1"));
    }
}
