package com.nico.store.store.service;

import com.nico.store.store.domain.Cities;
import com.nico.store.store.domain.Provinces;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface ProvincesService {
    List<Provinces> findAll();

    Provinces findById(Long aLong);



}
