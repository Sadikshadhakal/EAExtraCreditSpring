package cs544.mum.edu.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/volunteer")
public class TaskController {
	@RequestMapping(value = "/dashboard")
	public String loadingVolunteerDashboard(ModelMap model){
		String viewDispaly = "/users/other/volunteer/dashboard";
		return viewDispaly;
		
	}
	
}
