package bob.projet_android.Model;

/**
 * Created by renando on 19/01/17.
 */

public class Note {
    private String titre, texte;
    private long dateCreation, dateModification;

    public Note(){

    }

    public Note(String titre, String texte, long dateCreation, long dateModification) {
        this.titre = titre;
        this.texte = texte;
        this.dateCreation = dateCreation;
        this.dateModification = dateModification;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public long getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(long dateCreation) {
        this.dateCreation = dateCreation;
    }

    public long getDateModification() {
        return dateModification;
    }

    public void setDateModification(long dateModification) {
        this.dateModification = dateModification;
    }

    @Override
    public String toString() {
        return "Note{" +
                "titre='" + titre + '\'' +
                ", texte='" + texte + '\'' +
                ", dateCreation=" + dateCreation +
                ", dateModification=" + dateModification +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note = (Note) o;

        if (dateCreation != note.dateCreation) return false;
        if (dateModification != note.dateModification) return false;
        if (titre != null ? !titre.equals(note.titre) : note.titre != null) return false;
        return texte != null ? texte.equals(note.texte) : note.texte == null;

    }

    @Override
    public int hashCode() {
        int result = titre != null ? titre.hashCode() : 0;
        result = 31 * result + (texte != null ? texte.hashCode() : 0);
        result = 31 * result + (int) (dateCreation ^ (dateCreation >>> 32));
        result = 31 * result + (int) (dateModification ^ (dateModification >>> 32));
        return result;
    }
}
