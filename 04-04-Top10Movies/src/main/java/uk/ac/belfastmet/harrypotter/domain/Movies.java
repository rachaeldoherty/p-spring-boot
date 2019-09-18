package uk.ac.belfastmet.harrypotter.domain;

public class Movies {

		// instance variables
		private String moviename;
		private String title;
		private String image;		

		// Constructors
		public Movies() {
			super();
		}

		public Movies(String moviename, String title, String image) {
			super();
			this.moviename = moviename;
			this.title = title;
			this.image = image;
		}

		public String getMoviename() {
			return moviename;
		}

		public void setMoviename(String moviename) {
			this.moviename = moviename;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}



}