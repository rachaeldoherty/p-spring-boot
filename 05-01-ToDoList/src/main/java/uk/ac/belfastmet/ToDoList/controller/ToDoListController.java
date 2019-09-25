package uk.ac.belfastmet.ToDoList.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uk.ac.belfastmet.ToDoList.service.ToDoListService;

@RequestMapping
@Controller
public class ToDoListController {

	@Autowired
	private ToDoListService toDoListService;
	
	Logger logger = LoggerFactory.getLogger(ToDoListController.class);
	
	/**
	 * @param model
	 * creating a get Number of Tasks method 
	 * @return
	 */
	
	@RequestMapping(value = "/todo", method = RequestMethod.GET)
	public String homePage(Model model) {
		logger.info("Here is a warning message");
		model.addAttribute("toDoList", toDoListService.getToDoList());
		return "index";
	}
	/**
	 * @param model
	 * creating methods to return the Completed List page
	 * @return
	 */
	@RequestMapping(value = "/CompletedList", method = RequestMethod.GET)
	public String completedList(Model model) {
		logger.info("Here is a warning message");
		model.addAttribute("ToDoList", toDoListService.getcompletedList());
		model.addAttribute("message", "All Done!");
		return "completed";
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loginPage(Model model) {
		logger.info("Here is a warning message");
		return "login";
	}
}