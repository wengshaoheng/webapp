package wsh.webapp.service;

import wsh.webapp.vo.ClientDeviceVO;
import wsh.webapp.vo.ClientVO;

public interface IClientService {
	ClientVO getClient(int id);
	int addClient(ClientVO client);
	int bindingDevice(ClientDeviceVO clientDeviceVO);
}
