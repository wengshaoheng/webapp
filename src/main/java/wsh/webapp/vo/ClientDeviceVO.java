package wsh.webapp.vo;

public class ClientDeviceVO {
	
	private int id;
	
	private int cid;
	
	private int did;
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	@Override
	public String toString() {
		return "ClientDeviceVO [cid=" + cid + ", did=" + did + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
