package uk.ac.belfastmet.harrypotter.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.harrypotter.service.harrypotterService;

@Controller
@RequestMapping
public class harrypotterController {
	
	@GetMapping()
	public String homePage(Model model){
		model.addAttribute("pageTitle", "Haz Potz Rulz");
		model.addAttribute("HazPotz Life","ALWAYS");
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
