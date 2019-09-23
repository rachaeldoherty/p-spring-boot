package uk.ac.belfastmet.ToDoList.service;

public class CompletedList {

		//instance variables
			private String name;
			private String description; 
			private String datecompletion; 
			private boolean completedOrNot;
			private String userName; 
			private String priority;
	
			//Constructors		
			public CompletedList(String name, String description, String datecompletion, boolean completedOrNot, String userName, String priority) {
				this.name = name;
				this.description = description;
				this.datecompletion = datecompletion;
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
			public String getDatecompletion() {
				return datecompletion;
			}
			public void setDatecompletion(String datecompletion) {
				this.datecompletion = datecompletion;
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
