package uk.ac.belfastmet.toystory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class ToyStoryController {
	
	@GetMapping("/woody")
	public String woody() {
		return "Woody was played by Tom Hanks" ;
	}

	@GetMapping("/buzz")
	public String buzz () {
		return "Buzz Lightyear was played by Tim Allen";
	}
	
	@GetMapping("/rex")
	public String rex () {
		return "Rex the scared TRex was played by the english teacher from Clueless";
}
	
	@GetMapping("/ham")
	public String hamm () {
		return "Hamm was played by yer man from cheers";
	}
	
	@GetMapping("/boe peep")
	public String boepeep () {
		return "Boe Peep is played by the granny from young Sheldon, Annie Potts";
	}

}
