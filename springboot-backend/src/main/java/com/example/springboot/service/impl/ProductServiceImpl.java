package com.example.springboot.service.impl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.model.product;
import com.example.springboot.repository.ProductRepository;
import com.example.springboot.service.IService;


//import java.util.Collection;
@Service
public class ProductServiceImpl implements IService<product>  {
	@Autowired
	private ProductRepository productRepository;
    
	/*

	@Override
	public Page<product> findAll(Pageable pageable, String searchText) {
		return productRepository.findAllProducts(pageable, searchText);
	}
	*/

	@Override
	public Page<product> findAll(Pageable pageable) {
		return productRepository.findAll(pageable);
	}

	@Override
	public product findById(Long id) {
		return productRepository.findById(id).get();
	}

}
