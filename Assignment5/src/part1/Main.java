package part1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int exit = 1;
		HashTable t = new HashTable();
		while(exit == 1){
			System.out.println("Select a function you want to do:");
			System.out.println("1. check element in the table.");
			System.out.println("2. insert a element in the table.");
			Scanner s = new Scanner(System.in);
			int number = s.nextInt();
			
			if(number == 1){
				System.out.println("Please enter a symbol you want to check in the table: ");
				Scanner s1 = new Scanner(System.in);
				String symbol = s1.nextLine();
				if(t.tableIsEmpty()){
					System.out.println("The table is empty.");
				}else{
					String result = t.tableRetrieve(symbol.charAt(0), symbol);
					if(result == null){
						System.out.println("Symbol does not exist.");
					}else{
						System.out.println("Yeah, we found the symbol! :)");
					}
				}
			}
			
			if(number == 2){
				System.out.println("Please enter a symbol you want to insert in the table: ");
				Scanner s2 = new Scanner(System.in);
				String symbol1 = s2.nextLine();
				t.tableInsert(symbol1.charAt(0), symbol1);
			}
			
			System.out.println("If you want to perform any other function please enter 1, otherwise you will exit the program ");
			Scanner s3 = new Scanner(System.in);
			exit = s3.nextInt();
		}
	}
}