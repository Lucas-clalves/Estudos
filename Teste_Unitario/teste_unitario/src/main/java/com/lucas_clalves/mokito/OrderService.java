package com.lucas_clalves.mokito;

public class OrderService {
    private UserService userservice;
    private Payment payment;
    
    public OrderService(UserService userservice, Payment payment) {
        this.userservice = userservice;
        this.payment = payment;
    }

    public void create(Order order){
        boolean isUserMinor = userservice.isUserMinor(order);
        if (isUserMinor) {
            throw new IllegalStateException("Usuario não pode ser menor de idade");
        }

        payment.pay();

    }

    
}
