package uk.ac.belfastmet;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int count = 0;
		int tolkeincount = 0;
		
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		dwarfs.add(new Dwarf("Sleepy", "Disney"));
		dwarfs.add(new Dwarf("Happy", "Disney"));
		dwarfs.add(new Dwarf("Grumpy", "Disney"));
		dwarfs.add(new Dwarf("Dopey", "Disney"));
		dwarfs.add(new Dwarf("Bashful", "Disney"));
		dwarfs.add(new Dwarf("Doc", "Disney"));
		dwarfs.add(new Dwarf("Sneezy", "Disney"));
		
		dwarfs.add(new Dwarf("Thorin", "Tolkein"));
		dwarfs.add(new Dwarf("Balin", "Tolkein"));
		dwarfs.add(new Dwarf("Dwalin", "Tolkein"));
		dwarfs.add(new Dwarf("Fili", "Tolkein"));
		dwarfs.add(new Dwarf("Kili", "Tolkein"));
		dwarfs.add(new Dwarf("Oin", "Tolkein"));
		dwarfs.add(new Dwarf("Gloin", "Tolkein"));
		dwarfs.add(new Dwarf("Dori", "Tolkein"));
		dwarfs.add(new Dwarf("Nori", "Tolkein"));
		dwarfs.add(new Dwarf("Ori", "Tolkein"));
		dwarfs.add(new Dwarf("Bifur", "Tolkein"));
		dwarfs.add(new Dwarf("Bofur", "Tolkein"));
		dwarfs.add(new Dwarf("Bombur", "Tolkein")); 

		
		for (Dwarf dwarf : dwarfs) {
			if (dwarf.getAuthor()== "Disney") {
				System.out.println(dwarf.getName()+" from Disney's Snow White");
			count++;
		}}
			System.out.println("there are " + count + " dwarfs");
		
		
		System.out.println();
		for (Dwarf dwarf2 : dwarfs) {		
			if (dwarf2.getAuthor()== "Tolkein") {
				System.out.println(dwarf2.getName()+" from Lord of the Rings");
				tolkeincount++; 
				}}
			System.out.println("there are " + tolkeincount + " dwarves");
	
		
}
	}


