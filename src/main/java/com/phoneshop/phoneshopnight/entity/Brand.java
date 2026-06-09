package com.phoneshop.phoneshopnight.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data//auto get ser
@Entity
public class Brand {
		private Integer id;
		String name;
		
}
