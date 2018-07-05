package wsh.webapp.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import wsh.webapp.vo.AuditLogVO;

@Repository
public interface IAuditLogMapper {
	
	@Insert("insert into t_audit_log (log_info) values (#{al.log_info})")
	@Options(keyProperty = "al.id", useGeneratedKeys = true)
	int addLog(@Param("al") AuditLogVO auditLog);
}
