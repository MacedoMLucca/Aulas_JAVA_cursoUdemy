package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post152 {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
//	ASSOCIAÇAO    
	//=== PARA MUITOS ===	
	private List<Comment152> comments = new ArrayList<>();
	
	

//	CONSTRUTORES
	public Post152() {
	}
	public Post152(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

//	GET e SET
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
//	----------
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
//	----------	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
//	----------
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
//	----------
	public List<Comment152> getComments() {
		return comments;
	}

//	METODOS
	public void addComment(Comment152 comment) {
		comments.add(comment);
	}
	public void removeComment(Comment152 comment) {
		comments.remove(comment);
	}

	@Override
	public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(title + "\n");
			sb.append(likes);
			sb.append(" LIkes - ");
			sb.append(sdf.format(moment)+"\n");
			sb.append(content + "\n");
			sb.append("Comments: \n");
			for (Comment152 c : comments) {
				sb.append(c.getText()+"\n");
			}
			return sb.toString();
		
		
		
		
		
				
		
		
		
		
		
		
		
		
	}
}

























