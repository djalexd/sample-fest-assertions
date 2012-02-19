package com.github.djalexd.samples;


/**
 * A very simplistic invoice.
 * @author alex
 *
 */
public class Invoice {
	// Domain specific objects.
	Address billingAddress;
	
	Address shipToAddress;
	
	Product[] products;

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public Address getShipToAddress() {
		return shipToAddress;
	}

	public void setShipToAddress(Address shipToAddress) {
		this.shipToAddress = shipToAddress;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
}
