package com.bootcamp.project5.aws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@SpringBootApplication
@RestController
@RequestMapping("/orders")
public class SlProject5CicdApplication {

    @Autowired
    private OrderDAO orderDao;
    @GetMapping
    public List<Order>getOrders(){
        return orderDao.getOrders();
    }
    public static void main(String[] args) {
        SpringApplication.run(SlProject5CicdApplication.class, args);
    }

}
