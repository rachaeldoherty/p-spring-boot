package uk.ac.belfastmet.dwarfs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.ac.belfastmet.dwarfs.service.DwarfService;

@Controller
@RequestMapping
public class DwarfsController {
	@Autowired
	private DwarfService dwarfService;

	Logger logger = LoggerFactory.getLogger(DwarfsController.class);

	/**
	 * 
	 * @param model
	 * @return the index html page for homepage
	 */
	@GetMapping()
	public String homePage(Model model) {
		dwarfService.getNumberofDwarfs();
		model.addAttribute("pageTitle", "Tolkien is #1");
		model.addAttribute("Dwarfs", "We all know you are here for Tolkien");
		return "index";
	}

	/**
	 * 
	 * @param model
	 * @return the index html page for disneypage
	 */
	@GetMapping("/disney")
	public String disneyPage(Model model) {
		logger.info("Here is a warning message");
		dwarfService.getNumberofDwarfs();
		model.addAttribute("dwarfs", dwarfService.getDisneyDwarfs());
		model.addAttribute("pageTitle", "Tolkien is #1");
		model.addAttribute("numberofDwarfs", "7");
		return "disney";
	}

	/**
	 * 
	 * @param model
	 * @return the index html page for tolkienpage
	 */
	@GetMapping("/tolkien")
	public String tolkienPage(Model model) {
		dwarfService.getNumberofDwarfs();
		logger.info("Here is a warning message");
		model.addAttribute("dwarfs", dwarfService.getTolkienDwarfs());
		model.addAttribute("pageTitle", "Tolkien is #1");
		model.addAttribute("numberofDwarfs", "13");

		return "tolkien";
	}

}
