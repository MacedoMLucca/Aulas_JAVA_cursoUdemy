package dt_instanciacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Now_instance {
	
	public static void main(String[] args) {
		
//		Formataçoes de hora
//		https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
				
//		Data local
		LocalDate d01 = LocalDate.now();
//		Data e hora local
		LocalDateTime d02 = LocalDateTime.now();
//		Data e hora seguindo o GMT 
		Instant d03 = Instant.now();
		
//		Transformando a texto em data
		LocalDate d04 = LocalDate.parse("2022-07-08");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-08T01:30:26");
		Instant d06 = Instant.parse("2022-07-08T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-08T01:30:26-03:00");
		
//		texto de data customizada
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
//	
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		
		System.out.println("d01 = "+d01);
		System.out.println("d02 = "+d02);
		System.out.println("d03 = "+d03);
		System.out.println("d04 = "+d04);
		System.out.println("d05 = "+d05);
		System.out.println("d06 = "+d06);
		System.out.println("d07 = "+d07);
		System.out.println("d08 = "+d08);
		System.out.println("d09 = "+d09);
		System.out.println("d10 = "+d10);
		System.out.println("d11 = "+d11);
	}
}
