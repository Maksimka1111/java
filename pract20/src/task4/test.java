package task4;

public class test {
    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        MinMax minMax = new MinMax(arr);
        System.out.print("Max and min elements: " +  minMax.maxElement() + "\t");
        System.out.println(minMax.minElement() );
        Calculator calculator = new Calculator();
        Integer num1 = 5;
        Double num2 = 2.5;
        calculator.sum(num1,num2);
        calculator.multiply(num1,num2);
        calculator.divide(num1,num2);
        calculator.subtraction(num1,num2);
    }
}
