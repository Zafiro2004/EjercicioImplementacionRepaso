public class Alumne {
    private String nom;
    private String dni;
    private int edat;

    public Alumne(String nom, String dni, int edat) {
        this.nom = nom;
        this.dni = dni;
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }

    public String getDni() {
        return dni;
    }

    public int getEdat() {
        return edat;
    }
}
