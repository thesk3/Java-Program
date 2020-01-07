/*Problem
It is a well known fact that a number is divisible by 11 if and only if the alternating sum of its digits is equal to 0 modulo 11. For example, 8174958 is a multiple of 11, since 8 - 1 + 7 - 4 + 9 - 5 + 8 = 22.

Given a number that consists of digits from 1-9, can you rearrange the digits to create a number that is divisible by 11?

Since the number might be quite large, you are given integers A1, A2, ..., A9. There are Ai digits i in the number, for all i.

Input
The first line of the input gives the number of test cases, T. T lines follow. Each line contains the nine integers A1, A2, ..., A9.

Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is YES if the digits can be rearranged to create a multiple of 11, and NO otherwise.

Limits
Time limit: 20 seconds per test set.
Memory limit: 1GB.
1 ≤ T ≤ 100.
1 ≤ A1 + A2 + ... + A9.

Test set 1 (Visible)
0 ≤ Ai ≤ 20, for all i.

Test set 2 (Hidden)
0 ≤ Ai ≤ 109, for all i.

Sample

Input
 	
Output
 
6
0 0 2 0 0 1 0 0 0
0 0 0 0 0 0 0 0 12
0 0 0 0 2 0 1 1 0
3 1 1 1 0 0 0 0 0
3 0 0 0 0 0 3 0 2
0 0 0 0 0 0 0 1 0

  
Case #1: YES
Case #2: YES
Case #3: NO
Case #4: YES
Case #5: YES
Case #6: NO
  
In Sample Case #1, the digits are 336, which can be rearranged to 363. This is a multiple of 11 since 3 - 6 + 3 = 0.
In Sample Case #2, the digits are 999999999999, which is already a multiple of 11, since 9 - 9 + 9 - 9 + ... - 9 = 0.
In Sample Case #3, the digits are 5578, which cannot be rearranged to form a multiple of 11.
In Sample Case #4, the digits are 111234, which can be rearranged to 142131. This is a multiple of 11 since 1 - 4 + 2 - 1 + 3 - 1 = 0.
In Sample Case #5, the digits are 11177799, which can be rearranged to 19191777. This is a multiple of 11 since 1 - 9 + 1 - 9 + 1 - 7 + 7 - 7 = -22 (which is 0 modulo 11).
In Sample Case #6, the only digit is 8, which cannot be rearranged to form a multiple of 11.
*/
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
