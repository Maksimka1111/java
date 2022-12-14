package task;

public class TableOrder implements Order {
    int size = 0;
    Customer customer;
    MenuItem[] items;

    @Override
    public boolean add(MenuItem item) {
        size++;
        if (size>1) {
            MenuItem[] temp = items.clone();
            items = new MenuItem[size];
            for (int i = 0; i < temp.length; i++)
                items[i] = temp[i];
            items[size - 1] = item;
        }
        else{
            items = new MenuItem[size];
            items[size - 1] = item;
        }
        return true;
    }

    @Override
    public boolean remove(String itemName) {
        for(int i = 0; i<items.length;i++) {
            if (items[i].getName().equals(itemName)) {
                size--;
                MenuItem[] temp = new MenuItem[size];
                items[i] = null;
                int k = 0;
                for(int j = 0; j<temp.length;j++)
                {
                    if (items[j]!=null)
                    {
                        temp[k] = items[j];
                        k++;
                    }
                }
                items = temp.clone();
                break;
            }
            else if (i == items.length-1)
                return false;
        }
        return true;
    }

    @Override
    public boolean remove(MenuItem item) {
        for(int i = 0; i<items.length;i++) {
            if (items[i].equals(item)) {
                MenuItem[] temp = new MenuItem[items.length];
                items[i] = null;
                int k = 0;
                for(int j = 0; j<temp.length;j++)
                {
                    if (items[i]!=null)
                    {
                        temp[k] = items[i];
                        k++;
                    }
                }
                size--;
                items = temp.clone();
                break;
            }
            else if (i == items.length-1)
                return false;
        }
        return true;
    }

    @Override
    public int costTotal() {
        int total = 0;
        for (MenuItem item : items) total += item.getCost();
        return total;
    }

    @Override
    public int itemQuantity(String itemName) {
        int total = 0;
        for (MenuItem item : items)
        {
            if (item.getName().equals(itemName))
                total++;
        }
        return total;
    }

    @Override
    public int itemQuantity(MenuItem itemName) {
        int total = 0;
        for (MenuItem item : items)
        {
            if (item.equals(itemName))
                total++;
        }
        return total;
    }

    @Override
    public int itemsQuantity() {
        return items.length;
    }

    @Override
    public int removeAll(MenuItem item) {
        int count = 0;
        for(MenuItem item1 : items)
        {
            if (item1.equals(item))
                if (remove(item1))
                    count++;
        }
        return count;
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;
        for(MenuItem item : items)
        {
            if (item.getName().equals(itemName))
                if (remove(item))
                    count++;
        }
        return count;
    }

    @Override
    public String[] itemNames() {
        String[] itemNames = new String[items.length];
        for(int i = 0; i<items.length;i++)
        {
            itemNames[i] = items[i].getName();
        }
        return itemNames;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        int[] temp = new int[items.length];
        int[] maxes = new int[items.length];
        for(int i = 0;i<items.length;i++)
        {
            temp[i] = items[i].getCost();
            maxes[i] = 0;
        }
        int ind = 0;
        for(int i = 0;i<items.length;i++)
        {
            for(int j = 0; j<items.length;j++)
            {
                if (temp[j] >= maxes[i])
                {
                    maxes[i] = temp[j];
                    ind = j;
                }
            }
            temp[ind] = 0;
        }
        int[] repeats = new int[items.length+1];
        MenuItem[] items1 = new MenuItem[items.length];
        boolean x = true;
        repeats[0] = -1;
        for(int i = 0; i<items.length;i++)
        {
            for(int j = 0; j<items.length;j++)
            {
                if (repeats[j] == maxes[j])
                {
                    x = false;
                    break;
                }
                else x = true;
            }
            for(int j = 0; j<items.length;j++)
                if (items[i].getCost() == maxes[j] && x) {
                    items1[items.length-i-1] = items[i];
                    break;
                }
        }
        return items1;
    }

    @Override
    public MenuItem[] getItems() {
        return items;
    }
    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    @Override
    public Customer getCustomer() {
        return customer;
    }
}
