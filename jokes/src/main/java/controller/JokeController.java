package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.JokeService;
import service.JokeServiceImpl;

@Controller
public class JokeController {
	
	
	private final JokeService service;
	
	
	public JokeController() {
		this.service = new JokeServiceImpl();
	}



	@RequestMapping({"/",""})
	public String getmsg(Model model) {
		model.addAttribute("joke",service.getQuote());
		return "joke";
	}

}
