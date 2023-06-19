package edu.escuelaing.arsw.app;

public class Node<T> {
    T data;
    Node<T> next;

    public Node(T data){
        this.next = null;
        this.data = data;
    }
    public T getData(){
        return data;
    }
    public void setNext(Node<T> next){
        this.next = next;
    }
    public Node<T> getNext(){
        return next;
    }
    public void setData(T e) {
        data = e;
    } 

}
