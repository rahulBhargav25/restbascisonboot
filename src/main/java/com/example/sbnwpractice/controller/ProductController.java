package com.example.sbnwpractice.controller;

import com.example.sbnwpractice.exception.ProductNotFoundException;
import com.example.sbnwpractice.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProductController {
    private static Map<String, Product> productRepo = new HashMap<>();
    static {


        Product honey = new Product();
        honey.setId("1");
        honey.setName("Honey");
        productRepo.put(honey.getId(), honey);

        Product almond = new Product();
        honey.setId("2");
        honey.setName("Almond");
        productRepo.put(almond.getId(), almond);
    }

    @PutMapping(value = "/products/{id}")
    public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody(required = false) Product product) {
        if(!productRepo.containsKey(id)) throw new ProductNotFoundException();
        productRepo.remove(id);
        product.setId(id);
        productRepo.put(id, product);
        return new ResponseEntity<>("Product is updated", HttpStatus.OK);
    }
}
