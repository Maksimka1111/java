package task5;


import java.time.InstantSource;
import java.util.ArrayList;
import java.util.LinkedList;

public class t5 {
    static LinkedList<String> linkedList = new LinkedList<>();
    static ArrayList<String> arrayList = new ArrayList<>();
    public static void insert(int index, String element)
    {
        long start1 = System.nanoTime();
        linkedList.add(index,element);
        long finish1 = System.nanoTime();
        long elapsed1 = finish1-start1;

        long start2 = System.nanoTime();
        arrayList.add(index,element);
        long finish2 = System.nanoTime();
        long elapsed2 = finish2-start2;
        System.out.println("Insert:" + "\t" + "Linked list:" + elapsed1 + "ns; " + "Array list:" + elapsed2 + "ns.");
    }
    public static void delete(String element)
    {
        long start1 = System.nanoTime();
        linkedList.remove(element);
        long finish1 = System.nanoTime();
        long elapsed1 = finish1-start1;

        long start2 = System.nanoTime();
        arrayList.remove(element);
        long finish2 = System.nanoTime();
        long elapsed2 = finish2-start2;
        System.out.println("Delete:" + "\t" + "Linked list:" + elapsed1 + "ns; " + "Array list:" + elapsed2 + "ns.");
    }
    public static void add(String element)
    {
        long start1 = System.nanoTime();
        linkedList.add(element);
        long finish1 = System.nanoTime();
        long elapsed1 = finish1-start1;

        long start2 = System.nanoTime();
        arrayList.add(element);
        long finish2 = System.nanoTime();
        long elapsed2 = finish2-start2;
        System.out.println("Add:" + "\t" + "Linked list:" + elapsed1 + "ns; " + "Array list:" + elapsed2 + "ns.");
    }
    public static void search(String element)
    {
        long start1 = System.nanoTime();
        linkedList.contains(element);
        long finish1 = System.nanoTime();
        long elapsed1 = finish1-start1;

        long start2 = System.nanoTime();
        arrayList.contains(element);
        long finish2 = System.nanoTime();
        long elapsed2 = finish2-start2;
        System.out.print("Search:" + "\t" + "Linked list:" + elapsed1 + "ns; " + "Array list:" + elapsed2 + "ns.");
    }

    public static void main(String[] args){
        insert(0,"roewrkwe;krfelkfdmgjerjieprkwemldkfjgireopgmlefgoiergeogjoigmrbnrjojeipekfekrgjerpg");
        delete("roewrkwe;krfelkfdmgjerjieprkwemldkfjgireopgmlefgoiergeogjoigmrbnrjojeipekfekrgjerpg");
        add("23eqwlef;lfm,vdfkfkw;membnrotoprkwgmergmerpigjbl'l;ewlf;,lf;lfef[p[ewpoewfk4");
        search("eqwlef");
    }
}
