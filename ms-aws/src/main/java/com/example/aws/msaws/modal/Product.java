package com.example.aws.msaws.modal;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@Data
public class Product {

    @Id
    private Long id;
    private String name;
    private String imagePath;
    private String imageFileName;
}
