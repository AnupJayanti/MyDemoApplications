package com.jayanti.demo.vendingmachine.repository;

import com.jayanti.demo.vendingmachine.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {

}
