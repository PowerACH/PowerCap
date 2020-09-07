package com.example.powercosm.models;


//This class will contain the cust id, prod id, and date.

import javax.persistence.*;

@Entity
public class Item {

    @Id
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;




}
