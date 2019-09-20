package uk.ac.belfastmet.harrypotter.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.harrypotter.domain.Movie;

@Service
public class harrypotterService {
	
	private ArrayList<Movie> harryPotterMovies;

	
	public ArrayList<Movie> getharryPotterMovies(){
		this.harryPotterMovies = new ArrayList<Movie>(); 
		this.harryPotterMovies.add(new Movie("Harry Potter & the Philosphers Stone", "PS.jpg", "HP1.JPG"));
		this.harryPotterMovies.add(new Movie("Harry Potter & the Chamber of Secrets", "Secrets.jpg", "HP2.JPG"));
		this.harryPotterMovies.add(new Movie("Harry Potter & the Prisoner of Azkaban", "Azka.jpg", "HP3.JPG"));
		this.harryPotterMovies.add(new Movie("Harry Potter & the Goblet of Fire", "GoF.jpg", "HP4.JPG"));
		this.harryPotterMovies.add(new Movie("Harry Potter & the Order of the Phoneix", "OoF.jpg", "HP5.JPG"));
		this.harryPotterMovies.add(new Movie("Harry Potter & the Half Blood Prince", "HBP.jpg", "HP6.JPG"));
		this.harryPotterMovies.add(new Movie("Harry Potter & the Deathly Hallows", "DH.jpg", "HP7&8.JPG"));
				
		return this.harryPotterMovies; 
		
	
}
}
