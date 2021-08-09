package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fifa")
public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    @Column(name="ID")
    public Integer id;
    @Column(name="RANK")
    public Integer rank;
    @Column(name="NAME")
    public String name;
    
    // getter and setter
    //ID
    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
    //Rank
    public Integer getRank() {
    	return this.rank;
    }
    public void setRank(Integer rank) {
    	this.rank = rank;
    }
    
    //Name
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}