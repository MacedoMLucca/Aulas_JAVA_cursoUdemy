package exercise;

import java.util.Locale;
import java.util.Scanner;

import entities.Ve6_room;


public class Ve6_pensionato {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] num_room = new String[10];

		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		int room = 0;
		Ve6_room[] cliente = new Ve6_room[n];
		
		

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Rent #"+(i+1));
			
			System.out.print("Nome: ");
			String nome = sc.next();
			
			System.out.print("email: ");
			String email = sc.next();
				while (hasId(email)) {
					System.out.print("Id already taken. Try again: ");
					email = sc.next();
				}
			
			System.out.print("room: ");
			room = sc.nextInt();
			cliente[i] = new Ve6_room(nome,email,room);
			
			num_room[room]= cliente[i].getRoom() + ": "+cliente[i].getNome() + ", "+cliente[i].getEmail() ;

//			sem usar classe
//			num_room[room]= room+": "+nome + ", "+email ;
		
		
		}
		
		
		System.out.println("Busy rooms");
		for (int i = 0; i < num_room.length; i++) {
			if (num_room[i] != null) {
				System.out.println(num_room[i]);
			}
		}
		
		
		
		
		
		sc.close();
	}
	
	public static boolean hasId(String email) {
		if (email.indexOf("@") == -1) {
			return email != null;
		} else {
			return false;
	}
		
	}
	
	
	

}
