package O.access_profile.teste;

import O.access_profile.profile.Profile;
import O.access_profile.user.User;
import O.access_profile.validator.Check;

public class Main {
    public static void main(String[] args) {
        Check check = new Check();

        User user = new User("Lucas",Profile.AMD);

        System.out.println(user.getNome());
        System.out.println(user.getProfile());

        check.isAdm(user.getProfile());
        check.isUserr(user.getProfile());

    }

}
