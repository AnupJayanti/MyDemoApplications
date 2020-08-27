package com.jayanti.demo.vendingmachine.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;

@Entity
@Data
public class Item {
    @GeneratedValue
    @Id
    Integer itemId;
    @NotEmpty
    String itemName;
    @PositiveOrZero
    Integer price;
    @PositiveOrZero
    Integer quantity;
}
