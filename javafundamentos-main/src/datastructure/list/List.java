package datastructure.list;

public class List<E> {


    //the references to the last element in the list
    private Node last;
    //the references to the first element of the list
    private Node first;

    public void add(Node node) {
        //1
        last.next = node;

    }
}

class Node<E> {

    //the data stored in a mode of the list
    private E e;
    //each node needs to point to the next node, we use this variable to do it
    protected Node next;
}