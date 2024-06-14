package org.farid.api.model.headers.miniproyecto.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String number;
	private Date createDate;
	private Date receiveDate;

	private double total;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToMany(mappedBy = "order")
	private List<DetailOrder> detail;

	@Override
	public String toString() {
		return "Order [id=" + id + ", number=" + number + ", createDate=" + createDate + ", receiveDate="
				+ receiveDate + ", total=" + total + "]";
	}


}
