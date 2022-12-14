package task1;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.TreeSet;

public class HashsetToTreeset {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(1);
        System.out.println(hashSet);
        System.out.println("Now hashSet converted into treeSet;");
        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);
        System.out.println("Use of treeSet function tailSet:");
        System.out.println(treeSet.tailSet(3));
    }
}
