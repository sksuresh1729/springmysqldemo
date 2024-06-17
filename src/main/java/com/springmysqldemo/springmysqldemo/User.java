package com.springmysqldemo.springmysqldemo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "user1")
public class User {
    @Id
    @Column(name = "id")
    private int id;

    @Id
    @Column(name = "name")
    private String name;

    @Id
    @Column(name = "email")
    private String email;
}
