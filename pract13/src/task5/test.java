package task5;

public class test {
    public static void main(String[] args) {
        TelNum telefon1 = new TelNum("+78005553535");
        System.out.println(telefon1.getTransform());
        TelNum telefon2 = new TelNum("88005553535");
        System.out.print(telefon2.getTransform());
    }
}
