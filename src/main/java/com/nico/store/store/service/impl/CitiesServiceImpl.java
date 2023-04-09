package com.nico.store.store.service.impl;

import com.nico.store.store.domain.Cities;
import com.nico.store.store.repository.ArticleRepository;
import com.nico.store.store.repository.CitiesRepository;
import com.nico.store.store.service.CitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CitiesServiceImpl implements CitiesService {

    @Autowired
    private CitiesRepository citiesRepository;
    @Override
    public List<Cities> findAll() {
        return (List<Cities>) citiesRepository.findAll();
    }

    @Override
    public Cities findById(Long aLong) {
        Optional<Cities> opt = citiesRepository.findById(aLong);
        return opt.get();
    }

    @Override
    public List<Cities> findAllByProvinceId(Long aLong) {
        return (List<Cities>) citiesRepository.findAllByProvincesId(aLong);
    }


}
