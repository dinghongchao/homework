import com.google.common.base.Objects;
import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

/**
 * Description: 原型模式
 * @author DHC
 * @Date 2020/3/1 15:59
 *
 */
public class Prototype implements Cloneable {

	private String name;
	private List<String> list;

	private static Gson gson;
	static {
		gson = new Gson();
	}
	public Prototype deepClone() {
		Prototype prototype = this;
		Prototype copy = gson.fromJson(gson.toJson(prototype),Prototype.class);
		return copy;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public List<String> getList() {
		return list;
	}

	@Override
	public Prototype clone()  {
		try {
			return (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this).add("name", name).add("list", Arrays.toString(list.toArray())).toString();
	}
}
