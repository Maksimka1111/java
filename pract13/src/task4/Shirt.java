package task4;

public class Shirt {
    String[] shirts;
    public void toShirt(String[] array)
    {
        shirts = array;
    }
    public String toString()
    {
        String str = "";
        for(int i = 0; i<shirts.length;i++)
        {
            str += "Shirt " + (i+1) + ": " + shirts[i] + "\n";
        }
        return str;
    }
}
