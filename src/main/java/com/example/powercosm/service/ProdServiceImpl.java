package com.example.powercosm.service;


import com.example.powercosm.models.Prod;
import com.example.powercosm.models.User;
import com.example.powercosm.repositories.ProdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdServiceImpl implements ProdService {

    @Autowired
    ProdRepository prodRepository;

    @Override
    public Prod createProd(Prod newProd) {
        return prodRepository.save(newProd);
    }

    @Override
    public Iterable<Prod> listProd(){
        return prodRepository.findAll();
    }

    @Override
    public Prod getProduct(String prodName) {
        return prodRepository.findByName(prodName);
    }
}
