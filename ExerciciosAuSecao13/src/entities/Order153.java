package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order153 {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	
	private Date moment;
	private OrderStatus status;
	
	
	
//	ASSOCIACOES
	//Client153 tem 1 na "Cardinalidade"
	private Client153 client;
	//OrderItem tem * (amuitos) na "Cardinalidade"
	private List<OrderItem153> orderItem = new ArrayList<>();
	
//	CONSTRUTORES 
	public Order153() {
	}
	public Order153(Date moment, OrderStatus status, Client153 client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
//	GET e SET
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
//	---------
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
//	---------
	public Client153 getClient() {
		return client;
	}
	public void setClient(Client153 client) {
		this.client = client;
	}
//	---------
	public List<OrderItem153> getOrderItem() {
		return orderItem;
	}
	
//	METODOS
	public void addItem(OrderItem153 item) {
		orderItem.add(item);
	}
	public void removeItem(OrderItem153 item) {
		orderItem.remove(item);
	}
	
	public double total() {
		double sum=0.0;
		for (OrderItem153 oI : orderItem) {
			sum += oI.subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem153 item : orderItem) {
			sb.append("- "+item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
