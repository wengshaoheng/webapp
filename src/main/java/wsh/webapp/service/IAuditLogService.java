package wsh.webapp.service;

import wsh.webapp.vo.AuditLogVO;

public interface IAuditLogService {
	
	int addLog(AuditLogVO auditLog);
	
	AuditLogVO getLog(int id);
}
