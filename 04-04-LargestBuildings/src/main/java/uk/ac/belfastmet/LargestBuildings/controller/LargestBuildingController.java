package uk.ac.belfastmet.LargestBuildings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.LargestBuildings.domain.LargestBuildings;
import uk.ac.belfastmet.LargestBuildings.service.LargestBuildingsService;


@Controller
@RequestMapping
public class LargestBuildingController {

/**	
 * 
 * @param model
 * @return the home page
 */
	@GetMapping("/")
	public String homePage(Model model){
		//model.addAttribute("", " ");
		return "index";
		}
/**
 * 	
 * @param model, returns information regarding the 
 * largest buildings by floor area when the word buildings appears (or is meant to)
 * @return floor area page 
 */
	@GetMapping("/floorarea")
	public String floorAreaPage(Model model) {
		
		LargestBuildingsService LargestBuildingsService = new LargestBuildingsService();
		model.addAttribute("LargestBuildings", LargestBuildingsService.getLargestBuildingsfloorArea());
		model.addAttribute("pageTitle", "By Floor Area");
		return"floorarea";
	}
	
}