package com.generics;

public class ComputeMax {

public <T extends Comparable <T>> T max(T n1, T n2, T n3) {
	     
	
	    T max;
		
		if((n1.compareTo(n2)>0) && (n1.compareTo(n3)>0))
		{
			max=n1;
			System.out.println(n1+ " is maximum");
		}
		else if((n2.compareTo(n1)>0) && (n2.compareTo(n3)>0))
		{
			max=n2;
			System.out.println(n2+ " is maximum");
		}
		else
		{
			max=n3;
			System.out.println(n3 + " is maximum");
		}	
		return max;
	}
	


	public static void main(String[] args) {
		ComputeMax m = new ComputeMax();
		m.max(3,8,1);
		m.max(3.5F,6.4F,4.2F);
		m.max("Me", "Mine", "Myself");
		
	}
}
