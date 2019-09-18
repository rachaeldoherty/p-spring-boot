package uk.ac.belfastmet.harrypotter.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.harrypotter.domain.Movies;

@Service
public class harrypotterService {
	
	private ArrayList<Movies> harryPotterMovie;

	
	public ArrayList<Movies> getharryPotterMovie(){
		this.harryPotterMovie = new ArrayList<Movies>(); 
		this.harryPotterMovie.add(new Movies("Harry Potter", "& the Philosphers Stone", "PS.jpg"));
		this.harryPotterMovie.add(new Movies("Harry Potter", "& the Chamber of Secrets", "Secrets.jpg"));
		this.harryPotterMovie.add(new Movies("Harry Potter", "& the Prisoner of Azkaban", "Azka.jpg"));
		this.harryPotterMovie.add(new Movies("Harry Potter", "& the Goblet of Fire", "GoboF.jpg"));
		this.harryPotterMovie.add(new Movies("Harry Potter", "& the Order of the Phoneix", "OoP.jpg"));
		this.harryPotterMovie.add(new Movies("Harry Potter", "& the Half Blood Prince", "HBP.jpg"));
		this.harryPotterMovie.add(new Movies("Harry Potter", "& Deathly Hallows", "DH.jpg"));
				
		return this.harryPotterMovie; 
		
	
}
}
