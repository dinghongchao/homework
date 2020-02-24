package abstractfactory;

/**
 * Description: 银联支付
 * @author DHC
 * @Date 2020/2/24 17:27
 *
 */
public class UnionChinaPay implements IPay {
	@Override
	public void pay() {
		System.out.println("银联国内支付");
	}

	@Override
	public void record() {
		System.out.println("银联国内支付记录");
	}
}
