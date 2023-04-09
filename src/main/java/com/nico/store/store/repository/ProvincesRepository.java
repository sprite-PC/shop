package com.nico.store.store.repository;

import com.nico.store.store.domain.Provinces;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

public interface ProvincesRepository extends JpaRepository<Provinces, Long>, JpaSpecificationExecutor<Provinces> {
    @Override
    List<Provinces> findAll();

    @Override
    Optional<Provinces> findById(Long aLong);
}
