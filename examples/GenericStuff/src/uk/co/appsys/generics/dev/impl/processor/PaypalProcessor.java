package uk.co.appsys.generics.dev.impl.processor;

import uk.co.appsys.generics.dev.enums.Paypal;

/**
 * @author aamirm
 *
 */
public class PaypalProcessor implements PaymentProcessor<Paypal> {

	private Paypal paymentType;
	
	public PaypalProcessor(Paypal paymentType) {
		this.paymentType = paymentType;
	}
	
	/*
	 * (non-Javadoc)
	 * @see uk.co.appsys.generics.dev.PaymentProcessor#getPaymentType()
	 */
	@Override
	public Paypal getPaymentType() {
		return paymentType;
	}

}
