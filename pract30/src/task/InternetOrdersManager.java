package task;

public class InternetOrdersManager implements OrdersManager{
    QueueNode head = new QueueNode();
    QueueNode tail;
    int size = 0;

    boolean add(Order order)
    {
        QueueNode node = head;
        while (node.next!=null)
            node = node.next;
        QueueNode new_node = new QueueNode();
        new_node.value = order;
        new_node.prev = node;
        node.next = new_node;
        tail = new_node;
        size++;
        return true;
    }

    Order remove()
    {
        if (head.next!=null) {
            QueueNode node = head.next;
            if (node.next == null) {
                head.next = null;
            } else {
                head.next = node.next;
                node.next.prev = head;
            }
            size--;
            return node.value;
        }
        else return null;
    }
    Order order()
    {
        if (head.next!=null)
            return head.next.value;
        else return null;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int count = 0;
        QueueNode node = head;
        while (node.next!=null)
        {
            node = node.next;
            for(int i = 0; i<node.value.getItems().length;i++)
            {
                if (node.value.getItems()[i].equals(item))
                    count++;
            }
        }
        return count;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        QueueNode node = head;
        while (node.next!=null)
        {
            node = node.next;
            for(int i = 0; i<node.value.getItems().length;i++)
            {
                if (node.value.getItems()[i].getName().equals(itemName))
                    count++;
            }
        }
        return count;
    }

    @Override
    public Order[] getOrders() {
        Order[] orders = new Order[size];
        int i = 0;
        QueueNode node = head;
        while (node.next!=null)
        {
            node = node.next;
            orders[i] = node.value;
            i++;
        }
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        int total = 0;
        QueueNode node = head;
        while (node.next!=null)
        {
            node = node.next;
            for(int i = 0; i<node.value.getItems().length;i++)
            {
                total+= node.value.getItems()[i].getCost();
            }
        }
        return total;
    }

    @Override
    public int ordersQuantity() {
        return size;
    }
}
class QueueNode{
    QueueNode next;
    QueueNode prev;
    Order value;
}