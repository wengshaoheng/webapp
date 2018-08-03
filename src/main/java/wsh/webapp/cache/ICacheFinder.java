package wsh.webapp.cache;

public interface ICacheFinder<T> {
	T findCache(String key);
}
