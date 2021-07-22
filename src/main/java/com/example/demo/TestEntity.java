package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test3")
public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    @Column(name="ID")
    public Integer id;
    @Column(name="NAME")
    public String name;
    
    // getter and setter
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}