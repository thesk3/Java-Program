package com.example.demo;

import java.util.Arrays;

public class TopCoder {

	public static void main(String[] args) {
  
  //this is hardcode string you can place here usere input
		 String s="w-b-b--bb-";
	
		 char []cr=s.toCharArray();
		 System.out.println("chararr->"+s);
		 int l=cr.length;
		 for (int i = 0; i < cr.length; i++) {
			if(cr[i]=='-') {
				System.out.println("emty");
				
			}
			
			
			if(i+1<cr.length) {
				if((cr[i]=='w')&&(cr[i+1]=='-')) {
					cr[i+1]=cr[i];
					cr[i]='-';
					
				}
			}
			if(i+2<cr.length) {
				if((cr[i]=='w')&&(cr[i+1]=='b')&&(cr[i+2]=='-')) {
					cr[i+2]=cr[i];
					cr[i]='-';
					
				}
			}
			

		}		 
		 String s2=String.valueOf(cr);
		 System.out.println("chararr->"+s2);
	}

}
