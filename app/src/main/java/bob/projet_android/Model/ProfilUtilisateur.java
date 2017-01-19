package bob.projet_android.Model;

import com.google.firebase.auth.FirebaseUser;

/**
 * Created by renando on 19/01/17.
 */


public class ProfilUtilisateur {
    private String displayName, email;

    public ProfilUtilisateur(FirebaseUser user) {
        this.displayName = user.getDisplayName();
        this.email = user.getEmail();
    }

    public ProfilUtilisateur() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return "ProfilUtilisateur{" +
                "displayName='" + displayName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

