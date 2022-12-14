package task;

import java.io.Serializable;

public class TableOrdersManager implements OrdersManager, Serializable {
    Order[] orders = new Order[100];

    public void add(Order order, int tableNumber) {
        orders[tableNumber] = order;
    }
    public void addItem(MenuItem item, int tableNumber)
    {
        orders[tableNumber].add(item);
    }
    int freeTableNumber()
    {
        for(int i = 0; i< orders.length; i++)
        {
            if (orders[i] == null)
                return (i+1);
            if (i == orders.length-1)
                return i;
        }
        return 0;
    }
    int[] freeTableNumbers()
    {
        int[] free = new int[100];
        for(int i = 0; i< orders.length; i++)
        {
            if (orders[i] == null)
                free[i] = i+1;
            if (i == orders.length-1)
                free[i] = 100;
        }
        return free;
    }
    public Order getOrder(int tableNumber)
    {
        tableNumber--;
        return orders[tableNumber];
    }
    void remove(int tableNumber){
        Order[] temp = new Order[orders.length];
        orders[tableNumber] = null;
        int k =0;
        for(int i = 0; i<orders.length; i++)
            if (orders[i]!=null)
            {
                temp[k] = orders[i];
                k++;
            }
        orders = temp.clone();
    }
    int remove (Order order)
    {
        Order[] temp = new Order[orders.length];
        for(int i = 0; i<orders.length;i++) {
            if (orders[i]!=null) {
                if (orders[i].equals(order)) {
                    orders[i] = null;
                    break;
                } else if (i == orders.length - 1)
                    return 0;
            }
        }
        int k =0;
        for(int i = 0; i<orders.length; i++)
            if (orders[i]!=null)
            {
                temp[k] = orders[i];
                k++;
            }
        orders = temp.clone();
        return 1;
    }
    int removeAll (Order order)
    {
        int count = 0;
        Order[] temp = new Order[orders.length];
        for(int i = 0; i<orders.length;i++) {
            if (orders[i].equals(order))
            {
                orders[i] = null;
                count++;
            }
            else if (i == orders.length-1 && count == 0)
                return 0;
        }
        int k =0;
        for(int i = 0; i<orders.length; i++)
            if (orders[i]!=null)
            {
                temp[k] = orders[i];
                k++;
            }
        orders = temp.clone();
        return count;
    }
    @Override
    public int itemsQuantity(MenuItem item) {
        int count = 0;
        for(int i = 0; i<orders.length;i++) {
            if (orders[i]!=null) {
                for (int j = 0; j < orders[i].getItems().length; j++) {
                    if (orders[i].getItems()[j].equals(item)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        for(int i = 0; i<orders.length;i++) {
            if (orders[i]!=null) {
                for (int j = 0; j < orders[i].getItems().length; j++) {
                    if (orders[i].getItems()[j].getName().equals(itemName)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    @Override
    public Order[] getOrders() {
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        int total = 0;
        for(int i = 0; i<orders.length;i++) {
            if (orders[i]!=null) {
                for (int j = 0; j < orders[i].getItems().length; j++) {
                        total+= orders[i].getItems()[j].getCost();
                    }
                }
            }
        return total;
    }

    @Override
    public int ordersQuantity() {
        int count = 0;
        for(int i = 0; i<orders.length; i++)
        {
            if (orders[i]!=null)
                count++;
        }
        return count;
    }
}
