package uk.ac.belfastmet.ToDoList.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uk.ac.belfastmet.ToDoList.service.ToDoListService;



@RequestMapping
@Controller
public class ToDoListController {

	Logger logger = LoggerFactory.getLogger(ToDoListController.class);
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String homePage(Model model) {
		

		ToDoListService toDoListService = new ToDoListService();
		logger.info("Here is a warning message");
		model.addAttribute("ToDoList", toDoListService.getToDoList());
		return "index";
	}

	@RequestMapping(value="/CompletedList", method=RequestMethod.GET)
	public String completedList(Model model) {		

		ToDoListService toDoListService = new ToDoListService();
		logger.info("Here is a warning message");
		model.addAttribute("ToDoList", toDoListService.getcompletedList());
		return "completed";
	}
}


