/*
 * Bill Nicholson////*****Noah Wein
 * nicholdw@ucmail.uc.edu////*****weinnt@mail.uc.edu											
 * Printing pyramids using loops. It kind-of works.////***** 
 * What I really want is////*****
		1
       222
      33333
     4444444
    555555555 
*/
package main;

public class Main {

	public static void main(String[] args) {
		/*int lines = 5, rows = 1;
		 
		for (int i=0; i<=lines; i++)System.out.print(" "+rows);for (int j=1; j<rows; j++){System.out.print(rows);}System.out.println("");rows++;}*/
		int lines = 5;
		for (int i = 1; i <= lines; i++) {
			for (int j = lines+4; j>i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print(i + "");
			}
			for (int k = i; k >=2; k--) {
				System.out.print(i+ "");
			}
			System.out.println();
			}
			
			}}
			
		
			
		

	
	

