package Test;

import junit.framework.TestCase;
import model.Ingredient;
import model.Recipe;
import static org.junit.Assert.*;
import org.junit.Test;

import exception.NegativeNumberException;

public class RecipeTest extends TestCase {
	
	private Recipe recip;
	private Ingredient ingredin;
	
	private void setupStage1() {
		
		recip = new Recipe();
		
	}
	
	private void setupStage2() throws NegativeNumberException{
		
		recip = new Recipe();
		
		recip.addIngredient("Cebolla", 315);
		recip.addIngredient("Ajo", 58);
		recip.addIngredient("Arroz", 520);
	}
	
	@Test
	public void testAddIngredient() throws NegativeNumberException {
		
		setupStage1();	
		
		recip.addIngredient("Sal", 12);
		
		assertNotNull(recip);
		assertEquals(1, recip.getIngredients().size());
		assertEquals("Sal", recip.getIngredients().get(0).getName());
		assertTrue(12 == recip.getIngredients().get(0).getWeight());
		
	}
	
	@Test
	public void testAddIngredient1() throws NegativeNumberException {
		
		setupStage2();
		
		recip.addIngredient("Pimienta", 6);
		
		int index = recip.getIngredients().size()-1;
		
		assertNotNull(recip);
		assertEquals(4, recip.getIngredients().size());
		assertEquals("Pimienta", recip.getIngredients().get(index).getName());
		assertTrue(6 == recip.getIngredients().get(index).getWeight());
	}
	
	@Test
	public void testAddIngredient3() throws NegativeNumberException{
		
		setupStage2();
		
		recip.addIngredient("Ajo", 21);
		
		assertNotNull(recip);
		assertEquals(3, recip.getIngredients().size());
		assertEquals("Ajo", recip.getIngredients().get(1).getName());
		assertTrue(79 == recip.getIngredients().get(1).getWeight());
	}
	
	@Test
	
	public void testAddIngregient4() throws NegativeNumberException {
		
		setupStage2();
		
		recip.removeIngredient("Ajo");
		
		assertNotNull(recip);
		assertTrue(recip.getIngredients().size() == 2);
		assertEquals("Cebolla",recip.getIngredients().get(0).getName());
		assertEquals("Arroz", recip.getIngredients().get(1).getName());
		
	}
	
}