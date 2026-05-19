public class Order {
    private UserService userservice;
    private Payment payment;
    
    public Order(UserService userservice, Payment payment) {
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
