package org.farid.api.model.headers.miniproyecto.model;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String description;
	private String image;
	private double price;
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", image=" + image
				+ ", price=" + price + ", quantity=" + quantity + "]";
	}


}
