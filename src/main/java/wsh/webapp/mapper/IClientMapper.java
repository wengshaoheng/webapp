package wsh.webapp.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import wsh.webapp.vo.ClientDeviceVO;
import wsh.webapp.vo.ClientVO;

@Repository
public interface IClientMapper {
	
	@Select("select id, name from t_client where id = #{clientId}")
	ClientVO getClient(@Param("clientId") int clientId);
	
	@Insert("insert into t_client (name) values (#{client.name})")
	@Options(keyProperty = "client.id", useGeneratedKeys = true)
	int addClient(@Param("client") ClientVO client);
	
	@Insert("insert into t_client_device (cid, did) values (#{cdVO.cid}, #{cdVO.did})")
	@Options(keyProperty = "cdVO.id", useGeneratedKeys = true)
	int bindingDevice(@Param("cdVO") ClientDeviceVO clientDeviceVO);
}
