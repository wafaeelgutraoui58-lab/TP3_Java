package parking;
public class TestParking {

    public static void main(String[] args) {

        Vehicule[] v = new Vehicule[4];

        v[0] = new Voiture("AA123", "Dacia", 4);
        v[1] = new Voiture("BB456", "Mercedes", 4);
        v[2] = new Moto("CC789", "Yamaha", true);
        v[3] = new Camion("DD000", "Volvo", 15.5);

        System.out.println("=== Tous les véhicules ===");
        for (int i = 0; i < v.length; i++) {
            v[i].afficher();
            v[i].stationner();
            System.out.println("------------------");
        }

        System.out.println("=== Voitures uniquement ===");
        for (int i = 0; i < v.length; i++) {
            if (v[i] instanceof Voiture) {
                v[i].afficher();
            }
        }

        Vehicule x = new Moto("11C22", "Yamaha", true);


        if (x instanceof Voiture) {
            Voiture v1 = (Voiture) x;
            System.out.println("Downcasting réussi !");
        } else {
            System.out.println("Downcasting impossible !");
        }
    }
}