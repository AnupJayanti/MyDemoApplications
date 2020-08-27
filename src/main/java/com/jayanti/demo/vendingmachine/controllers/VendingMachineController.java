package com.jayanti.demo.vendingmachine.controllers;

import com.jayanti.demo.vendingmachine.domain.Item;
import com.jayanti.demo.vendingmachine.exceptions.ItemNotFoundException;
import com.jayanti.demo.vendingmachine.repository.ItemRepository;
import com.jayanti.demo.vendingmachine.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.PositiveOrZero;
import java.util.List;
import java.util.Optional;

@RestController
@Validated
public class VendingMachineController {

    @Autowired
    InventoryService inventoryService;

    @GetMapping("/item/{itemId}")
    public Item getItem(@PathVariable int itemId){
      return inventoryService.getItem(itemId);
    }

    @GetMapping("/items")
    public List<Item> getAllItems(){
        return inventoryService.getAllItems();
    }

    @DeleteMapping("/item/purchase/{itemId}/{quantity}")
    public void purchaseItem(@PathVariable int itemId,@Min(0) @PathVariable int quantity){
        inventoryService.removeQuantity(itemId,quantity);
    }


}
