package com.example.powercosm.service;

import com.example.powercosm.models.Prod;

public interface ProdService {

    public Prod createProd(Prod newProd);

    public Iterable<Prod> listProd();

    public Prod getProduct(String prodName);
}
