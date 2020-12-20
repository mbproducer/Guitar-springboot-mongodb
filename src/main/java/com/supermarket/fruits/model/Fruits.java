package com.supermarket.fruits.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document
public class Fruits {

    @Id
    private String idFruits;

    private String nameFruits;

    private String colorFuits;
}
