package com.example.springboot.service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IService<T> {
	Page<T> findAll(Pageable pageable);
	//Page<T> findAll(Pageable pageable, String searchText);
    T findById(Long id);

	
	

}
