package container;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Description: 容器式单例
 * @author DHC
 * @Date 2020/2/29 19:05
 *
 */
public class ContainerSingleton {

	private static Map<String,Object> ioc = new ConcurrentHashMap<>();

	public Object getInstance(String className) {
		Object obj = null;
		if(!ioc.containsKey(className)) {
			try {
				obj = Class.forName(className).newInstance();
				ioc.putIfAbsent(className,obj);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			obj = ioc.get(className);
		}
		return obj;
	}
}
