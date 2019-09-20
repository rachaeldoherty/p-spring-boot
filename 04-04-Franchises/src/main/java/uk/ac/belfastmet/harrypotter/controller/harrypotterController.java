package uk.ac.belfastmet.harrypotter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.ac.belfastmet.harrypotter.service.harrypotterService;

@Controller
@RequestMapping
public class harrypotterController {
	
	Logger logger = LoggerFactory.getLogger(harrypotterController.class);
	
	@GetMapping()
	public String homePage(Model model){
		model.addAttribute(" ", " ");
		model.addAttribute(" "," ");
		logger.info("An INFO Message");
		return "index";
		}
	
	@GetMapping("/HarryPotter")
	public String HomePage(Model model) {
		
		harrypotterService harrypotterService = new harrypotterService();
		model.addAttribute("movies", harrypotterService.getharryPotterMovies());
		model.addAttribute("numberofbooks","7 Books");
		model.addAttribute("numberofmovies","8 Movies");
		return "harrypotter";
	}
	


}
