package Test;

import junit.framework.TestCase;
import model.Ingredient;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import org.junit.Test;
import exception.NegativeNumberException;

public class IngredientTest extends TestCase{
	
	private Ingredient ingredient;

	public void setupStage1() {
		
		ingredient = new Ingredient("Tomate", 245);
		
	}

	
	@Test
	public void testAddWeight() {
		
		setupStage1();
		try {
			ingredient.addWeight(54);
		}catch(NegativeNumberException e) {
			//e.printStackTrace();
			assertEquals("No fue posible agregar el ingrediente, no se puede agregar un peso negativo a un ingrediente.", e.getMessage());

		}
		assertEquals(299, ingredient.getWeight(), 0.0001);
	}
	
	@Test
	public void testAddWeight2() {
		
		setupStage1();
		
		try {
			ingredient.addWeight(-100);
		}catch(NegativeNumberException e) {
			//e.printStackTrace();
			assertEquals("No fue posible agregar el ingrediente, no se puede agregar un peso negativo a un ingrediente.", e.getMessage());

		}
		assertEquals(245, ingredient.getWeight(), 0.0001);
	}
	
	@Test
	public void testRemove() {
		
		setupStage1();
		
		try {
			ingredient.removeWeight(45);
		}catch(NegativeNumberException e) {
			//e.printStackTrace();
			assertEquals("No fue posible agregar el ingrediente, no se puede agregar un peso negativo a un ingrediente.", e.getMessage());

		}
		assertEquals(200, ingredient.getWeight(), 0.0001);
	}
	
	@Test
	public void testRemove1() {
		
		setupStage1();
		
		try {
			ingredient.removeWeight(-100);
			//fail();
		}catch(NegativeNumberException e) {
			//e.printStackTrace();
			assertEquals("No fue posible agregar el ingrediente, no se puede agregar un peso negativo a un ingrediente.", e.getMessage());
		}
		assertEquals(245, ingredient.getWeight(), 0.0001);
	}
}