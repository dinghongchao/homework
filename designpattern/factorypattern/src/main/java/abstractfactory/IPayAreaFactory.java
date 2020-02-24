package abstractfactory;

/**
 * Description: 支付地域:境内/境外
 * 抽象工厂内所构造的为同一个产品的产品族
 * 如支付产品由国内支付与国外支付构成产品族，不同厂商的支付产品的产品族内对应的产品形成产品等级(但此种归纳可能不符合真实情况，
 * 如支付宝、微信主要是在国内流行的支付产品。国外类似paypal、google等支付渠道
 * 并没有从支付产品的核心功能出发考虑。最理想应以核心功能如支付、退款、支付记录为产品族)
 *
 * 产品族可以从两个不同的维度去考虑，如当前模式为一种，另一种则以支付和记录构成产品族，以国内厂商、国外厂商(paypal、amazon)的产品单一族构成产品等级
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
