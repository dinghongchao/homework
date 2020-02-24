package abstractfactory;

/**
 * Description: 微信支付
 * @author DHC
 * @Date 2020/2/24 17:26
 *
 */
public class WechatChinaPay implements IPay {
	@Override
	public void pay() {
		System.out.println("微信国内支付");
	}

	@Override
	public void record() {
		System.out.println("微信国内支付记录");
	}
}
