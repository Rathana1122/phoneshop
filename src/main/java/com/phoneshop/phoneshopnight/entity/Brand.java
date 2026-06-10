package com.phoneshop.phoneshopnight.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;



@Data//auto get ser
@Entity

public class Brand {
	    @Id
		private Integer id;
		String name;
		
}
