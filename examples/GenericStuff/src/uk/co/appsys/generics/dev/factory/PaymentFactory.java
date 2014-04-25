package uk.co.appsys.generics.dev.factory;

import uk.co.appsys.generics.dev.PaymentType;
import uk.co.appsys.generics.dev.enums.Card;
import uk.co.appsys.generics.dev.enums.Paypal;
import uk.co.appsys.generics.dev.impl.processor.CreditCardProcessor;
import uk.co.appsys.generics.dev.impl.processor.PaymentProcessor;
import uk.co.appsys.generics.dev.impl.processor.PaypalProcessor;

/**
 * @author aamirm
 *
 */
public class PaymentFactory {

	/**
	 * 
	 * @param paymentType
	 * @return
	 */
	public static PaymentProcessor<? extends PaymentType> getPaymentProcessor(PaymentType paymentType) {
		if(paymentType instanceof Card) {
			return new CreditCardProcessor((Card) paymentType);
		} else if (paymentType instanceof Paypal) {
			return new PaypalProcessor((Paypal) paymentType);
		}
		return null;
	}
}
