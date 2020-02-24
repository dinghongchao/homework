package abstractfactory;

/**
 * Description: 微信国外支付
 * @author DHC
 * @Date 2020/2/24 20:14
 *
 */
public class WechatForeignPay implements IPay {
	@Override
	public void pay() {
		System.out.println("微信国外支付");
	}

	@Override
	public void record() {
		System.out.println("微信国外支付记录");
	}
}
