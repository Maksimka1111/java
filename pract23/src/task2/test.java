package task2;

import task1.ArrayQueue;

import java.util.LinkedList;

public class test {
    public static void main(String[] args) {
        System.out.println("ArrayQueue test:");
        LinkedQueue linkedQueue = new LinkedQueue();
        System.out.println("is queue empty? " + linkedQueue.isEmpty());
        linkedQueue.enqueue(1);
        linkedQueue.enqueue(2);
        linkedQueue.enqueue(3);
        linkedQueue.enqueue(4);
        linkedQueue.enqueue(5);
        System.out.println("is queue empty? " + linkedQueue.isEmpty());
        System.out.println("queue size: " + linkedQueue.size());
        System.out.println("queue next: "+ linkedQueue.element());
        System.out.println("dequeue element: " + linkedQueue.dequeue());
        System.out.println("queue size: " + linkedQueue.size());
        System.out.println("dequeue element: " + linkedQueue.dequeue());
        System.out.println("queue size: " + linkedQueue.size());
        linkedQueue.clear();
        System.out.println("cleared queue");
        System.out.println("queue size: " + linkedQueue.size());

    }
}
