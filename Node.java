public class Node<T>{

    private int size;
    public Node<T> next; 
    private Node<T> data;


    public Node(){

    }

    public int size(){
        return size;
    }

    public Node<T> getData(){
        return data;
    }



}