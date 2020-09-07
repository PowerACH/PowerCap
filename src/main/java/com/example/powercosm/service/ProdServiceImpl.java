package com.example.powercosm.service;


import com.example.powercosm.models.Prod;
import com.example.powercosm.repositories.ProdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdServiceImpl implements ProdService {

    @Autowired
    ProdRepository prodRepository;

    @Override
    public Prod createProd(Prod prod) {
        return prodRepository.save(prod);
    }

    @Override
    public Iterable<Prod> listProd(){
        return prodRepository.findAll();
    }
}
