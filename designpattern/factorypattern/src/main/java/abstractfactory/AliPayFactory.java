package abstractfactory;

/**
 * Description: 支付宝支付工厂
 * @author DHC
 * @Date 2020/2/24 20:23
 *
 */
public class AliPayFactory implements IPayAreaFactory {
	@Override
	public IPay createChinaPay() {
		return new AliChinaPay();
	}

	@Override
	public IPay createForeignPay() {
		return new AliForeignPay();
	}
}
