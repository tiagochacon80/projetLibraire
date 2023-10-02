import static java.lang.System.*;

public class Livre {

    private String titre;
    private String auteur;
    private String ISBN;
    private int quantite;
    private int quantiteEmpruntee;

    public Livre(String titre, String auteur, String ISBN, int quantite) {
        this.titre = titre;
        this.auteur = auteur;
        this.ISBN = ISBN;
        this.quantite = quantite;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getQuantite() {
        return quantite;
    }

    public int getQuantiteEmpruntee() {
        return quantiteEmpruntee;
    }

    //Setter pour quantite avec validation
    public void setQuantite(int quantite) {
        if(quantite >= 0) {
            this.quantite = quantite;
        } else {
            throw new IllegalArgumentException("La quantité ne peut pas être négative.");
        }
    }

    public boolean emprunter(int quantiteAEmprunter) {
        if (quantiteAEmprunter <= quantite && quantiteAEmprunter > 0) {
            quantite -= quantiteAEmprunter;  // Subtrai a quantidade a emprestar da quantite disponível
            quantiteEmpruntee += quantiteAEmprunter;  // Adiciona a quantidade a emprestar à quantiteEmpruntee
            return true;
        }
        return false;
    }


    /*public boolean rendre(){
        if(quantiteEmpruntee > 0) {
            quantiteEmpruntee--;
            return true;
        }
        return false;
    }*/

    public String toString(){
        return "Titre: " + titre + "\n" +
               "Auteur: " + auteur + "\n" +
               "ISBN: " + ISBN + "\n" +
               "Quantite empruntée: " + getQuantiteEmpruntee() + "\n" +
               "Quantité restant: " + getQuantite();
    }

}
