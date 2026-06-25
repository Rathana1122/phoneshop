package com.phoneshop.phoneshop.Service.impl;

import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.phoneshop.phoneshop.Service.BrandService;
import com.phoneshop.phoneshop.entity.Brand;
import com.phoneshop.phoneshop.exception.ApiException;
import com.phoneshop.phoneshop.exception.ResoureNotFoundException;
import com.phoneshop.phoneshop.repository.BrandRepository;
@Service
public class BrandServiceimpl implements BrandService{
	@Autowired
	BrandRepository brandRepository;
	@Override
	public Brand create(Brand brand) {
		
		return brandRepository.save(brand);
	}
	@Override
	public Brand getById(Integer id) {
        return brandRepository.findById(id)
        		//.orElseThrow(()->new HttpClientErrorException(HttpStatus.NOT_FOUND,String.format("Brand with id=%id not found",id)));
        		.orElseThrow(()->new ResoureNotFoundException("Brand",id));
	}
	@Override
	public Brand update(Integer id,Brand brandUpdate) {
		Brand brand = getById(id);
		brand.setName(brandUpdate.getName());
		return brandRepository.save(brand);
	}
}