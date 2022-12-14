package task13;

public class test {
    public static void main(String[] args) {
        StringBuilderObserver stringBuilderObserver = new StringBuilderObserver();
        stringBuilderObserver.setListener(new StringBuilderObserver.MyListener());
        stringBuilderObserver.append(1);
        stringBuilderObserver.append(2);
    }
}
