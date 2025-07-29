package com.MyShope.store.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="items")
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer ProductId;

    public String name;
    public Double price;

    @ManyToOne
    @JoinColumn(name = "Id") // FK column
    public Category category;

}
