package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.

@Entity
@Table(name = "table_name")
public class studentEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @NotBlank
    private String name;
    @Email(message = "Email Format is not Valid")
    private String email;

    public studentEntity(String email, long id, String name) {
        this.email = email;
        this.id = id;
        this.name = name;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
