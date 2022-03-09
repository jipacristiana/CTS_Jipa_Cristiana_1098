package ro.ase.cts.g1098.clean.code.stage2;

//stage2
// - we are using enumerations
// - enums are classes in java


public class Product {
	
	
	static final int MAX_ACCOUNT_AGE = 10;
	static final float MAX_ACCOUNT_DISCOUNT = 0.15f;
	
	
	
	public float computeFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears)
	  {
	    float finalPrice = 0;
	    float accountDiscount = (accountAgeInYears >  MAX_ACCOUNT_AGE) ? MAX_ACCOUNT_DISCOUNT : (float)accountAgeInYears/100; 
	    if (productType == ProductType.NEW)
	    {
	      finalPrice = initialPrice;
	    }
	    else if (productType == ProductType.DISCOUNT)
	    {
	      finalPrice = (initialPrice - (ProductType.DISCOUNT.getDiscount() * initialPrice)) - accountDiscount * (initialPrice - (ProductType.DISCOUNT.getDiscount() * initialPrice));
	    }
	    else if (productType == ProductType.SALES)
	    {
	      finalPrice = (initialPrice - (ProductType.SALES.getDiscount() * initialPrice)) - accountDiscount * (initialPrice - (ProductType.SALES.getDiscount() * initialPrice));
	    }
	    else if (productType == ProductType.FINAL_SALES)
	    {
	      finalPrice = (initialPrice - (ProductType.FINAL_SALES.getDiscount() * initialPrice)) - accountDiscount * (initialPrice - (ProductType.FINAL_SALES.getDiscount() * initialPrice));
	    }
	    return finalPrice;
	  }
}