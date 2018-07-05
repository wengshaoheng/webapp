package wsh.webapp.vo;

public class AuditLogVO {

	private int id;
	
	private String logInfo;
	
	public AuditLogVO() {}
	public AuditLogVO(String logInfo) {
		this.logInfo = logInfo;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "AuditLogVO [id=" + id + ", logInfo=" + logInfo + "]";
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getLogInfo() {
		return logInfo;
	}

	public void setLogInfo(String logInfo) {
		this.logInfo = logInfo;
	}
	
	public String getLog_info() {
		return logInfo;
	}
	
	public void setLog_info(String logInfo) {
		this.logInfo = logInfo;
	}
}
