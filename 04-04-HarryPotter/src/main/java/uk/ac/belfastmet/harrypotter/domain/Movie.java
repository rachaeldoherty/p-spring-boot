package uk.ac.belfastmet.harrypotter.domain;

public class Movie {

		// instance variables
		private String moviefran;
		private String image;		

		// Constructors
		public Movie() {
			super();
		}

		public Movie(String moviefran, String image) {
			super();
			this.moviefran = moviefran;
			this.image = image;
		}

		public String getMoviefran() {
			return moviefran;
		}

		public void setMoviefran(String moviefran) {
			this.moviefran = moviefran;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

	



}