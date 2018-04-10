import static org.junit.Assert.*;

import org.junit.Test;

import Vending.Dispenser;
import Vending.InvalidItemException;
import Vending.NoCoinsException;
import Vending.NotEnoughtCreditException;
import Vending.UnavailableItemException;

public class DispenserTest {
   
	Dispenser d = new Dispenser();
	
	@Test
	public final void teste0() throws NoCoinsException, InvalidItemException, 
	UnavailableItemException, NotEnoughtCreditException {
	  try{	
		assertEquals(true,d.dispense(50, 2) == 50);
	  }catch(NoCoinsException | InvalidItemException | 
			 UnavailableItemException | NotEnoughtCreditException e){
		  System.out.println(e.getMessage());
		  e.printStackTrace();
	  }
	}
	@Test
	public final void teste1() throws NoCoinsException, InvalidItemException, 
	UnavailableItemException, NotEnoughtCreditException {
		try{		
		  assertEquals(true,d.dispense(100, 4) == 100);
		  assertEquals(false,d.dispense(100, 4) == 101);
		  assertEquals(false,d.dispense(100, 4) == 99);
		 }catch(NoCoinsException | InvalidItemException | 
				 UnavailableItemException | NotEnoughtCreditException e){
			  System.out.println(e.getMessage());
			  e.printStackTrace();
		  }
	}
	@Test
	public final void teste3() throws NoCoinsException, InvalidItemException, 
	UnavailableItemException, NotEnoughtCreditException {
	  try{	
		assertEquals(true,d.dispense(50, 1) == 50);
		assertEquals(true,d.dispense(50, 2) == 50);
		assertEquals(true,d.dispense(50, 3) == 50);
		assertEquals(true,d.dispense(51, 2) == 50);
		assertEquals(false,d.dispense(50, 2) == 49);
		assertEquals(false,d.dispense(50, 3) == 51);
		assertEquals(false,d.dispense(50, 2) == 21);
		assertEquals(false,d.dispense(50, 2) == 0);
		assertEquals(true,d.dispense(50, 15) == 50);
	  }catch(NoCoinsException | InvalidItemException | 
				 UnavailableItemException | NotEnoughtCreditException e){
			  System.out.println(e.getMessage());
			  e.printStackTrace();
	  }
	}
	@Test
	public final void teste4() throws NoCoinsException, InvalidItemException, 
	UnavailableItemException, NotEnoughtCreditException {
	  try{	
		assertEquals(true,d.dispense(200, 20) == 200);
		assertEquals(true,d.dispense(200, 8) == 200);
		assertEquals(false,d.dispense(200, 8) == 199);
		assertEquals(false,d.dispense(200, 8) == 201);
	  }catch(NoCoinsException | InvalidItemException | 
				 UnavailableItemException | NotEnoughtCreditException e){
			  System.out.println(e.getMessage());
			  e.printStackTrace();
	  }	
	}
	@Test
	public final void teste5() throws NoCoinsException, InvalidItemException, 
	UnavailableItemException, NotEnoughtCreditException {
	  try{	
		assertEquals(true,d.dispense(100, 6) == 100);
		assertEquals(false,d.dispense(100, 6) == 101);
		assertEquals(false,d.dispense(100, 6) == 99);
	  }catch(NoCoinsException | InvalidItemException | 
				 UnavailableItemException | NotEnoughtCreditException e){
			  System.out.println(e.getMessage());
			  e.printStackTrace();
	  }	
	}
}
