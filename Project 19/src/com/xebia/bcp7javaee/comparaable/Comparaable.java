package com.xebia.bcp7javaee.comparaable;
import java.io.*;
import java.util.*;
class Movie implements Comparable <Movie> {
	private double rating;
	private String name;
	private int year;
	public int compareTo(Movie m) {
		return this.year - m.year;
	}
	public Movie(String mn, double rat, int yea) {
		this.name=mn;
		this.rating=rat;
		this.year=yea;
	}
	public double getRating() {
		return rating;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
}

public class Comparaable {

	public static void main(String[] args) {
		ArrayList<Movie> list=new ArrayList<Movie>();
		list.add(new Movie("Aashiqui 2", 9.0, 2013));
		list.add(new Movie("Avengers Endgame", 8.5, 2019));
		list.add(new Movie("Spiderman", 8.4, 2021));
		Collections.sort(list);
		System.out.println("My favourite Movies are: ");
		for (Movie movie : list) {
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
		}

	}

}
