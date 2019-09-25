package uk.ac.belfastmet.ToDoList.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class ToDoList {

	// instance variables
	private long id; 
	private String name;
	private String description;
	private String dateCompletion;
	private String completedOrNot;
	private String userName;
	private String priority;

	// Constructors
	public ToDoList() { //default constructor required: lets you create from the database
	}
	/**
	 * 
	 * @param name creating headings with getters and setters for the columns
	 * @param description creating headings with getters and setters for the columns
	 * @param dateCompletion creating headings with getters and setters for the columns
	 * @param completedOrNot creating headings with getters and setters for the columns
	 * @param userName creating headings with getters and setters for the columns
	 * @param priority creating headings with getters and setters for the columns
	 */
	public ToDoList(String name, String description, String dateCompletion, String completedOrNot, String userName,
		String priority) {
		this.name = name;
		this.description = description;
		this.dateCompletion = dateCompletion;
		this.completedOrNot = completedOrNot;
		this.userName = userName;
		this.priority = priority;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name = "datecompletion")
	public String getDateCompletion() {
		return dateCompletion;
	}
	public void setDateCompletion(String dateCompletion) {
		this.dateCompletion = dateCompletion;
	}
	
	@Column(name = "completedornot")
	public String getCompletedOrNot() {
		return completedOrNot;
	}
	public void setCompletedOrNot(String completedOrNot) {
		this.completedOrNot = completedOrNot;
	}
	
	@Column(name = "username")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Column(name = "priority")
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String toString() {
		return this.name + " " + this.description + " " + this.dateCompletion + " " + this.completedOrNot + " " + this.userName+ " " +this.priority; 
	}
}