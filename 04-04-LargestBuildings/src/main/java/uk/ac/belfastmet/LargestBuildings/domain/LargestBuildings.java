package uk.ac.belfastmet.LargestBuildings.domain;

public class LargestBuildings {
	
	// instance variables
		private String name;
		private String country;
		private int floorArea;
		private int footPrint;
		private int usableVolume;

		// Constructors
		public LargestBuildings() {
			super();

}

		public LargestBuildings(String name, String country, int floorArea) {
			super();
			this.name = name;
			this.country = country;
			this.floorArea = floorArea;
			
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public int getFloorArea() {
			return floorArea;
		}

		public void setFloorArea(int floorArea) {
			this.floorArea = floorArea;
		}

		public int getFootPrint() {
			return footPrint;
		}

		public void setFootPrint(int footPrint) {
			this.footPrint = footPrint;
		}

		public int getUsableVolume() {
			return usableVolume;
		}

		public void setUsableVolume(int usableVolume) {
			this.usableVolume = usableVolume;
		}

}