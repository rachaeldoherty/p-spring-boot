package uk.ac.belfastmet.LargestBuildings.service;

import java.util.ArrayList;

import uk.ac.belfastmet.LargestBuildings.domain.LargestBuildings;

public class LargestBuildingsService {

	private ArrayList<LargestBuildings> largestBuildingsfloorArea;
	private ArrayList<LargestBuildings> largestBuildingsfootPrint;
	private ArrayList<LargestBuildings> largestBuildingsusableVolume;

	
	
	public ArrayList<LargestBuildings>getLargestBuildingsfloorArea(){
		this.largestBuildingsfloorArea = new ArrayList<LargestBuildings>();
		this.largestBuildingsfloorArea.add(new LargestBuildings("New Century Global Center", "China", 1760000));
		
				return this.largestBuildingsfloorArea;
	}
	
	public ArrayList<LargestBuildings>getLargestBuildingsfootPrint(){
		this.largestBuildingsfootPrint = new ArrayList<LargestBuildings>();
		LargestBuildings footPrint1 = new LargestBuildings();
		footPrint1.setName("AvtoVAZ");
		footPrint1.setCountry("Russia");
		footPrint1.setFootPrint(887800);
		
		
		return this.largestBuildingsfootPrint;
}
	
	public ArrayList<LargestBuildings>getLargestBuildingsusableVolume(){
		this.largestBuildingsusableVolume = new ArrayList<LargestBuildings>();
		LargestBuildings usableVolume1 = new LargestBuildings();
		usableVolume1.setName("Boeing Everett Factory");
		usableVolume1.setCountry("USA");
		usableVolume1.setUsableVolume(398000);
		
		
		return this.largestBuildingsusableVolume;
		
	}}
