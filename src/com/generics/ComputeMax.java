package com.generics;

public class ComputeMax {

public  void intMax(Integer n1, Integer n2, Integer n3) {
		
		if((n1.compareTo(n2)>0) && (n1.compareTo(n3)>0))
		{
			System.out.println(n1 + " is maximum");
		}
		else if((n2.compareTo(n1)>0) && (n2.compareTo(n3)>0))
		{
			System.out.println(n2 + " is maximum");
		}
		else
		{
			System.out.println(n3 + " is maximum");
		}	
	}
	
	public static void main(String[] args) {
		ComputeMax max = new ComputeMax();
		max.intMax(3,8,1);
	}
}
