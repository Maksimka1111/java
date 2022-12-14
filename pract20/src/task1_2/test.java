package task1_2;

public class test {
    public static void main(String[] args) {
        String a = "123";
        int b = 4;
        char c = '5';
        Generic<String,Integer,Character> generic = new Generic<String,Integer,Character>(a,b,c);
        generic.print();
    }
}
