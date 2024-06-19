package com.innovator.learnit.OOP.ClassesAndObjects;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Cart {

	// Those are fields, which often are called properties.
	public static final int DEFAULT_CART_CAPACITY = 10;
	public static final int MONEY_SCALE = 2;
	public static final double DEFAULT_TAX_RATE = 0.15;
	public static final String DEFAULT_TAX_TYPE = "incomeTax";
	public static final double DEFAULT_DISCOUNT_RATE = 0;
	public static final String DEFAULT_DISCOUNT_NAME = "zeroDiscount";

	private static int cartCounter;

	private int id;
	private int userId;
	private BigDecimal totalNetPrice; // Without taxes
	private BigDecimal totalGrossPrice; // With taxes
	private BigDecimal totalTax;
	private Tax tax;
	private Product[] products;
	private int indexToAddNewProduct;
	private Discount discount;

	// We may have static and non static initialization blocks, Static blocks are
	// very narrow
	// application domain.

	// This block will only be executed once, when class will be uploaded into JVM.
	// Good usage of static initialization block is driver class.
	// We would need to register the driver into the system.
	// Once the driver class is uploaded into JVM, we can register it in some
	// services.
	static {
		System.out.println("Cart.class is uploaded into JVM");
	}

	// Every time a cart object will be created, a car counter will be incremented.
	// In case cards will be created without user id, I know I will need to assign
	// this cart
	// to some user.

	// We use initialization blocks to initialize fields and to ensure that they
	// won't be null.
	{
		cartCounter++;
		userId = 1;
		tax = new Tax(DEFAULT_TAX_TYPE, DEFAULT_TAX_RATE);
		discount = new Discount(DEFAULT_DISCOUNT_NAME, DEFAULT_DISCOUNT_RATE);
	}

	// Constructor is a special method which should be called to instantiate object.
	// Constructor name should always be the same as that of the class.
	// Constructor doesn't have return type, because constructors always by default
	// should return reference to the object in heap memory.

	// If I hadn't any constructor declared manually, there are default ones.
	public Cart() {
	}

	// This is a custom constructor.
	// This is for creating cart with specified id and userId.
	// There should be a default constructor for custom constructor.
	// Absence of default constructor, this custom constructor will be undefined.
	// This means that to declare a custom constructor and keep constructor by
	// default,
	// I should specify the default constructor explicitly.
	public Cart(int id, int userId) {
		this.id = id;
		this.userId = userId;

		// Here the parameter id is assigned to the id of the object.
		// And the parameter userId is assigned to the userId of that object.
		// this keyword is used to reference the current object, which means
		// this.id -> private int id;
		// this.userId -> private int userId;
	}

	// No matter which constructor will be called, initialization block will be
	// executed in both cases.

	// Method adds a new product to our products and changes the state of our cart.
	public void addProduct(Product product) {
		if (product == null) {
			return;
		}

		if (products == null) {
			products = new Product[DEFAULT_CART_CAPACITY];
		}

		if (products.length < indexToAddNewProduct + 1) {
			products = Arrays.copyOf(products, products.length << 1);
		}

		products[indexToAddNewProduct++] = product;
		// Each time a product is added to our cart, other methods are called to
		// calculate
		// total net price and total gross price.
		calculateTotalNetPrice();
		calculateTotalGrossPrice();
	}

	private BigDecimal calculateTotalNetPrice() {
		this.totalNetPrice = BigDecimal.valueOf(Arrays.stream(this.products)
				.mapToDouble(product -> product != null ? product.getPrice().doubleValue() : 0)
				.sum()).setScale(MONEY_SCALE, RoundingMode.HALF_UP);
		return this.totalNetPrice;
	}
	
	private BigDecimal calculateTotalGrossPrice() {
		if (this.totalNetPrice.doubleValue() < 0) {
			calculateTotalNetPrice();
		}
		BigDecimal orderDiscount = this.totalNetPrice
				.multiply(BigDecimal.valueOf(discount.getDiscountRate()))
				.setScale(MONEY_SCALE, RoundingMode.HALF_UP);
		this.totalTax = this.totalNetPrice.multiply(BigDecimal.valueOf(tax.getTaxRate()))
				.setScale(MONEY_SCALE, RoundingMode.HALF_UP);
		this.totalGrossPrice = this.totalNetPrice.add(this.totalTax).subtract(orderDiscount);
		return this.totalGrossPrice;
	}

	//Then we have getters and setters, as the properties of the object are private,
	// and we want to have full control of how user interacts with the object and how
	// they can change state of object.
	//Getters usually are used to read properties of objects.
	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id < 0) {
			return;
		}
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

//	public Product[] getProducts() {
//		return products;
//	}
	
	//19-6-2024:
	//This getter returns a copy of products array.
	//Like this, if in some other places reference to
	// the array will be obtained, they will get a
	// reference to the copy of the array and won't
	// be able to change the state of the original products
	// array.
	
	//This is so important because we will calculate
	// total net and total gross price.
	public Product[] getProducts() {
		return Arrays.copyOf(products, products.length);
	}

	public int getIndexOfLastProductAdded() {
		return indexToAddNewProduct;
	}

	public static int getCartCounter() {
		return cartCounter;
	}
	
	public BigDecimal getTotalNetPrice() {
		return totalNetPrice;
	}

	public BigDecimal getTotalGrossPrice() {
		return totalGrossPrice;
	}

	public BigDecimal getTotalTax() {
		return totalTax;
	}
	
	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", userId=" + userId + ", totalNetPrice="
				+ totalNetPrice + ", totalGrossPrice=" + totalGrossPrice + ", totalTax="
				+ totalTax + ", products=" + Arrays.toString(products)
				+ ", indexOfLastProductAdded=" + indexToAddNewProduct + "]";
	}
	
	//Classes can have nested classes, static or non-static classes.
	//Static classes usually called just nested static classes, like Tax.
	//Non-static classes are called inner classes, like Discount.
	public class Discount {
		private String discountName;
		private double discountRate;
		
		public Discount(String discountName, double discountRate) {
			this.discountName = discountName;
			this.discountRate = discountRate;
		}

		public String getDiscountName() {
			return discountName;
		}

		public void setDiscountName(String discountName) {
			this.discountName = discountName;
		}

		public double getDiscountRate() {
			return discountRate;
		}

		public void setDiscountRate(double discountRate) {
			this.discountRate = discountRate;
		}
	}
	
	public static class Tax {
		private String taxType;
		private double taxRate;
		
		public Tax(String taxType, double taxRate) {
			this.taxType = taxType;
			this.taxRate = taxRate;
		}
		
		public String getTaxType() {
			return taxType;
		}
		public void setTaxType(String taxType) {
			this.taxType = taxType;
		}
		public double getTaxRate() {
			return taxRate;
		}
		public void setTaxRate(double taxRate) {
			this.taxRate = taxRate;
		}
		
		
	}

}
