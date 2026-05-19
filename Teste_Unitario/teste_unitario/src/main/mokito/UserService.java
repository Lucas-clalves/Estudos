public class UserService {
    private Order order;

    public boolean isUserMinor(Order order) {
        this.order = order;
        if (order.getIdade() < 18) {
            return true;
        }
        return false;
    }

}
