package datastructure;

import com.mysql.cj.xdevapi.AddResult;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		//Add elements to list
	List<String> list=new ArrayList<String>();
	list.add("sun");
	list.add("mon");
	list.add("tues");
	list.add("wed");
	list.add("thurs");
	list.add("sat");
	for(String s:list)
	System.out.println(s);
	//retrieve da array list modifi value
		list.set(2,"abc");
		for(String s:list)
			System.out.println(s);
		//remove
		list.remove(3);
		for(String s:list)
			System.out.println(s);
//	Use For Each loop and while loop with Iterator to retrieve data.
//while with iterator
		Iterator<String> it=list.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		it= list.listIterator();
		while(it.hasNext()) {
			if (it.next().contentEquals("mon"))
				it.remove();
		}
		while(it.hasNext()){
			System.out.println(it.next());

		}






	}

}
