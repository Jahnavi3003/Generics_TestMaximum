package com.generics;

	public class ComputeMax <T extends Comparable<T>> {
		
	   T n1, n2, n3;
	   
	public ComputeMax(T n1, T n2, T n3) {
	    	this.n1=n1;
	    	this.n2=n2;
	    	this.n3=n3;
	    }


public static <T extends Comparable <T>> T max(T n1, T n2, T n3) {
	
	    T max;
		
		if((n1.compareTo(n2)>0) && (n1.compareTo(n3)>0))
		{
			max=n1;
			System.out.println(n1 + " is maximum");
		}
		else if((n2.compareTo(n1)>0) && (n2.compareTo(n3)>0))
		{
			max=n2;
			System.out.println(n2 + " is maximum");
		}
		else
		{
			max=n3;
			System.out.println(n3 + " is maximum");
		}	
		return max;
	}
	

	public static void main(String[] args) {
		
//    	ComputeMax m = new ComputeMax();
		ComputeMax.max(3,8,1);
		ComputeMax.max(3.5F,6.4F,4.2F);
		ComputeMax.max("Me", "Mine", "Myself");
		
	}
}

	