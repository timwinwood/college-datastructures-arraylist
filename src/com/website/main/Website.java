package com.website.main;

/**
 * -- Q1.a - Implement a Website class
 * Website - a class to represent a Website
 *
 * @author Tim Winwood - x20213638
 * @version 1.0
 */
public class Website {

	// instance variables
	private String title;
	private int date;
	private int time;
	private String url;

	/**
	 * Website constructor
	 */
	public Website(String title, int date, int time, String url) {
		
		this.title = title;
		this.date = date;
		this.time = time;
		this.url = url;

	}
	
	/**
	 * get the title
	 * 
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * set the title
	 * 
	 * @param title the title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * get the date
	 * 
	 * @return the date
	 */
	public int getDate() {
		return date;
	}

	/**
	 * set the date
	 * 
	 * @param name the date
	 */
	public void setDate(int date) {
		this.date = date;
	}

	/**
	 * get the time
	 * 
	 * @return the time
	 */
	public int getTime() {
		return time;
	}

	/**
	 * set the time
	 * 
	 * @param time the time
	 */
	public void setTime(int time) {
		this.time = time;
	}

	/**
	 * get the url
	 * 
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * set the url
	 * 
	 * @param url the url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	
	/**
	 * returns the string representation of the Website object
	 *
	 * @return the string representation of the Website object
	 */
	@Override
    public String toString(){

		// return the string representation of the Website object
    	return "=== " + this.title + " ===\n"
    			+ "Date: " + this.date + "\n"
    			+ "Time: " + this.time + "\n"
    			+ "URL: " + this.url;

    }
	
}
