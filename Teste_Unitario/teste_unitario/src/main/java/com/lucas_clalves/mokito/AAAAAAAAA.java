package com.lucas_clalves.mokito;

public class AAAAAAAAA {
    public static void main(String[] args) {
        Payment payM = new Payment();
        Order order = new Order("lucas",20);
        UserService userS = new UserService();
        OrderService orderService = new OrderService(userS, payM);

        orderService.create(order);

    }

}
