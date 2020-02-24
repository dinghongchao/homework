package abstractfactory;

/**
 * Description: 支付宝国外支付
 * @author DHC
 * @Date 2020/2/24 20:14
 *
 */
public class AliForeignPay implements IPay {
	@Override
	public void pay() {
		System.out.println("支付宝国外支付");
	}

	@Override
	public void record() {
		System.out.println("支付宝国外支付记录");
	}
}
