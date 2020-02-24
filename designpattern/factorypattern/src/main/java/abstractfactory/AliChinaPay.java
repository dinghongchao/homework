package abstractfactory;

/**
 * Description: 支付宝支付
 * @author DHC
 * @Date 2020/2/24 17:25
 *
 */
public class AliChinaPay implements IPay {
	@Override
	public void pay() {
		System.out.println("支付宝国内支付");
	}

	@Override
	public void record() {
		System.out.println("支付宝国内支付记录");
	}
}
