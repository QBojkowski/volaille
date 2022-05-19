public class Volaille {

    protected float poid;
    protected int id;
    protected boolean abbatre = false;


    public Volaille(float poid, int id) {
        this.poid = poid;
        this.id = id;
    }

    public void abbatre() {
        this.abbatre = true;
    }

    public float calculPrix(float prixParKilos) {
        float prix = prixParKilos * this.poid;
        return prix;
    }

    @Override
    public String toString() {
        return "\n[" + this.getClass() + " id=" + id + ", poid=" + poid + ",";
    }

    public String affichage(float ppk){
        return  " prix ="+ this.calculPrix(ppk) + "]";
    }
//test modif
}

