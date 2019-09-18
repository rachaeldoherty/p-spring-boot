package uk.ac.belfastmet.dwarfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarfs.service.DwarfService;

@Controller
@RequestMapping
public class DwarfsController {
	
	@GetMapping()
	public String homePage(Model model){
		model.addAttribute("pageTitle", "Tolkien is #1");
		model.addAttribute("Dwarfs","We all know you are here for Tolkien");
		return "index";
		}
	
	@GetMapping("/disney")
	public String disneyPage(Model model) {
		
		DwarfService dwarfService = new DwarfService();
		model.addAttribute("dwarfs", dwarfService.getDisneyDwarfs());
		model.addAttribute("pageTitle", "Tolkien is #1");
		model.addAttribute("numberofDwarfs","7");
		return"disney";
	}
	
	@GetMapping("/tolkien")
	public String tolkienPage(Model model) {
		DwarfService dwarfService = new DwarfService();
		model.addAttribute("dwarfs", dwarfService.getTolkienDwarfs());
		model.addAttribute("pageTitle", "Tolkien is #1");
		model.addAttribute("numberofDwarfs","13");
		return"tolkien";
	}

}
