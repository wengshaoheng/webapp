package wsh.webapp.vo;

public class DeviceVO {
	
	private int id;
	
	private int dtype;
	
	private String dname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDtype() {
		return dtype;
	}

	public void setDtype(int dtype) {
		this.dtype = dtype;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "DeviceVO [id=" + id + ", dtype=" + dtype + ", dname=" + dname + "]";
	}

}
