package com.jayanti.demo.vendingmachine.services;

import com.jayanti.demo.vendingmachine.domain.Item;
import com.jayanti.demo.vendingmachine.exceptions.InsufficientQuantity;
import com.jayanti.demo.vendingmachine.exceptions.ItemAlreadyExists;
import com.jayanti.demo.vendingmachine.exceptions.ItemNotFoundException;
import com.jayanti.demo.vendingmachine.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityManager;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class InventoryService {
    @Autowired
    ItemRepository itemRepository;
    @Autowired
    EntityManager em;

    public Item getItem(int itemId){
        Optional<Item> item = itemRepository.findById(itemId);
        if(!item.isPresent())
            throw new ItemNotFoundException("Item not found with ItemId:"+itemId);
        else
            return item.get();
    }

    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }

    public void addQuantity(int itemId, int quantity) {
        Optional<Item> inventory = itemRepository.findById(itemId);

        int currQuantity = 0;
        if (!inventory.isPresent()) {
            throw new ItemNotFoundException("Item not found. Please use add item for adding new item.");
        }

        Item inventoryObj = inventory.get();
        currQuantity = inventoryObj.getQuantity();
        inventoryObj.setQuantity(currQuantity + quantity);
        itemRepository.save(inventoryObj);
    }

    public void  addItem(Item item) {
        Optional<Item> itemOptional = itemRepository.findById(item.getItemId());
        if(itemOptional.isPresent())
        {
            throw new ItemAlreadyExists("Item Already Exists");
        }

        itemRepository.save(item);
    }

    public void  removeItem(int itemId) {
        Optional<Item> itemOptional = itemRepository.findById(itemId);

        if(!itemOptional.isPresent())
        {
            throw new ItemNotFoundException("Item Not Found");
        }

        itemRepository.deleteById(itemId);
    }

    public void  removeQuantity(int itemId, int quantity) {
        int currQuantity = 0;

        Optional<Item> itemOptional = itemRepository.findById(itemId);
        if(!itemOptional.isPresent())
            throw new ItemNotFoundException("Item Not Found");

        Item inventoryObj = itemOptional.get();
        currQuantity = inventoryObj.getQuantity();
        inventoryObj.setQuantity(currQuantity - quantity);
        itemRepository.save(inventoryObj);

        if(currQuantity<quantity)
            throw new InsufficientQuantity("Insufficient Quantity");
    }

}
