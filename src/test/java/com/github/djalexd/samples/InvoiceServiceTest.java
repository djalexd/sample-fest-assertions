package com.github.djalexd.samples;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class InvoiceServiceTest {
	private InvoiceService service;
	
	@Before
	public void setUpService() {
		// TODO wire up the service. Code is proof of concept, it doesn't actually
		// do anything.
		service = null;
	}
	
	@Test
	public void shouldCreateAnInvoiceForProducts() {
		// Create a billing address.
		Address billingAddress = new Address("1st of many");

		// Create some products
		Product[] someProducts = new Product[] { new Product(), new Product() };

		// This is what we test.
		Invoice invoice = service.createInvoiceForProducts(someProducts);
		
		// Assertions. We need to make sure that, if invoice is valid
		// (#createInvoiceForProducts doesn't throw any exception), it
		// will have a valid address, a valid timestamp, etc etc etc.
		assertNotNull(invoice);
		assertNotNull(invoice.getBillingAddress());
		assertNotNull(invoice.getBillingAddress().getStreet());
		assertEquals(billingAddress, invoice.getBillingAddress());
		
		// possibly other assertions, invoice can be a pretty complex object.
	}
}
