package Queue;

import Stack.LinkedStack;
import Stack.StackADT;

/**
 * Created by SimonTay- user on 16/7/2017.
 */
public class OneStackQueue<T>{

    private LinkedStack<T> stack = new LinkedStack<T>();

    public void enqueue(T element){
        T popElement;
        if (!stack.isEmpty())
        {
            popElement = stack.pop();
            enqueue(element);
            stack.push(popElement);
        }
        else {
            stack.push(element);
        }
    }

    public T dequeue(){
        return stack.pop();
    }
}
