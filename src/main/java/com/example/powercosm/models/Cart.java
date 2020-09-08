package com.example.powercosm.models;

import javax.persistence.*;
import java.util.List;


//include cust id, item id, date
@Entity
@Table(name = "cart")
public class Cart {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToMany(fetch = FetchType.LAZY,
//            cascade = {CascadeType.DETACH,
//                    CascadeType.MERGE, CascadeType.REFRESH})
//    @JoinTable(name = "user_item",
//            joinColumns = {@JoinColumn(name = "user_id")},
//            inverseJoinColumns = @JoinColumn(name = "item_id"))
//    private List<Item> item;
//
//    public List<Item> getItem(){ return item; }
//
//    public void setUsers(List<Item> item) { this.item = item; }

}
