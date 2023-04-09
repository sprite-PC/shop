package com.nico.store.store.service;

import com.nico.store.store.domain.Cities;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface CitiesService {
    List<Cities> findAll();

    Cities findById(Long aLong);

    List<Cities> findAllByProvinceId(Long aLong);
}
