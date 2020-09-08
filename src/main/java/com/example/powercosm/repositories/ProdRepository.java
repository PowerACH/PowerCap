package com.example.powercosm.repositories;

import com.example.powercosm.models.Prod;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProdRepository extends CrudRepository<Prod, Long> {

    @Query("FROM Prod p WHERE p.prodName = ?1")
    public Prod findByName(String prodName);
}
