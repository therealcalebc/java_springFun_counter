/**
 * 
 */
package com.javaspring.controllerspractice.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ccomstock
 *
 */
@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index(HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		if(count != null)
			count++;
		else
			count = 0;
		session.setAttribute("count", count);
		return "welcome.jsp";
	}
	
	@GetMapping("/counter")
	public String counter(HttpSession session, Model model) {
		Integer count = (Integer) session.getAttribute("count");
		if(count == null)
			count = 0;
		session.setAttribute("count", count);
		model.addAttribute("count", count);
		model.addAttribute("title", "Current visit count");
		model.addAttribute("url", "http://localhost:8080");
		return "counter.jsp";
	}
	
	@GetMapping("/reset")
	public String resetCounter(HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		if(count != null)
			count = 0;
		session.setAttribute("count", count);
		return "redirect:/counter";
	}
	
}
