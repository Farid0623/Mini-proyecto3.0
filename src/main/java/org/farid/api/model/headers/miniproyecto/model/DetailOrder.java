package org.farid.api.model.headers.miniproyecto.model;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "detalles")
public class DetailOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private double quantity;
	private double price;
	private double total;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

	@Override
	public String toString() {
		return "DetailOrder [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price
				+ ", total=" + total + "]";
	}

}
