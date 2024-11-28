package javaProgram;

import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
		LinkedList<String> listOfWords = new LinkedList<String>();

		listOfWords.add("Apple");
		listOfWords.add("Bat");
		listOfWords.add("Cat");
		listOfWords.add("Dog");
		listOfWords.set(2,"Fish");
		listOfWords.set(3,"Lion");
		listOfWords.remove(2);
		System.out.println(listOfWords);
		}

	}
//fileupload

