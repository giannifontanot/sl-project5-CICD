package com.bootcamp.project5.aws;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



@Repository
public class OrderDAO {
    public List<Order> getOrders() {

        return Stream.of(
                new Order(101,"Monitor", 3, 250),
                new Order(102, "Mouse", 1, 20),
                new Order( 103, "Keyboard",1, 150 ),
                new Order(  104, "Computer", 1, 1200),
                new Order(  105 , "HDMI cable", 3, 25 ),
                new Order(  106 , "Microcontroller", 1, 125 )
                new Order(  107 , "Computer case", 1, 180 )
        ).collect(Collectors.toList());
    }
}
