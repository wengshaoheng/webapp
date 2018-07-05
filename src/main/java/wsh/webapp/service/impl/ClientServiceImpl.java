package wsh.webapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import wsh.webapp.mapper.IAuditLogMapper;
import wsh.webapp.mapper.IClientMapper;
import wsh.webapp.service.IAuditLogService;
import wsh.webapp.service.IClientService;
import wsh.webapp.vo.AuditLogVO;
import wsh.webapp.vo.ClientDeviceVO;
import wsh.webapp.vo.ClientVO;

@Service
public class ClientServiceImpl implements IClientService {
	
	@Autowired
	private IClientMapper clientMapper;
	
	@Autowired
	private IAuditLogService auditLogService;

	@Override
	public ClientVO getClient(int id) {
		return clientMapper.getClient(id);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public int addClient(ClientVO client) {
		String info = "Create new client ";
		try {
			int rc = clientMapper.addClient(client);
			if (client.getId() > 1) throw new RuntimeException(" err test transaction");
			info += client;
			return rc;
		} catch (Exception e) {
			info += e.getMessage();
			throw e;
		} finally {
			AuditLogVO auditLog = new AuditLogVO();
			auditLog.setLogInfo(info);
			auditLogService.addLog(auditLog);
		}
	}

	@Override
	public int bindingDevice(ClientDeviceVO clientDeviceVO) {
		return clientMapper.bindingDevice(clientDeviceVO);
	}
	

}
