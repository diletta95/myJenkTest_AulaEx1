package myJenkTest.tutorial;

import java.util.Scanner;

public class FizzBuzz {
	 public String play(int number) {
		 
		 if(number == 0) {
			 System.out.println(number);
			 throw new IllegalArgumentException("Number must not be 0");		 
		 }
		 if(number%3 ==0) return "Fizz";
		 if(number%5 ==0) return "Buzz";
		 return String.valueOf(number);
	 }
	 
	 

		public String play () {
			Scanner tastiera= new Scanner (System.in);
			System.out.println("Ciao Utonto , inserisci un numero in modo tale da non fare nulla");
			int number= tastiera.nextInt();
			tastiera.close();
			if (number==0) throw new  IllegalArgumentException("Number must not be 0");
			if (number%3==0)
				return "Fizz";
			if (number%5==0)
				return "Buzz";
			return String.valueOf(number);
		}
}
