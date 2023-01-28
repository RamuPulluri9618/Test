package Java;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(20);
		al.add(30);
		System.out.println(al);
		// add list to arraylist

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(11);
		hs.add(13);

		ArrayList<Integer> alm = new ArrayList<Integer>();
		alm.add(40);
		alm.addAll(al);
		alm.addAll(hs);
		alm.add(3, 30);
		System.out.println(alm);
		
		//removeall and clear methods are same eg:alm.clear(); alm.removeall();
		
		//array clone of copying values arraylist.clone()
		
		//arraylist contains arraylist.contains(Object obj)
		
		//arraylisarraylist.get(int index)
		
		
		//arraylist.indexOf(Object obj)
		
		//arraylist.removeAll(Collection c);
		
		//.size()
		
		
		//arraylist.isEmpty()
		
		//arraylist.subList(int fromIndex, int toIndex)

		
		//arraylist.set(int index, E element)

		
		
		

	}

}
