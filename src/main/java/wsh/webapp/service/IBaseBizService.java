package wsh.webapp.service;

import java.util.List;

public interface IBaseBizService {
	
	<T> int update(T params);
	
	<T> int create(T params);
	
	<T> int delete(T params);
	
	<T, E> List<E> list(T params);
}
