public class App {
    public static void main(String[] args) throws Exception {
        Elevage e = new Elevage();
        for (int i = 0 ; i < 10; i++ ){
            Volaille v = new Poulet(e.alea(0.5f,1.5f), i);
            e.ajouterVolaille(v);
        }
        for (int i = 1 ; i <= 10; i++ ){
            Volaille v = new Canard(e.alea(0.5f,1.5f), i + 10);
            e.ajouterVolaille(v);
        }
        System.out.println(e);
        
    }
}
