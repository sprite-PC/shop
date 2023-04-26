package com.nico.store.store.service.impl;

import com.nico.store.store.domain.Cities;
import com.nico.store.store.domain.Provinces;
import com.nico.store.store.repository.ArticleRepository;
import com.nico.store.store.repository.ProvincesRepository;
import com.nico.store.store.service.ProvincesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProvincesServiceImpl implements ProvincesService {

    @Autowired
    private ProvincesRepository provincesRepository;
    @Override
    public List<Provinces> findAll() {
        return (List<Provinces>) provincesRepository.findAll();
    }

    @Override
    public Provinces findById(Long aLong) {
        return null;
    }

}
