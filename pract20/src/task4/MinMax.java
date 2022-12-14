package task4;

public class MinMax <T>{
    private final T[] array;

    public MinMax(T[] array)
    {
        this.array = array;
    }

    public T getArray() {
        return array[0];
    }
        public T maxElement()
    {
       T arg1 = array[0];
       for(int i = 0; i<array.length; i++)
           if (Double.parseDouble(array[i].toString()) > Double.parseDouble(arg1.toString()))
           {
               arg1 = array[i];
           }
       return arg1;
    }
    public T minElement()
    {
        T arg1 = array[0];
        for(int i = 0; i<array.length; i++)
            if (Double.parseDouble(array[i].toString()) < Double.parseDouble(arg1.toString()))
            {
                arg1 = array[i];
            }
        return arg1;
    }
}
