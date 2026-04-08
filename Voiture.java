package parking;
class Voiture extends Vehicule {
    private int nbPortes;
    public Voiture(String matricule, String marque, int nbPortes) {
        super(matricule, marque);
        this.nbPortes = nbPortes;
    }
    public void stationner() {
        System.out.println(" -> La voiture se gare dans une place standard.");
    }
    public void afficher() {
        super.afficher();
        System.out.print(", Nombre de portes : " + nbPortes);
    }
}

