package wsh.webapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import wsh.webapp.mapper.IAuditLogMapper;
import wsh.webapp.service.IAuditLogService;
import wsh.webapp.vo.AuditLogVO;

@Service
public class AuditLogServiceImpl implements IAuditLogService {
	
	@Autowired
	private IAuditLogMapper auditLogMapper;

	@Transactional(propagation = Propagation.SUPPORTS)
	@Override
	public int addLog(AuditLogVO auditLog) {
		return auditLogMapper.addLog(auditLog);
	}

	@Override
	public AuditLogVO getLog(int id) {
		return null;
	}

}
