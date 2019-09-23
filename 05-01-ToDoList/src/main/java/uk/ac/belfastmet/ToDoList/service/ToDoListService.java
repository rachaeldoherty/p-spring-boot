package uk.ac.belfastmet.ToDoList.service;

import java.util.ArrayList;
import uk.ac.belfastmet.ToDoList.domain.ToDoList;


public class ToDoListService {
	
	private ArrayList<ToDoList> toDoList;

	public ArrayList<ToDoList> getToDoList(){
		this.toDoList = new ArrayList<ToDoList>();
		this.toDoList.add(new ToDoList("Kitchen", "Clean Kitchen", "25 September", false, "Rachael", "High")); 
		this.toDoList.add(new ToDoList("Bathroom", "Spray Shower", "24 September", false, "Rachael", "Low")); 
		this.toDoList.add(new ToDoList("Car", "Fill Tank", "26 September", true, "Rachael", "Medium")); 
		this.toDoList.add(new ToDoList("Bedroom", "Hoover & Change Sheets", "23 September", false, "Rachael", "High")); 
		
				return this.toDoList;

}

	private ArrayList<ToDoList> completedList;

	public ArrayList<ToDoList> getcompletedList(){
		this. completedList = new ArrayList<ToDoList>();
		this. completedList.add(new ToDoList("Car", "Fill Tank", "26 September", true, "Rachael", "Medium")); 
		this. completedList.add(new ToDoList("Utility Room", "Organise Storage", "30 September", true, "Rachael", "Medium")); 

				return this.completedList;

	
	
}
}

