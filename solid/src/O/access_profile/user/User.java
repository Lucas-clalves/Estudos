package O.access_profile.user;

import O.access_profile.profile.Profile;

public class User {
    private String nome;
    private Profile profile;

        public User(String nome, Profile profile){
            this.nome = nome;
            this.profile = profile;
        }

        public String getNome() {
            return nome;
        }

        public Profile getProfile() {
            return profile;
        }

        

}
