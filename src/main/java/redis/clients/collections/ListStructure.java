package redis.clients.collections;

import java.util.List;

public interface ListStructure <T> extends Expirable {

	List<T> get(String key);
	
	void delete(String key);
}
