package uk.co.appsys.generics.dev.impl.processor;

import uk.co.appsys.generics.dev.PaymentType;

/**
 * @author aamirm
 *
 */
public interface PaymentProcessor<T extends PaymentType> {

	T getPaymentType();
}
