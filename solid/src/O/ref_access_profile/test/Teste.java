package O.ref_access_profile.test;

import O.ref_access_profile.profile.Profile;
import O.ref_access_profile.profile_validator.ProfileValidator;
import O.ref_access_profile.profile_validator.Validators.ADM;
import O.ref_access_profile.profile_validator.Validators.Support;
import O.ref_access_profile.user.User;

public class Teste {
    public static void main(String[] args) {
        Support support = new Support();
        ADM adm = new ADM();
        User user = new User("Lucas", Profile.SUPPORT);

        support.isValid(user.getProfile());
        adm.isValid(user.getProfile());
    }
}
