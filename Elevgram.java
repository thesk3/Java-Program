package com.example.demo.competitveprogram;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Random;


public class Elevgram {
	

	
	static int[] iarr=new int[1000000000];
	
	static int mr[][];
	static int number[]=new int[1000000000];
	public static void main(String[] args) throws IOException {
		

		int[][] a=getData();
		for (int i = 0; i < a.length; i++) {
			int temp[]=new int[1000000000];
			for (int j = 0; j < temp.length; j++) {
				temp[j]=a[i][j];
			}
			int temp1[]=new int[1000000000];	
			temp1=foundNumber(temp);
		
			
			boolean b=isElevengram(temp1);
				 System.out.println("Case #"+(i+1)+": "+(!b?"YES":"NO"));
		}
		
		
	}
	
	private static boolean isElevengram(int[] temp1) {
		
		boolean isFound=true;
		int rmax=temp1.length;
		int sum1=1000000000;
		for (int i = 0; i < temp1.length; i++) {
			if (temp1[i]==0) {
				rmax=i;
				break;
			}
				
		}
		
		Random rgen = new Random();
		
		int[] newA=new int[rmax];

        for (int i=0; i<rmax; i++) 
        	newA[i] = temp1[i];
        long start = System.currentTimeMillis();
        long end = start + 10*1000;
        while(isFound && System.currentTimeMillis() < end) {
        	
		  int number1=0; 
		//--- Shuffle by exchanging each element randomly
		  for (int i=0; i<newA.length; i++) {
		      int randomPosition = rgen.nextInt(newA.length);
		      int temp = newA[i];
		      newA[i] = newA[randomPosition];
		      newA[randomPosition] = temp;
		  }
			 String s="";
			for (int i = 0; i < newA.length; i++) {
				s+=newA[i];
			}
			double sd=Double.parseDouble(s);
			if(sd<11) {
				break;
			}
	
			if(sd % 11 == 0) {
			
				return false;
			}
		
        }
		
		return isFound;
	}

	private static int[] foundNumber(int[] temp) {
		int temp1[]=new int[1000000000];
		for (int i = 0,j=0; i < temp.length; i++) {
			if(temp[i]!=0) {
				for (int j2 = 0; j2 < temp[i]; j2++) {
			
					temp1[j]=i+1;
					j++;
				}
				
			}
			
		}
		return temp1;
	}

	public static int[][] getData() throws IOException {

		//Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		  int n = Integer.parseInt(br.readLine());
		int[][] player = new int[n][1000000000];
		

	
		
			for (int i = 0; i < n; i++) {
				String str=br.readLine();
				String arr[]=str.split(" ");
				int n1[]=new int[arr.length];
				for (int i1 = 0; i1 < arr.length; i1++) {
					n1[i1]=Integer.parseInt(arr[i1]);
					player[i][i1]=n1[i1];
					}
					
			}
		
		return player;
	}


	

}
