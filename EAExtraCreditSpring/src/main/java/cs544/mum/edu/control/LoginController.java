package cs544.mum.edu.control;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
	@RequestMapping("/loginHandle")
	public String loginHandle(){
		String display ="";
		if(hasAuthority("USERTYPE_ADMIN")) display ="/admin/dashboard";
		else if(hasAuthority("USERTYPE_VOLUNTEER"))display ="/volunteer/dashboard";
		return "redirect:"+display;		
	}
	public boolean hasAuthority(String authority){
		List<GrantedAuthority>authList = getUserAuthorities();
		for(GrantedAuthority grantedAuthority : authList){
			if(authority.equals(grantedAuthority.getAuthority())){
				return true;
			}
		}
		return false;
	}
	
	public List<GrantedAuthority>getUserAuthorities(){
		return (List<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
	}
	
}
