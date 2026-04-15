package O.ref_access_profile.profile_validator.Validators;

import O.ref_access_profile.profile.Profile;
import O.ref_access_profile.profile_validator.ProfileValidator;

public class Support implements ProfileValidator {
    @Override
    public boolean isValid(Profile profile){
        if(profile == Profile.SUPPORT){
            System.out.println("Access released: Support area.");
            return true;
        }
        System.out.println("Access denied: Support area.");
        return false;
    }

}
