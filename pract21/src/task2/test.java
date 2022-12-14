package task2;

public class test {
    public static void main(String[] args) {
        Integer [] array = {0,1,2,3};
        t2 per = new t2();
        per.setArr(array);
        System.out.println(per.getArr().length);
        System.out.println(per.getArrIndex(2));
        per.firstFive();
    }
}
