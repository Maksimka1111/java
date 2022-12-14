package task2;

import java.util.ArrayList;
import java.util.List;

public class t2 <E>{
    private E[] arr;
    public void setArr(E [] array){
        this.arr = array;
    }
    public E[] getArr()
    {
        return this.arr;
    }
    public E getArrIndex(int i)
    {
        return this.arr[i];
    }
    public void firstFive()
    {
        int size = 5;
        if (size > arr.length)
            size = arr.length;
        for(int i = 0; i<size; i++)
            if (arr[i]!=null)
                System.out.println("Element " + (i+1) + ": " + arr[i]);
    }
}
