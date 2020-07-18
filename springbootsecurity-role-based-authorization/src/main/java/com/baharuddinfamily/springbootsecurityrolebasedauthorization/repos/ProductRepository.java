package com.baharuddinfamily.springbootsecurityrolebasedauthorization.repos;


import org.springframework.data.jpa.repository.JpaRepository;

import com.baharuddinfamily.springbootsecurityrolebasedauthorization.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
