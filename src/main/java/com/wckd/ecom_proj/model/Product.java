package com.wckd.ecom_proj.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.math.BigDecimal;
import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "Ecommerce")
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private String brand;
    private String category;
    private BigDecimal price;
    private String releaseDate;
    private boolean available;
    private int quantity;

    private String imageName;
    private String imageType;

    private byte[] imageData;


}
