package O.ref_access_profile.user;

import O.ref_access_profile.profile.Profile;

public class User {
    private String nome;
    private Profile profile;

        public User(String nome, Profile profile){
            setNome(nome);
            setProfile(profile);
        }

        public String getNome() {
            return nome;
        }

        public Profile getProfile() {
            return profile;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setProfile(Profile profile) {
            this.profile = profile;
        }

}
