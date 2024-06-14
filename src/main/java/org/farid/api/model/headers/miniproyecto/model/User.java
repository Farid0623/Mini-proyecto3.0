package org.farid.api.model.headers.miniproyecto.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "usuarios")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String username;
	private String email;
	private String addres;
	private String telephone;
	private String type;
	private String password;
	
	@OneToMany(mappedBy = "user")
	private List<Product> products;


	@OneToMany(mappedBy = "user")
	private List<Order> orders;
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email
				+ ", addres=" + addres + ", telephone=" + telephone + ", type=" + type + ", password=" + password
				+ "]";
	}

}
