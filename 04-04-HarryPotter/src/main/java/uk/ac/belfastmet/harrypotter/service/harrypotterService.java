package uk.ac.belfastmet.harrypotter.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.harrypotter.domain.Movie;

@Service
public class harrypotterService {
	
	private ArrayList<Movie> harryPotterMovies;

	
	public ArrayList<Movie> getharryPotterMovies(){
		this.harryPotterMovies = new ArrayList<Movie>(); 
		this.harryPotterMovies.add(new Movie("Harry Potter and the Philosphers Stone", "PS.jpg"));
		this.harryPotterMovies.add(new Movie("Harry Potter & the Chamber of Secrets", "Secrets.jpg"));
		this.harryPotterMovies.add(new Movie("Harry Potter & the Prisoner of Azkaban", "Azka.jpg"));
		this.harryPotterMovies.add(new Movie("Harry Potter & the Goblet of Fire", "GoboF.jpg"));
		this.harryPotterMovies.add(new Movie("Harry Potter & the Order of the Phoneix", "OoP.jpg"));
		this.harryPotterMovies.add(new Movie("Harry Potter & the Half Blood Prince", "HBP.jpg"));
		this.harryPotterMovies.add(new Movie("Harry Potter & Deathly Hallows", "DH.jpg"));
				
		return this.harryPotterMovies; 
		
	
}
}
