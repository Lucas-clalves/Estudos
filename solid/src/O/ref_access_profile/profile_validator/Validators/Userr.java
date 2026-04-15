package O.ref_access_profile.profile_validator.Validators;

import O.ref_access_profile.profile.Profile;
import O.ref_access_profile.profile_validator.ProfileValidator;

public class Userr implements ProfileValidator {
    @Override
    public boolean isValid(Profile profile){
        if(profile == Profile.USERR){
            System.out.println("Access released: User area.");
            return true;
        }
        System.out.println("Access denied: User area.");
        return false;
    }


}
