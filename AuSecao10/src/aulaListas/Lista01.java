package aulaListas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista01 {
	public static void main(String[] args) {
		
		
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Bob");
		list.add("Alex");
		list.add("Ana");
		list.add(2, "Marco");
		
		System.out.println(list.size());  //tamanho da list
				
		
		for (String x : list) {
			System.out.println(x);
		}
		
//		list.remove("Anna");   //remove por "nome"
//		list.remove(1);        //remove por "posição"
		
		
		System.out.println("-----------------------------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------------");
		System.out.println("Index of Bob: "+ list.indexOf("Bob"));
		System.out.println("Index of Bob: "+ list.indexOf("Marco"));
		
		
		
		System.out.println("-----------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		
		System.out.println("-----------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
