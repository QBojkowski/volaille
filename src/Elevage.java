import java.util.ArrayList;

public class Elevage {
    protected ArrayList<Volaille> listeVolailles;

    public Elevage() {
        this.listeVolailles =new ArrayList<Volaille>() ;
    }

    public void trier() {
        for (Volaille v : listeVolailles) {
            if (v instanceof Poulet && Poulet.getPoidAbattage() <= v.poid)
                v.abbatre=true;
            else if (v instanceof Canard && Canard.getPoidAbattage() <= v.poid)
                v.abbatre=true;
        }
        this.vendre();
    }

    public void vendre(){
        for (Volaille v : listeVolailles) {
            if(v.abbatre){
                listeVolailles.remove(v);
            }
        }
    }

    public void ajouterVolaille(Volaille v){
        this.listeVolailles.add(v);
    }

    public float alea(float i, float j) {
        return (float)((j-i)*Math.random() + i);
    }

    @Override
    public String toString() {
        return "Elevage [listeVolailles=" + listeVolailles + "]";
    }

    

    
}
