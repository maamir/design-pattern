package uk.co.appsys.generics.dev.impl.processor;

import uk.co.appsys.generics.dev.PaymentType;
import uk.co.appsys.generics.dev.enums.Paypal;
import uk.co.appsys.generics.dev.factory.PaymentFactory;

/**
 * File: OrderProcessor.java
 * 
 * @author aamirm
 *
 */
public class OrderProcessor {

	public PaymentProcessor<? extends PaymentType> processsor = PaymentFactory.getPaymentProcessor(Paypal.GUEST);
	
	public PaymentType processPayment() {
		return processsor.getPaymentType();
	}
}
