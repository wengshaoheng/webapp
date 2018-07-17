package wsh.webapp.controller.adm.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import wsh.webapp.controller.AbstractBizController;
import wsh.webapp.controller.IBizController;
import wsh.webapp.controller.adm.IUserController;
import wsh.webapp.service.IBaseBizService;

@Controller
@RequestMapping("/admin/user")
public class UserControllerImpl extends AbstractBizController implements IUserController, IBizController {

	
	@Override
	protected <User> void doValidate(String action, User params) {
		
	}

	@Override
	protected IBaseBizService getService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getResultView(String action) {
		// TODO Auto-generated method stub
		return null;
	}

}
