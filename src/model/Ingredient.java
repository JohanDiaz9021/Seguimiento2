package model;

import java.util.ArrayList;
import java.util.List;

import Test.IngredientTest;
import exception.NegativeNumberException;

public class  Ingredient {
	private String name;
	private double weight;
	
	//Relation
	
	private IngredientTest ing;
	
	public Ingredient(String n, double w)  {
		name = n;
		weight = w;
	}
	
	public void addWeight(double additionalW) throws NegativeNumberException {	
		
		
		if(additionalW<0) {
			throw new NegativeNumberException();
			
		}else {
			weight = weight + additionalW;

		}
	}
	
	public void removeWeight(double inputWeight) throws NegativeNumberException{
		
		
		if(inputWeight < 0) {
				throw new NegativeNumberException();
		}

		weight = weight - inputWeight;

		
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
}