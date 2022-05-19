public class Poulet extends Volaille {
    static float prixParKilos = 3.5f;
    static float poidAbattage;



    public Poulet(float poid, int id) {
        super(poid, id);
        
    }

    public static float getPrixParKilos() {
        return prixParKilos;
    }

    public static void setPrixParKilos(float prixParKilos) {
        Poulet.prixParKilos = prixParKilos;
    }

    public static float getPoidAbattage() {
        return poidAbattage;
    }

    public static void setPoidAbattage(float poidAbattage) {
        Poulet.poidAbattage = poidAbattage;
    }

    @Override
    public String toString() {
        return affichage(prixParKilos);
    }

//test modif


    

}
