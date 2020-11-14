package com.example.springboot.repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.springboot.model.product;



@Repository
public interface ProductRepository extends PagingAndSortingRepository<product , Long>{
/*
	@Query("FROM prod1 b WHERE b.title LIKE %:searchText% ORDER BY b.price ASC")
    Page<product> findAllProducts(Pageable pageable, @Param("searchText") String searchText);
*/
	}
