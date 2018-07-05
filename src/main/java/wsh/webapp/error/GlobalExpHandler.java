package wsh.webapp.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExpHandler {

	@ExceptionHandler
	public ModelAndView error(Exception e) {
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("exception", e);
		return mv;
	}
	
	@ExceptionHandler(WAException.class)
	public ModelAndView waerror(Exception e) {
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("exception", "WAxxx" + e.getMessage());
		return mv;
	}
}
