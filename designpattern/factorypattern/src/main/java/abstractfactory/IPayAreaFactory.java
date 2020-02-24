package abstractfactory;

/**
 * Description: 支付地域:境内/境外
 * 抽象工厂内所构造的为同一个产品的产品族
 * 如支付产品由国内支付产品与国外支付产品构成产品族，不同厂商的支付产品的产品族内对应的产品形成产品等级
 * @author DHC
 * @Date 2020/2/24 17:35
 *
 */
public interface IPayAreaFactory {

	/**
	 * 国内支付
	 * @return
	 */
	IPay createChinaPay();

	/**
	 * 国外支付
	 * @return
	 */
	IPay createForeignPay();

}
