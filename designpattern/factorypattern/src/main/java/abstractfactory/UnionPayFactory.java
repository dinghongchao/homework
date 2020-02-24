package abstractfactory;

/**
 * Description: 银联支付工厂
 * @author DHC
 * @Date 2020/2/24 20:27
 *
 */
public class UnionPayFactory implements IPayAreaFactory {


	@Override
	public IPay createChinaPay() {
		return new UnionChinaPay();
	}

	@Override
	public IPay createForeignPay() {
		return new UnionForeignPay();
	}
}
