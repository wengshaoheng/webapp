package wsh.webapp.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 
 * base interface for business
 */
public interface IBizController {
	
	/**create txn action*/
	String ACTION_CREATE = "create";
	
	/**update txn action*/
	String ACTION_UPDATE = "update";
	
	/**delete txn action*/
	String ACTION_DELETE = "delete";
	
	/**list txn action*/
	String ACTION_LIST   = "list";
	
	/**
	 * link for initialization of input page, call this link to get the necessary parameters.
	 * @param action operator 
	 * @param paramObj parameters object
	 * @return the model and view object
	 */
	@PostMapping("/doInit/{action}")
	<T> String doInit(@PathVariable("action") String action, T paramObj, ModelMap mm);
	
	/**
	 * link for confirm, call this link to show the values to user before submit the transaction
	 * @param paramObj
	 * @return the model and view object
	 */
	@PostMapping("/doCfm/{action}")
	<T> String doConfirm(@PathVariable("action") String action, T paramObj, ModelMap mm);
	
	/**
	 * link for acknowledgment, call this link to show the transaction result to the user
	 * @param paramObj
	 * @return the model and view object
	 */
	@PostMapping("/doAck/{action}")
	<T> String doAck(@PathVariable("action") String action, T paramObj, ModelMap mm);
	
	/**
	 * search the return the result list
	 * @param paramObj the search criteria 
	 * @param mm
	 * @return
	 */
	@PostMapping("/doList")
	<T, E> String doList(T paramObj, ModelMap mm);

}
