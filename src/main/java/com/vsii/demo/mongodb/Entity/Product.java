package com.vsii.demo.mongodb.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Data
@Document(collection = "DemoMongo")
public class Product {
    @Id
    @Field("_id")
    private String  id;
    private String price;
    private String code;
    private ProductType productType;
}
