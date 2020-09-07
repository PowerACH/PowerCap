package com.example.powercosm.service;

import com.example.powercosm.models.Prod;

public interface ProdService {

    public Prod createProd(Prod prod);

    public Iterable<Prod> listProd();
}
