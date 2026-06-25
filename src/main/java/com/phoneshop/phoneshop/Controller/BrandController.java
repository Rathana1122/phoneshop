package com.phoneshop.phoneshop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phoneshop.phoneshop.DTO.BrandDTO;
import com.phoneshop.phoneshop.Service.BrandService;
import com.phoneshop.phoneshop.Service.util.Mapper;
import com.phoneshop.phoneshop.entity.Brand;
@RestController
@RequestMapping("brands")
public class BrandController {
	@Autowired
	BrandService brandService;       //form submit pi frond mk jab dak knong obj dto
	@PostMapping
	public  ResponseEntity<?> create(@RequestBody BrandDTO brandDTO) {
		Brand brand = Mapper.toBrand(brandDTO);
		brandService.create(brand);
		return ResponseEntity.ok(brand);
	}
	@GetMapping("{id}")
	public  ResponseEntity<?> getOneBrand(@PathVariable("id") Integer brandId){
		Brand brand = brandService.getById(brandId);
		return ResponseEntity.ok(brand);
	}
	
	@PutMapping("{id}")
	public  ResponseEntity<?> update(@PathVariable("id") Integer brandId,@RequestBody BrandDTO brandDTO){
		Brand brand = Mapper.toBrand(brandDTO);
		Brand updatetBrand = brandService.update(brandId, brand);
		return ResponseEntity.ok(Mapper.toBrandDTO(updatetBrand));
	}
}
