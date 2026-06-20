package com.phoneshop.phoneshop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.phoneshop.phoneshop.DTO.BrandDTO;
import com.phoneshop.phoneshop.Service.BrandService;
import com.phoneshop.phoneshop.Service.util.Mapper;
import com.phoneshop.phoneshop.entity.Brand;

@RestControllerAdvice
@RequestMapping("brands")
public class BrandController {
	@Autowired
	BrandService brandService;       //form submit pi frond mk jab dak knong obj dto
	public  ResponseEntity<?> create(@RequestBody BrandDTO brandDTO) {
		Brand brand = Mapper.toBrand(brandDTO);
		brandService.create(brand);
		return ResponseEntity.ok(brand);
	}
}
