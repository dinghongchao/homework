package userpay;

import abstractfactory.*;

/**
 * Description: 用户支付
 * @author DHC
 * @Date 2020/2/24 20:30
 *
 */
public class UserPay {

	public static void main(String[] args) {
		IPayAreaFactory payFactory = new AliPayFactory();
		IPay payObj = payFactory.createChinaPay();
		payObj.pay();
		IPayAreaFactory unionPayFactory = new UnionPayFactory();
		payObj = unionPayFactory.createForeignPay();
		payObj.pay();
		IPayAreaFactory wechatPayFactory = new WechatPayFactory();
		payObj = wechatPayFactory.createForeignPay();
		payObj.pay();
	}
}
