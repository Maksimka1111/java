package task4;

public class test implements CompareableRealisation{
    int num = 0;
    @Override
    public int compareTo(int num2) {
        return Integer.compare(this.getNum(), num2);
    }
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        test test = new test();
        test.setNum(10);
        if (test.compareTo(20) > 0)
            System.out.print("test num > 20");
        if (test.compareTo(20) < 0)
            System.out.print("test num < 20");
        if (test.compareTo(20) == 0)
            System.out.print("test num = 20");
    }
}
