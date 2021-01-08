package program;

import java.util.Scanner;
import java.util.Arrays;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String[][] names = new String[5][3];
		
		//WRITE "NAME" AND POSITION IN ALL FIRST 0 POSITIONS OF ARRAY
		for (int i = 0; i < names.length; i++) 
		{
			names[i][0] = String.format("NOME [%d]: ", i + 1);
		}
		
		//WRITE NAME
		for (int i = 0; i < names.length; i++) 
		{	
			System.out.print("ENTER FIRST NAME: ");
			names[i][1] = input.nextLine().toUpperCase();			
		}
		
		System.out.println();
		
		//WRITE MIDDLE NAME
		for (int i = 0; i < names.length; i++) 
		{
			System.out.printf("ENTER MIDDLE NAME TO [%s]: ", names[i][1]);
			names[i][2] = input.nextLine().toUpperCase();							
		}

		System.out.println();
		
		//PRINTING ON THE SCREEM
		for (int i = 0; i < names.length; i++) 
		{
			System.out.printf("%s %s %s %n", names[i][0], names[i][1], names[i][2]);
		}
			
		System.out.println();
		
		//PRINTING THE ADRESS
		for(String[] name: names)
		{
			System.out.println(name);
		}
		
		System.out.println();
		
		for(String[] name: names)
		{
			System.out.println(Arrays.toString(name));
		}
		
		System.out.println();
		System.out.printf("\nTHE LAST WAY%n%n");
		
		//WITH .LENGHT MORE INTELIGENT 
		for (int i = 0; i < names.length; i++) 
		{
			for (int j = 0; j < names[i].length; j++) 
			{
				System.out.println(names[i][j]);
			}
		}
		
		input.close();
	}
}
