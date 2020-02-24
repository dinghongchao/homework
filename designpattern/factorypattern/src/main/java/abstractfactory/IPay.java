package abstractfactory;

/**
 * Description: 支付操作
 * @author DHC
 * @Date 2020/2/24 17:34
 *
 */
public interface IPay {

	/**
	 * 支付
	 */
	void pay();

	/**
	 * 支付记录
	 */
	void record();
}
