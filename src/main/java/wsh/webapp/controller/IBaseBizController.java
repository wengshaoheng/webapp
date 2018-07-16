package wsh.webapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

public interface IBaseBizController {
	
	/**
	 * link for initialization of input page, call this link to get the necessary parameters.
	 * @param paramObj parameters object
	 * @return the model and view object
	 */
	@PostMapping("/doInit")
	<T> ModelAndView doInit(T paramObj);
	
	/**
	 * link for confirm, call this link to show the values to user before submit the transaction
	 * @param paramObj
	 * @return the model and view object
	 */
	@PostMapping("/doCfm")
	<T> ModelAndView doCfm(T paramObj);
	
	/**
	 * link for acknowledgment, call this link to show the transaction result to the user
	 * @param paramObj
	 * @return the model and view object
	 */
	@PostMapping("/doAck")
	<T> ModelAndView doAck(T paramObj);

}
