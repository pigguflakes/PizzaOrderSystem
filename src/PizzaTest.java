import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PizzaTest {
	
	Pizza newPizza,newPizza1;
	float total;

	@Before
	public void setUp() throws Exception {
		newPizza = new Pizza("BBQ", 100, 2, "Non-Veg");
		newPizza1 = new Pizza("Paneer Onion", 100, 3, "Veg");
	}

	@Test
	public void testGetName() {
		//fail("Not yet implemented");
		System.out.println("- - - - - PIZZA Details - - - - -");
		newPizza.displayDetails();
		newPizza1.displayDetails();
	}


	@Test
	public void testGetPrice() {
		//fail("Not yet implemented");
		System.out.println("- - - - - Bill Details - - - - -");
		total=total+newPizza.generatePrice()+newPizza1.generatePrice();
		System.out.println("Pizza Price of " +newPizza.getName()+ " BEFORE TAX : "+newPizza.generatePrice());
		System.out.println("Pizza Price of " +newPizza1.getName()+ " BEFORE TAX : "+newPizza1.generatePrice());

		/*newPizza1.ApplyInterest();
		System.out.println("Pizza Price AFTER TAX(8%) :" +newPizza1.getFinalrate());
		System.out.println("- - -");*/
		
		System.out.println("Total Amount: "+total);

		float tax = taxFun(total);
		System.out.println("GST AMOUNT: "+tax);
		float finalamt = total+tax;
		System.out.println("Grand Total : " +finalamt);
		System.out.println(" ");
	}


	@Test
	public void testGetQuantity() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void testGetFinalRate() {
		//fail("Not yet implemented");

	}
	
	public float taxFun(float total){
		float tax=(total*8)/100;
		return tax;
	}
}