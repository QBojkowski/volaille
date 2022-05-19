public class Canard extends Volaille {
    static float prixParKilos = 4.2f;
    static float poidAbattage;

    public Canard(float poid, int id) {
        super(poid, id);
        
    }

    public static float getPrixParKilos() {
        return prixParKilos;
    }

    public static void setPrixParKilos(float prixParKilos) {
        Canard.prixParKilos = prixParKilos;
    }

    public static float getPoidAbattage() {
        return poidAbattage;
    }

    public static void setPoidAbattage(float poidAbattage) {
        Canard.poidAbattage = poidAbattage;
    }


    @Override
    public String toString() {
        return affichage(prixParKilos);
    }
}
