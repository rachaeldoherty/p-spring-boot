package uk.ac.belfastmet.harrypotter.domain;

public class Movie {

		// instance variables
		private String moviefran;
		private String image;	
		private String bookimage;	

		// Constructors
		public Movie() {
			super();
		}

		public Movie(String moviefran, String image, String bookimage) {
			super();
			this.moviefran = moviefran;
			this.image = image;
			this.bookimage = bookimage;
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

		public String getBookimage() {
			return bookimage;
		}

		public void setBookimage(String bookimage) {
			this.bookimage = bookimage;
		}

		
		
}