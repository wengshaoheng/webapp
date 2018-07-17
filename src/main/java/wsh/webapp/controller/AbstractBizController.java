package wsh.webapp.controller;

import java.util.List;

import org.springframework.ui.ModelMap;

import wsh.webapp.service.IBaseBizService;

/**
 * business controller
 */
public abstract class AbstractBizController implements IBizController {

	@Override
	public <T> String doInit(String action, T paramObj, ModelMap mm) {
		
		return null;
	}

	@Override
	public <T> String doCfm(String action, T paramObj, ModelMap mm) {
		//validate the input parameters
		doValidate(action, paramObj);
		
		return getResultView(action);
	}

	@Override
	public <T> String doAck(String action, T paramObj, ModelMap mm) {
		//validate the input parameters
		doValidate(action, paramObj);
		try {
			
		} catch (Throwable tx) {
			
		}
		return getResultView(action);
	}
	
	@Override
	public <T, E> String doList(T paramObj, ModelMap mm) {
		//validate the input parameters
		doValidate(ACTION_LIST, paramObj);
		
		//execute the search service
		List<E> objList = getService().list(paramObj);
		mm.addAttribute("dataList", objList);
		
		//return the result view
		return getResultView(ACTION_LIST);
	}
	
	/**
	 * execute the corresponding method service
	 * @param action
	 * @param paramObj
	 * @return the count of record
	 */
	protected <T> int doExceute(String action, T paramObj) {
		switch (action) {
		case ACTION_CREATE:
			return getService().create(paramObj);
		case ACTION_UPDATE:
			return getService().update(paramObj);
		case ACTION_DELETE:
			return getService().delete(paramObj);
		}
		
		return 0;
	}
	
	/**
	 * validate the input parameters
	 * @param action create/update/delete actions
	 * @param params the input parameters
	 */
	protected abstract <T> void doValidate(String action, T params);
	
	/**
	 * return the handler service
	 * @return handler service
	 */
	protected abstract IBaseBizService getService();
	
	/**
	 * return the destination result view 
	 * @return destination view 
	 */
	protected abstract String getResultView(String action);

}
