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

	/**
	 * 
	 * @param model give a value to the word model, when it sees the word movies,
	 * it retrieves the harry potter movies information. 
	 * @return Harry Potter Information to the Harry Potter Page
	 */
	@GetMapping("/HarryPotter")
	public String HomePage(Model model) {
		
		harrypotterService harrypotterService = new harrypotterService();
		model.addAttribute("movies", harrypotterService.getharryPotterMovies());
		return "harrypotter";
	}
	


}
