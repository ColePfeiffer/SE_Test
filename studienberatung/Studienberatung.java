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
			
			if(answer.equalsIgnoreCase("n")){
				System.out.println("Hast du eine Berufsausbildung?");
				answer = scanner.next();
					
				if(answer.equalsIgnoreCase("n")){
					System.out.println("Besser noch studieren.");
				}else{
					System.out.println("Du kannst ja später noch studieren.");
				}
				
			}else{
				System.out.println("Nicht studieren.");
			}
			
		}else{
			System.out.println("Bist du wissbegierig?");
			answer = scanner.next();
			
			if(answer.equalsIgnoreCase("n")){
				System.out.println("Nicht studieren.");
			}else{
				System.out.println("Auf jeden Fall studieren.");
			}
		}
	}
	
}
