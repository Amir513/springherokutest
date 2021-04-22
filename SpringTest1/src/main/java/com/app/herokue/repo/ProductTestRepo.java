package com.app.herokue.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.herokue.model.ProductTest;

public interface ProductTestRepo extends JpaRepository<ProductTest, Integer> {
	 ProductTest findByName(String name);
}
