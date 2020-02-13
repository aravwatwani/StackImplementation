import java.util.ArrayList;
public class Stack<T> { 
    private ArrayList<T> data;
    private int size;                                   
    public Stack(){
        data = new ArrayList<T>();
    }

    public void push(T t){
        data.add(t);
        size++;
    }
    public T pop(){
        size--;
        return data.remove(size);
    }

    public T peek(){
        return data.get(size-1);
    }

    public int size(){ //<--- following ArrayList size naming
        return size;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }

    public int getSize(){
        return size;
    }
    public String toString(){
        return data.toString();
    }


}

