package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment152;
import entities.Post152;

public class ExAula152 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		Comment152 c1 = new Comment152("Have a nice trip!");
		Comment152 c2 = new Comment152("Wow that's awesome");
		Post152 p1 = new Post152(sdf.parse("21/06/2018 13:05:44"),
								"Traveling to New Zealand", 
								"I'm going to visit this wonderful country!", 
								12); 	
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment152 c3 = new Comment152("Good night");
		Comment152 c4 = new Comment152("May the Force be with you");
		Post152 p2 = new Post152(sdf.parse("28/07/2018 23:14:19"),
								"Good night guys", 
								"See you tomorrow", 
								5);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println("--------------------------------------------\n");
		System.out.println(p2);
		
		
	}
}
