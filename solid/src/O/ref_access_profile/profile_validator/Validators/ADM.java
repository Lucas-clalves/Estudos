package O.ref_access_profile.profile_validator.Validators;

import O.ref_access_profile.profile.Profile;
import O.ref_access_profile.profile_validator.ProfileValidator;

public class ADM implements ProfileValidator{
    @Override
    public boolean isValid(Profile profile){
        if(profile == Profile.ADM){
            System.out.println("Access released: ADM area.");
            return true;
        }
        System.out.println("Access denied: ADM area.");
        return false;
    }

}
