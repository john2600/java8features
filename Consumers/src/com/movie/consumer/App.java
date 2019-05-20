package com.movie.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class App {
	public static void main(String[] args) {
		ArrayList<Movie> movies = new ArrayList<>();
		
		movies.add(new Movie("Titanic","dicaprio","rose"));
		movies.add(new Movie("Avangers","iron man","red witch"));
		movies.add(new Movie("liga de la justica","Superman","wonderfull woman"));
		movies.add(new Movie("Batman return","Batman","Battygirl"));
	
		Consumer<Movie> c = m->System.out.println(m.toString());
		
		movies.forEach(i->c.accept(i));
		
	}
}
