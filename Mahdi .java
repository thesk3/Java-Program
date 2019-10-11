package com.example.demo;
/*
Problem Statement
    	
Mahdi is learning the game Dooz by observing Mojtaba who's playing it.

The game is played on a 1 times n board. Mojtaba has several marbles: exactly one white marble (denoted 'W'), and zero or more black ones (denoted 'B'). At the beginning of the game, the white marble is placed onto the leftmost cell of the board, and the black marbles are placed onto other cells, one per cell. Some cells may remain empty (denoted '-').

Mojtaba then moves the white marble. In each move he can do one of two things:

If the cell immediately to the right of the white marble is empty, Mojtaba moves the white marble one cell to the right.
If the cell immediately to the right of the white marble contains a black marble and the next cell after that is empty, Mojtaba jumps the white marble over the black marble, which moves the white marble two cells to the right.
Given the initial state of the game, print the final state of the game.

 
Definition
    	
Class:	MojtabaMahdiDooz
Method:	play
Parameters:	String
Returns:	String
Method signature:	String play(String board)
(be sure your method is public)
    
 
Constraints
-	Length of board will be between 1 and 50, inclusive.
-	Character 0 of board will be 'W'.
-	Each other character of board will be '-' or 'B'.
 
Examples
0)	
    	
"W----"
Returns: "----W"
As there are no obstacles, Mojtaba can move the white marble all the way to the right.
1)	
    	
"WB-B-B-"
Returns: "-B-B-BW"
On this board Mojtaba will make three moves of the second type (jumps over a single black marble).
2)	
    	
"W--BB---"
Returns: "--WBB---"
We cannot jump over more than one black marble, so the best we can do is to move the white marble two steps to the right.
3)	
    	
"W"
Returns: "W"
4)	
    	
"W-B--B---BB-"
Returns: "--B--B--WBB-"
This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
*/
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
