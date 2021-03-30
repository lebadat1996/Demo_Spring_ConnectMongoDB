package com.vsii.demo.mongodb.Entity;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document(collation = "Product_Type")
public class ProductType {
    @Indexed(unique = true)
    private Integer id;
    @Field
    private String typeProduct;
}
