package com.exercise.Products.repository;

import com.exercise.Products.entities.ProductTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ProductTypeEntityRepository extends JpaRepository<ProductTypeEntity, Long> {

}