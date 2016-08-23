package cs544.mum.edu.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class ProjectController {
	@RequestMapping(value="/dashboard")
	public String loadingAdminDashboard(ModelMap model){
		String displayPath ="/users/admin/dashboard";
		return displayPath;
	}
}
