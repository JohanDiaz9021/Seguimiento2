package model;

import java.util.ArrayList;
import java.util.List;
import exception.NegativeNumberException;

public  class Recipe {
	
	private List<Ingredient> ingredients;
	public Recipe() {
		ingredients = new ArrayList<Ingredient>();
	}
	
	public void addIngredient(String n, double w) throws NegativeNumberException{
		
		Ingredient searched = null;
		for (int i = 0; i < ingredients.size() && searched==null; i++) {
			Ingredient current = ingredients.get(i);
			if(current.getName().equalsIgnoreCase(n)) {
				searched = current;
			}
		}
		
		if(searched!=null) {
			searched.addWeight(w);
		}else {
			Ingredient newIngredient = new Ingredient(n, w);
			ingredients.add(newIngredient);
		}		
	}
	
	public void removeIngredient(String n) {
		boolean rum = false;
		Ingredient serch = null;
		for(int i = 0; i < ingredients.size() && !rum;i++) {
			
			Ingredient curren = ingredients.get(i);
			if(curren.getName().equalsIgnoreCase(n)) {
				
				ingredients.remove(i);
			}
			else {
				System.out.println("No se encuentra este ingrediente en la lista");
			}
		}
	}
	
	public List<Ingredient> getIngredients(){
		return ingredients;
	}
}