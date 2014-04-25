package uk.co.appsys.generics.dev;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import uk.co.appsys.generics.dev.enums.Paypal;
import uk.co.appsys.generics.dev.factory.PaymentFactory;
import uk.co.appsys.generics.dev.impl.processor.OrderProcessor;
import uk.co.appsys.generics.dev.impl.processor.PaymentProcessor;
import uk.co.appsys.generics.dev.impl.processor.PaypalProcessor;

@RunWith(PowerMockRunner.class)
@PrepareForTest(PaymentFactory.class)
public class PaymentProcessorTest {

	@Spy
	@InjectMocks
	private OrderProcessor processor = new OrderProcessor();
	
	@Mock private static PaypalProcessor paypalProcessor;
	
	@BeforeClass
	public static void setUp() throws Exception {
		MockitoAnnotations.initMocks(PaymentProcessorTest.class);
		PowerMockito.mockStatic(PaymentFactory.class);
		
		Mockito.when(PaymentFactory.getPaymentProcessor(Paypal.EXPRESS)).thenAnswer(new Answer<PaymentProcessor<? extends PaymentType>>() {
			/*
			 * (non-Javadoc)
			 * @see org.mockito.stubbing.Answer#answer(org.mockito.invocation.InvocationOnMock)
			 */
			@Override
			public PaymentProcessor<? extends PaymentType> answer(InvocationOnMock invocation) throws Throwable {
				return paypalProcessor;
			}
		});
	}

	@Test
	public void testProcessPayment() {
		assertNotNull(processor.processPayment());
		
		System.out.println(processor.processPayment());
	}
}
