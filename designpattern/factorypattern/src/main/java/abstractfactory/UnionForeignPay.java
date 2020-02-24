package abstractfactory;

/**
 * Description: 银联国外支付
 * @author DHC
 * @Date 2020/2/24 20:15
 *
 */
public class UnionForeignPay implements IPay {
	@Override
	public void pay() {
		System.out.println("银联国外支付");
	}

	@Override
	public void record() {
		System.out.println("银联国外支付记录");
	}
}
