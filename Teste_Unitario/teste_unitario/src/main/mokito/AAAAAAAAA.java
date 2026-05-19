public class AAAAAAAAA {
    public static void main(String[] args) {
        Payment payM = new Payment();
        Order order = new Order("lucas",15);
        UserService userS = new UserService();
        OrderService orderService = new UserService(userS,payM);

        orderService.create(order);
    }

}
