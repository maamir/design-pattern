package uk.co.appsys.generics.dev.impl.processor;

import uk.co.appsys.generics.dev.enums.Card;

/**
 * @author aamirm
 *
 */
public class CreditCardProcessor implements PaymentProcessor<Card> {

	private Card paymentType;
	
	public CreditCardProcessor(Card paymentType) {
		this.paymentType = paymentType;
	}
	
	/*
	 * (non-Javadoc)
	 * @see uk.co.appsys.generics.dev.PaymentProcessor#getPaymentType()
	 */
	@Override
	public Card getPaymentType() {
		return paymentType;
	}
}
