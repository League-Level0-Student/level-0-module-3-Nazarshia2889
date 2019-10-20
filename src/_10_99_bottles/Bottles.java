package _10_99_bottles;

import javax.swing.JOptionPane;

public class Bottles {
	public static void main(String[] args) {
		
		int x = 99;
		
		for(int i = 0;i<99;i++) {
			System.out.println(x + " bottles of beer on the wall, " + x + " bottles of beer.");
			x = x - 1;
			System.out.println("Take one down and pass it around, "+ x + " bottles of beer on the wall.");
			
		}
		
		System.out.println("No more bottles of beer on the wall, no more bottles of beer. \n" + 
				"Go to the store and buy some more, 99 bottles of beer on the wall.");
	}

}
