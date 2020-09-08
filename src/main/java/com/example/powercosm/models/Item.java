package com.example.powercosm.models;


//This class will contain the cust id, prod id, and date.

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Item {

    @Id
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @JsonIgnore
//    @OneToOne(mappedBy = "Item", cascade={CascadeType.DETACH,
//            CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
//    private User user;
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }


}
