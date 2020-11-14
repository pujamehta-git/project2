package com.example.springboot.resource.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springboot.model.product;
import com.example.springboot.resource.Resource;
import com.example.springboot.service.IService;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import java.util.Collection;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins="http://localhost:3000")
public class productResourceImpl implements Resource<product>{

	@Autowired
	private IService<product> productService;
/*
	@Override
	public ResponseEntity<Page<product>> findAll(Pageable pageable, String searchText) {
		return new ResponseEntity<>(productService.findAll(pageable, searchText), HttpStatus.OK);
	}
	*/
	@Override
	public ResponseEntity<Page<product>> findAll(int pageNumber, int pageSize, String sortBy, String sortDir) {
		return new ResponseEntity<>(productService.findAll(
				PageRequest.of(
						pageNumber, pageSize,
						sortDir.equalsIgnoreCase("asc") ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending()
				)
		), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<product> findById(Long id) {
		return new ResponseEntity<>(productService.findById(id), HttpStatus.OK);
	}
/*
	@Override
	public ResponseEntity<product> save(product product) {
		return new ResponseEntity<>(productService.saveOrUpdate(product), HttpStatus.CREATED);
	}
*/
}
