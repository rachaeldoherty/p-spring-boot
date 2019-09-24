package uk.ac.belfastmet.ToDoList.domain;

public class ToDoList {

	// instance variables
	private String name;
	private String description;
	private String dateCompletion;
	private boolean completedOrNot;
	private String userName;
	private String priority;

	// Constructors
	public ToDoList(String name, String description, String dateCompletion, boolean completedOrNot, String userName,
			String priority) {
		this.name = name;
		this.description = description;
		this.dateCompletion = dateCompletion;
		this.completedOrNot = completedOrNot;
		this.userName = userName;
		this.priority = priority;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDateCompletion() {
		return dateCompletion;
	}

	public void setDatecompletion(String dateCompletion) {
		this.dateCompletion = dateCompletion;
	}

	public boolean isCompletedOrNot() {
		return completedOrNot;
	}

	public void setCompletedOrNot(boolean completedOrNot) {
		this.completedOrNot = completedOrNot;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

}
