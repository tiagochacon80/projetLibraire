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
        setQuantite(quantite);
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
        if (quantite < 0) {
            System.out.println("La quantité n'est peux pas etre moins que 0.");
        } else {
            this.quantite = quantite;
        }
    }

    public boolean emprunter(int quantiteAEmprunter) {
        if (quantiteAEmprunter <= 0) {
            System.out.println("La quantité à emprunter doit être positive.");
            return false;
        }
        if (quantiteAEmprunter > quantite) {
            System.out.println("Il n'y a pas assez de livres disponibles pour emprunter cette quantité.");
            return false;
        }
        quantite -= quantiteAEmprunter;  // Subtrai a quantidade a emprestar da quantite disponível
        quantiteEmpruntee += quantiteAEmprunter;  // Adiciona a quantidade a emprestar à quantiteEmpruntee
        return true;
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
