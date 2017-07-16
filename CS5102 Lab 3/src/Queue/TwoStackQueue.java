package Queue;

import Stack.LinkedStack;

import javax.lang.model.element.Element;

/**
 * Created by SimonTay- user on 16/7/2017.
 */
public class TwoStackQueue<T> {

    private LinkedStack<T> enStack = new LinkedStack<T>();
    private LinkedStack<T> deStack = new LinkedStack<T>();

    public void enqueue(T element){
        while (!deStack.isEmpty()){
            enStack.push(deStack.pop());
        }
        enStack.push(element);
        while (!enStack.isEmpty()){
            deStack.push(enStack.pop());
        }
    }

    public T dequeue(){
        return deStack.pop();
    }
}
