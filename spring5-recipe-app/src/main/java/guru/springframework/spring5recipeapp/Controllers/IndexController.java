package guru.springframework.spring5recipeapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping({"","/","/index"})
	private String getIndex() {
		return "index";
		
	}
	
}
