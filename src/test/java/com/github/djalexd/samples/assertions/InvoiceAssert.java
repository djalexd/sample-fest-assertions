package com.github.djalexd.samples.assertions;

import org.fest.assertions.Assertions;
import org.fest.assertions.GenericAssert;

import com.github.djalexd.samples.Address;
import com.github.djalexd.samples.Invoice;


public class InvoiceAssert extends GenericAssert<InvoiceAssert, Invoice> {

	public InvoiceAssert(Invoice actual) {
		super(InvoiceAssert.class, actual);
	}

	public static InvoiceAssert assertThat(Invoice actual) {
		return new InvoiceAssert(actual);
	}
	
	public InvoiceAssert hasBillingAddress() {
		Assertions.assertThat(actual.getBillingAddress()).isNotNull();
		return this;
	}
	
	public InvoiceAssert hasBillingAddress(Address billingAddress) {
		Assertions.assertThat(actual.getBillingAddress()).isEqualTo(billingAddress);
		return this;
	}
}
