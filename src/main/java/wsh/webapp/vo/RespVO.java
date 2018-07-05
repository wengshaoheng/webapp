package wsh.webapp.vo;

public class RespVO {
	private String code;
	
	private String desc;
	
	private Object data;
	
	public RespVO() {
		this.code = "200";
		this.desc = "ok";
	}
	
	public RespVO(RespVO vo) {
		this.code = vo.code;
		this.desc = vo.desc;
		this.data = vo.data;
	}
	
	public RespVO(String code, String desc, Object data) {
		this.code = code;
		this.desc = desc;
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "RespVO [code=" + code + ", desc=" + desc + ", data=" + data + "]";
	}
}
