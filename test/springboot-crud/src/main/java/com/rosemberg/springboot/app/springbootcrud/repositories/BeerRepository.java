package com.rosemberg.springboot.app.springbootcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rosemberg.springboot.app.springbootcrud.models.Beer;


@Repository
public interface BeerRepository extends JpaRepository <Beer, Long> {
}
