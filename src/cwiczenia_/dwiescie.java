
package cwiczenia_;

import java.util.Random;
import java.util.Scanner;

public class dwiescie {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 Random random = new Random();
		 int randomNumber = random.nextInt(200);
		 
		  System.out.println("wylosowamo: " + randomNumber);
		  
		 while(true) {
		 
		 System.out.println("zgadnij liczbe od 1 do 200: ");
		 int liczba = scanner.nextInt();
		 
		 if (liczba < randomNumber) {
			 
			 System.out.println("Liczba za mala!");
		 } else if (liczba > randomNumber) {
			 
			 System.out.println("Liczba za duza!");
		 } else {
			 
			 System.out.println("Gratulacje!! liczba to " + randomNumber);
			 break;
		 }
		 
		 
		 }
		 
		 scanner.close();
	}

}

