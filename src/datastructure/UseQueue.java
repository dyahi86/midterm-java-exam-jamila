package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		//create queue and add element 1234 to it
		Queue<Integer> q =new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q+"");
		//peek
		System.out.println( "the head of queue is  "+q.peek());
		//remove element
		q.remove();
		System.out.println(q+"");
		//pool elements
		q.poll();
		System.out.println(q.poll());
		//Use For Each loop and while loop with Iterator to retrieve data.
         Iterator it=q.iterator();
		 while(it.hasNext()){
			 System.out.println(it.next());
		 }



	}

}
