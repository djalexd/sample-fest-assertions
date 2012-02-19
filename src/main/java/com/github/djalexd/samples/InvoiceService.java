package com.github.djalexd.samples;


public interface InvoiceService {
	/**
	 * Creates a new {@link Invoice} object, given the "purchased"
	 * products.
	 * @param products
	 * @return
	 */
	Invoice createInvoiceForProducts (Product[] products);
}
