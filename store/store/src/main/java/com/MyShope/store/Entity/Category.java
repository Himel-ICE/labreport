package com.MyShope.store.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="category")
public class Category
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer Id;
    public String Name;
    public String Despriction;
}
