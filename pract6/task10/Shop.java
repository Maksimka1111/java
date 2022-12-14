package task10;

public class Shop implements ShopInterface {
    private static int size = 1;
    private static Computer[] computers = new Computer[size];
    @Override
    public void add(Computer computer) {
        size++;
        Computer[] computers1 = computers.clone();
        computers = new Computer[size];
        for(int i = 0; i<size-1; i++)
            computers[i] = computers1[i];
        computers[size-1] = computer;
    }

    @Override
    public String delete(Computer computer) {
        boolean s = false;
        for(int i = 0; i<size; i++) {
            if (computer.equals(computers[i]))
            {
                computers[i] = null;
                s = true;
            }
            if (!s && i == size-1)
                return "No such computer";
        }
        Computer[] computers1 = computers.clone();
        size--;
        int k = 0;
        computers = new Computer[size];
        for(int i = 0;i < size; i++)
            if (computers1[i]!=null)
            {
                computers[k] = computers1[i];
                k++;
            }
        return "Computer has been deleted";
    }

    @Override
    public String search(Computer computer) {
        boolean s = false;
        for(int i = 0; i<size; i++) {
            if (computer.equals(computers[i]))
            {
                return "There is such a computer";
            }
            if (!s && i == size-1)
                return "No such computer";
        }
        return "";
    }
}
