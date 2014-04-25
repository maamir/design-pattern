package uk.co.appsys.generics.dev.enums;

import uk.co.appsys.generics.dev.PaymentType;

/**
 * @author aamirm
 *
 */
public enum Paypal implements PaymentType {
	EXPRESS, GUEST;

	@Override
	public PaymentType getPaymentType() {
		return null;
	}
}
