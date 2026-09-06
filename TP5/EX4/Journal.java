package formationjavaTP5;

public class Journal extends Document {

    private String dateParution;
    private int numero;

    public Journal(String titre, String auteur, String dateParution, int numero) {
        super(titre, auteur);
        this.dateParution = dateParution;
        this.numero = numero;
    }

    public String getDateParution() {
        return dateParution;
    }

    public void setDateParution(String dateParution) {
        this.dateParution = dateParution;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String toString() {
        return super.toString() + " {Journal, date=" + dateParution + ", numero=" + numero + "}";
    }

}