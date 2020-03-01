import java.util.ArrayList;
import java.util.List;

/**
 * Description: 
 * @author DHC
 * @Date 2020/3/1 16:35
 *
 */
public class PrototypeTest {

	public static void main(String[] args) {
		Prototype prototype = new Prototype();
		prototype.setName("DHC");
		List<String> list = new ArrayList<>();
		list.add("D");
		prototype.setList(list);

		Prototype prototypeCopy = prototype.deepClone();
		prototypeCopy.getList().add("H");

		System.out.println(prototype.toString());

		Prototype prototypeCopy1 = prototype.clone();
		prototypeCopy1.getList().add("H");

		System.out.println(prototype.toString());
	}
}
