package O.access_profile.validator;

import O.access_profile.profile.Profile;

public class Check {
    public boolean isAdm(Profile profile) {
        if (profile == Profile.AMD) {
            System.out.println("Acesso Liberado: Área do Administrador.");
            return true;
        }
        return false;
    }

    public boolean isSuport(Profile profile) {
        if (profile == Profile.SUPORT) {
            System.out.println("Acesso Liberado: Área do Suport.");
            return true;
        }
        return false;
    }

    public boolean isUserr(Profile profile) {
        if (profile == Profile.USERR) {
            System.out.println("Acesso Liberado: Área do User.");
            return true;
        }
        return false;
    }
}
