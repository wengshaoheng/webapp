package wsh.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import wsh.webapp.service.IClientService;
import wsh.webapp.vo.ClientDeviceVO;
import wsh.webapp.vo.ClientVO;
import wsh.webapp.vo.RespVO;

@Controller
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	private IClientService clientService;
	
//	@Autowired
//	private IAuditLogService auditLogService;
	
	@PostMapping("/add")
	@ResponseBody
	public RespVO add(ClientVO client) {
//		AuditLogVO auditLog = new AuditLogVO("add client");
//		auditLogService.addLog(auditLog);
		int done = clientService.addClient(client);
		if (done > 0) return new RespVO("200", "ok", client);
		else return new RespVO("500", "failure", client);
	}
	
	@PostMapping("/bindingDevice")
	@ResponseBody
	public RespVO bindingDevice(ClientDeviceVO clientDeviceVO) {
		
		int done = clientService.bindingDevice(clientDeviceVO);
		if (done > 0) return new RespVO("200", "ok", clientDeviceVO);
		else return new RespVO("500", "failure", clientDeviceVO);
	}
	
}
