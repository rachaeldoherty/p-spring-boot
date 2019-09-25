package uk.ac.belfastmet.ToDoList.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import uk.ac.belfastmet.ToDoList.domain.ToDoList;
import uk.ac.belfastmet.ToDoList.repository.ToDoListRepository;

@Service
public class ToDoListService {
	private static Logger logger = LoggerFactory.getLogger(ToDoListService.class);
/**
 * Created an Iterable todoList to bring in the table from SQL,
 * deleted out the hard coded array list for ToDoList. 
 */
	
	@Autowired
	private ToDoListRepository toDoListRepository; 

		public Iterable<ToDoList> getToDoList() {
			Iterable <ToDoList> toDoList = toDoListRepository.findAll();
			Iterator <ToDoList> iterator = toDoList.iterator();
			while (iterator.hasNext()) {
				logger.info("{}", iterator.next().toString());
		}	
			return toDoList;
	}
	
	private ArrayList<ToDoList> completedList;

	public ArrayList<ToDoList> getcompletedList() {
		this.completedList = new ArrayList<ToDoList>();
		this.completedList.add(new ToDoList("Car", "Fill Tank", "26 September", "yes", "Rachael", "Medium"));
		this.completedList.add(new ToDoList("Utility Room", "Organise Storage", "30 September", "yes", "Rachael", "Medium"));

		return this.completedList;
	}
	
	public Iterable<ToDoList> completedList() {
		Iterable <ToDoList> toDoList = toDoListRepository.findAll();
		Iterator <ToDoList> iterator = toDoList.iterator();
		while (iterator.hasNext()) {
			logger.info("{}", iterator.next().toString());
	}	
		return completedList;
}
}
