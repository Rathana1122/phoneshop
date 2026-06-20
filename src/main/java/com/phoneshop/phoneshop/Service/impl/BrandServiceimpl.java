package com.phoneshop.phoneshop.Service.impl;

import org.springframework.stereotype.Service;

import com.phoneshop.phoneshop.Service.BrandService;
import com.phoneshop.phoneshop.entity.Brand;
import com.phoneshop.phoneshop.repository.BrandRepository;
@Service
public class BrandServiceimpl implements BrandService{
	BrandRepository brandRepository;
	@Override
	public Brand create(Brand brand) {
		
		return brandRepository.save(brand);
	}

}
