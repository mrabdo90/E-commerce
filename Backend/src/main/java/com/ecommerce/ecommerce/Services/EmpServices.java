package com.ecommerce.ecommerce.Services;

import com.ecommerce.ecommerce.api.Model.Item;
import com.ecommerce.ecommerce.api.Model.User;
import com.ecommerce.ecommerce.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Optional;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Optional;

@Service
public class EmpServices {

    private List<Item> items; // Assuming this list is populated with some data


    public List<Item> filterItems(@RequestParam String category, @RequestParam double minPrice, @RequestParam double maxPrice) {
        return items.stream()
                .filter(item -> category == null || item.getCategory().equalsIgnoreCase(category))
                .filter(item -> minPrice <= item.getprice())
                .filter(item -> maxPrice >= item.getPrice())
                .collect(Collectors.toList());
    }


    public class Filter {

        private List<Item> items; // Assuming this list is populated with some data


        public List<Item> filterItems(@RequestParam String category, @RequestParam double minPrice, @RequestParam double maxPrice) {
            return items.stream()
                    .filter(item -> category == null || item.getCategory().equalsIgnoreCase(category))
                    .filter(item -> minPrice <= item.getprice())
                    .filter(item -> maxPrice >= item.getPrice())
                    .collect(Collectors.toList());
        }
        
    }

