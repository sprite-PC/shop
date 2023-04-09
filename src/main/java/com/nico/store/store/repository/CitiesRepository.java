package com.nico.store.store.repository;

import com.nico.store.store.domain.Article;
import com.nico.store.store.domain.Cities;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


public interface CitiesRepository extends JpaRepository<Cities, Long>, JpaSpecificationExecutor<Cities> {

    @Override
    List<Cities> findAll();

    @Override
    Optional<Cities> findById(Long aLong);

    List<Cities> findAllByProvincesId(Long aLong);
}
