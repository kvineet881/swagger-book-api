package com.example.springswaager.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
@ToString
@NoArgsConstructor
public class Book implements Serializable {
    @Id
    @GeneratedValue
    @ApiModelProperty(value = "Auto generated Id")
    private int bookId;
    @ApiModelProperty("This is book name")
    private String bookName;
    @ApiModelProperty("This is book price")
    private double price;
}
