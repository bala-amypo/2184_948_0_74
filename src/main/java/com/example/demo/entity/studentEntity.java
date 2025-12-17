package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "table_name")
public class studentEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message="Name is not valid")
    private String name;
    @Email(message = "Email Format is not Valid")
    private String email;

    public studentEntity(){

    }

    public studentEntity(String email, Long id, String name) {
        this.email = email;
        this.id = id;
        this.name = name;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
