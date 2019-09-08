package ch.bbw.m133_michael_moeckli_editprofile;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class ProfilController implements WebMvcConfigurer{
	
	@GetMapping("/editprofile")
	public String editCustomerForm(Model model) {
		User user= new User();
		model.addAttribute(  "user", new User());
		return "editprofile";
	}
	

	@PostMapping("/editprofile")
	public String editCustomerSubmit(@ModelAttribute @Valid User user, BindingResult bindingResult ) {
	
        if (bindingResult.hasErrors()) {
            return "editprofile";
        }
		return ("profilesaved");
	}
	
	@GetMapping("/profilesaved")
	public String showCustomerForm() {

		return "profilesaved";
	}
}