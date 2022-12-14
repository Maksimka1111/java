package task1_2;

public class Generic<T,V,K> {
    T arg1;
    V arg2;
    K arg3;
    public Generic(T arg1, V arg2, K arg3)
    {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
    }

    public K getArg3() {
        return arg3;
    }

    public T getArg1() {
        return arg1;
    }

    public V getArg2() {
        return arg2;
    }
    public void print()
    {
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println(arg3);
    }
}