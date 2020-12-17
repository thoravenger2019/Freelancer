package freelancer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreelancerController {
	
	
	@RequestMapping("/")
	public String suyog()
	{
		return "suyog";
	}
	
	
	@RequestMapping("/pratu")
	public String pratu()
	{
		System.out.println("Pratu made this url");
		return "index";
	}

}
