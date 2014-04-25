package uk.co.appsys.generics.dev.enums;

import uk.co.appsys.generics.dev.PaymentType;

/**
 * @author aamirm
 *
 */
public enum Card implements PaymentType {
	VISA, MASTER;

	@Override
	public PaymentType getPaymentType() {
		return null;
	}
}
