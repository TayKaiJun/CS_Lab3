package Queue;

import Stack.StackADT;

/**
 * Created by SimonTay- user on 16/7/2017.
 */
public class TestStackQueue {

    public static void main(String[] arg){
        TwoStackQueue twoStackQueue = new TwoStackQueue();
        twoStackQueue.enqueue("1");
        twoStackQueue.enqueue("2");
        twoStackQueue.enqueue("3");
        twoStackQueue.enqueue("2");
        System.out.println(twoStackQueue.dequeue());
        System.out.println(twoStackQueue.dequeue());
        System.out.println(twoStackQueue.dequeue());
        System.out.println(twoStackQueue.dequeue());

        System.out.println();

        OneStackQueue oneStackQueue = new OneStackQueue();
        oneStackQueue.enqueue("1");
        oneStackQueue.enqueue("2");
        oneStackQueue.enqueue("3");
        oneStackQueue.enqueue("2");
        System.out.println(oneStackQueue.dequeue());
        System.out.println(oneStackQueue.dequeue());
        System.out.println(oneStackQueue.dequeue());
        System.out.println(oneStackQueue.dequeue());

        //result: Both should print out 1, 2, 3, then 2
    }
}
