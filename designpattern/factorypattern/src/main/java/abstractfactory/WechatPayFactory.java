package abstractfactory;

/**
 * Description: 微信支付工厂
 * @author DHC
 * @Date 2020/2/24 20:28
 *
 */
public class WechatPayFactory implements IPayAreaFactory {
	@Override
	public IPay createChinaPay() {
		return new WechatChinaPay();
	}

	@Override
	public IPay createForeignPay() {
		return new WechatForeignPay();
	}
}
