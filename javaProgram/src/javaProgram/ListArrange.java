package javaProgram;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListArrange {

	public static void main(String[] args) {
		List<String> listOfWords=new LinkedList<String>();
		listOfWords.add("Apple");
		listOfWords.add("Bat");
		listOfWords.add("Cat");
		listOfWords.add("Dog");
		listOfWords.set(2,"Fish");
		listOfWords.set(3,"Lion");
		listOfWords.remove(2);
		listOfWords.set(0, "ape");
		System.out.println(listOfWords);
		}

	

}
