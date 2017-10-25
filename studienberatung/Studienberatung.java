package studienberatung;

import java.util.Scanner;

public class Studienberatung {
	
	public void main(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hast du Abitur?");
		
		String answer = scanner.next();

		
		if(answer.equalsIgnoreCase("n")){
			System.out.println("Hast du Fachabitur?");
			answer = scanner.next();
			
		}else if(answer.equalsIgnoreCase("j")){
			System.out.println("Bist du wissbegierig?");
			answer = scanner.next();
			
			if(answer.equalsIgnoreCase("n")){
				
			}
		}
	}
	
}
