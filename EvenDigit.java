package com.example.demo.competitveprogram;

import java.util.Scanner;

public class EvenDigit {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int changeNUmberCount=0;
		int ar[]=new int[n];
		for (int i = 0; i < n; i++) {
			ar[i]=sc.nextInt();
		}
		
		
		for (int i = 0; i < n; i++) {

			
			
		
				changeNUmberCount=checkNumber(ar[i]);
				System.out.println("changeNUmberCount ---->"+changeNUmberCount);
				System.out.println("Case #"+(i+1)+" "+ Math. abs((ar[i]-changeNUmberCount)));

	
		}
		
		
		 
	}
	public static boolean checkAllEvenNumber(int num) {
		//System.out.println("num-->"+num);
		boolean check=true;				
		int r=0;
		while(check) {
			r=num%10;
			if(r%2!=0) {
				return false;
			}
			
			if((num=num/10)==0) {
				check=false;
			}
		}
		
		return true;
	}
	public static int checkNumber(int num) {
		
		boolean foundNumber=true;
		int foundI=0;
		int foundJ=0;
		
		int i=num;
		int j=num;
		
				
		 long start = System.currentTimeMillis();
	        long end = start + 10*1000;
	       
		while(foundNumber && System.currentTimeMillis() < end) {
				
			 if(checkAllEvenNumber(i)) {
				  
				  foundNumber=false; foundI=i;	  
			  break;
			  }
			 if(checkAllEvenNumber(j)) { foundNumber=false; foundJ=j;
			  break;
			  }
			 i++;
				j--;
		}
		
		
		
	
			return foundI>foundJ?foundI: foundJ;
		}
		
	

}
