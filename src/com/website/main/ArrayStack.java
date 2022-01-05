package com.website.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * -- Q1.b - Implement a Stack that will hold the website records
 * ArrayStack - a class that provides a Array Stack
 *
 * @author Tim Winwood - x20213638
 * @version 1.0
 */
public class ArrayStack<T> extends ArrayList<T> {

	// instance variables
	private int top;
	private int current;

	/**
	 * ArrayStack constructor
	 */
	public ArrayStack() {
		this.top = 0;
		this.current = 0;
	}

	/**
	 * checks if the ArrayStack is empty
	 * 
	 * @return boolean representing if the ArrayStack is empty
	 */
	public boolean isEmpty() {
		return (this.size() == 0);

	}

	/**
	 * pops an element from the top of the stack
	 * 
	 * @return the popped element
	 */
	public T pop() {

		 // if list is empty, throw an IndexOutOfBoundsException
		if (isEmpty()) {
			throw new IndexOutOfBoundsException();
		}
		
		// remove the element to the array
		top = top -1;
		return this.remove(top);

	}

	/**
	 * pushes an element onto the top of the stack
	 * 
	 * @param element the element
	 */
	public void push(T element) {
		
		// add the element to the array
		this.add(top, element);
		top = top + 1;
	}

	/**
	 * peeks the element on the top of the stack
	 * 
	 * @return the top element
	 */
	public T peek() {
		
		 // if list is empty, throw an IndexOutOfBoundsException
		if (isEmpty()) {
			throw new IndexOutOfBoundsException();
		}

		return this.get(top-1);

	}

	/**
	 * clears the stack
	 */
	public void clear() {

		// loop through and pop all the Nodes
		while (this.size() > 0) {
			this.pop();
		}
	}

	/**
	 * prints the contents of the stack
	 */
	public void list() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("=== Stack Contents ===" + "\n");
		for (int i = 0; i < this.size(); i++) {
			sb.append(this.get(i).toString() + "\n");
		}
		System.out.print(sb);
	}
	
	/**
	 * -- Q1.b.i - browse
	 * browse to a website
	 * 
	 * @param title the website title
	 * @param url the website url
	 */
	public void browse(String title,String url) {

		// while the size is more than the current active website
		// remove the last Node in the list
		while (this.size() > current) {
			this.pop();

		}

		// get current date and format for date and time
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		DateFormat tf = new SimpleDateFormat("HHmm");
	    int intDate = Integer.parseInt(df.format(date));
	    int intTime = Integer.parseInt(tf.format(date));
		
	 // create a new Website
		T w = (T) new Website(title, intDate,intTime,url);
		
		// add the Website to the list and go Forward one
		this.push(w);
		goForward();

	}
	
	/**
	 * -- Q1.b.ii - goBack
	 * go back a page
	 */
	public void goBack() {
		
		// cant go back if we are at the statr of the list
		if (current == 0) {
			throw new IndexOutOfBoundsException();
		}
		
		// decrement the current active website by 1
		current--;
		
	}
	
	/**
	 * -- Q1.b.iii - goForward
	 * go forward a page
	 */
	public void goForward() {
		
		// cant go forward if we are at the end of the list
		if (current == this.size()) {
			throw new IndexOutOfBoundsException();
		}
		
		// increment the current active website by 1
		current++;
	}
	
	/**
	 * -- Q1.b.iv - printDS
	 * prints the contents of the stack
	 */
	public void printDS() {
		
		// call the list method
		list();
	}
	
	/**
	 * prints the current website
	 */
	public void printCurrent() {
		System.out.println("=== Current Website ===");
		System.out.println(this.get(current-1).toString());
	}


}
