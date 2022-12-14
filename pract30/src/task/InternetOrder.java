package task;

import java.io.Serializable;

public class InternetOrder extends ListNode implements Order, Serializable {
    int size;
    Customer customer;
    ListNode head = new ListNode();
    ListNode tail;
    @Override
    public boolean add(MenuItem item) {
        ListNode node = head;
        while (node.next!=null)
            node = node.next;
        ListNode new_node = new ListNode();
        new_node.value = item;
        node.next = new_node;
        tail = new_node;
        return true;
    }

    @Override
    public boolean remove(String itemName) {
        ListNode node = head;
        while (node.next.next!=null && !node.next.value.getName().equals(itemName))
            node = node.next;
        if (node.next.value.getName().equals(itemName))
        {
            if (node.next.next == null)
                node.next = null;
            else node.next = node.next.next;
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        ListNode node = head;
        while (node.next.next!=null && !node.next.value.equals(item))
            node = node.next;
        if (node.next.value.equals(item))
        {
            if (node.next.next == null)
                node.next = null;
            else node.next = node.next.next;
            return true;
        }
        else
            return false;
    }

    @Override
    public int costTotal() {
        int total = 0;
        ListNode node = head;
        while (node.next!=null)
        {
            node = node.next;
            total += node.value.getCost();
        }
        return total;
    }

    @Override
    public int itemQuantity(String itemName) {
        int count = 0;
        ListNode node = head;
        while (node.next!=null)
        {
            node = node.next;
            if (node.value.getName().equals(itemName))
                count ++;
        }
        return count;
    }

    @Override
    public int itemQuantity(MenuItem item) {
        int count = 0;
        ListNode node = head;
        while (node.next!=null)
        {
            node = node.next;
            if (node.value.equals(item))
                count ++;
        }
        return count;
    }

    @Override
    public int itemsQuantity() {
        int count = 0;
        ListNode node = head;
        while (node.next!=null)
        {
            node = node.next;
            count++;
        }
        return count;
    }
    @Override
    public int removeAll(MenuItem item) {
        int count = 0;
        ListNode node = head;
        while (node.next!=null)
        {
            node = node.next;
            if (node.value.equals(item))
            {
                remove(item);
                count += node.value.getCost();
            }
        }
        return count;
    }
    @Override
    public int removeAll(String itemName) {
        int count = 0;
        ListNode node = head;
        while (node.next!=null)
        {
            node = node.next;
            if (node.value.getName().equals(itemName))
            {
                remove(itemName);
                count += node.value.getCost();
            }
        }
        return count;
    }
    @Override
    public String[] itemNames() {
        String[] itemNames = new String[itemsQuantity()];
        int i = 0;
        ListNode node = head;
        while (node.next!=null)
        {
            node = node.next;
            itemNames[i] = node.value.getName();
            i++;
        }
        return itemNames;
    }
    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] items = new MenuItem[itemsQuantity()];
        int[] sorted_costs_prev = new int[itemsQuantity()];
        int i = 0;
        ListNode node = head;
        while (node.next!=null)
        {
            node = node.next;
            sorted_costs_prev[i] = node.value.getCost();
            i++;
        }
        int[] sorted_costs_next = new int[itemsQuantity()];
        int ind = 0;
        for(int j = 0; j<sorted_costs_prev.length;j++)
        {
            for (int t = 0; t < sorted_costs_next.length; t++)
                if (sorted_costs_next[j] <= sorted_costs_prev[t]) {
                    sorted_costs_next[j] = sorted_costs_prev[t];
                    ind = t;
                }
            sorted_costs_prev[ind] = -1;
        }
        int[] repeats = new int[sorted_costs_next.length+1];
        i = 0;
        repeats[i] = -1;
        boolean x = true;
        node = head;
        while (node.next!=null)
        {
            node = node.next;
            for(int j = 0; j<sorted_costs_next.length;j++)
            {
                if (repeats[j] == sorted_costs_next[j])
                {
                    x = false;
                    break;
                }
                else x = true;
            }
            for(int j = 0; j<sorted_costs_next.length;j++) {
                {
                    if (node.value.getCost() == sorted_costs_next[j] && x)
                    {
                        items[items.length - 1 - i] = node.value;
                        repeats[i] = sorted_costs_next[j];
                        i++;
                    }
                }
            }
        }
        return items;
    }

    @Override
    public MenuItem[] getItems() {
        MenuItem[] items = new MenuItem[itemsQuantity()];
        int i = 0;
        ListNode node = head;
        while (node.next!=null)
        {
            node = node.next;
            items[i] = node.value;
            i++;
        }
        return items;
    }
    @Override
    public Customer getCustomer() {
        return customer;
    }
    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
class ListNode implements Serializable {
    ListNode next;
    MenuItem value;
}