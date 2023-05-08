package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int DEFAULT_VALUE = -1;
    Node last;
    private int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return DEFAULT_VALUE;
        int ret = last.value;
        last = last.getPrev();
        return ret;
    }

}
