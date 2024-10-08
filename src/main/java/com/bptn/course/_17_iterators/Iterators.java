package com.bptn.course._17_iterators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.List;
public class Iterators {
	public static void main (String[] args)
	{
	List<String> student = new ArrayList<>();
	
	student.add("Guta");
	student.add("Aquib");
	student.add("Alemu");
	
	Iterator<String> iterator =student.iterator();
//	while(iterator.hasNext())
//	{
//		String students = iterator.next();
//		if(students.startsWith("A"))
//			{
//			iterator.remove();
//			}
//	}
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
	//System.out.println(iterator.next());
	}
	// Iterator new list
	
}
