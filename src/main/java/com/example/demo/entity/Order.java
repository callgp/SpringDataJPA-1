package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
	@Table(name="ORDERS")
	public class Order {
		
		@Id
		private String id;
		
		private LocalDate orderDate;
		
		private String status;
		   // No-argument constructor
	    public Order() {
	    }

		public Order(String id, LocalDate orderDate, String status) {
			super();
			this.id = id;
			this.orderDate = orderDate;
			this.status = status;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public LocalDate getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(LocalDate orderDate) {
			this.orderDate = orderDate;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
		
		
	}

