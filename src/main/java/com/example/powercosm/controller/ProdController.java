package com.example.powercosm.controller;

import com.example.powercosm.models.Prod;
import com.example.powercosm.service.ProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProdController {

    @Autowired
    private ProdService prodService;

    @GetMapping
    public Iterable<Prod> listprod() {
        return prodService.listProd();
    }

    @PostMapping
    public Prod createProd(@RequestBody Prod prod) {
        return prodService.createProd(prod);
    }

}
