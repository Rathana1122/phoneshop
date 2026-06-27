package com.phoneshop.phoneshop.mapper;

import org.mapstruct.Mapper;

import com.phoneshop.phoneshop.DTO.BrandDTO;
import com.phoneshop.phoneshop.entity.Brand;

@Mapper
public interface BrandMapper {
	Brand toBrand(BrandDTO dto);
		
	
}
