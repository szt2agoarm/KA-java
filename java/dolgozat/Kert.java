import java.util.ArrayList;

public class Kert {
    private ArrayList<Noveny> novenyek;
    
    public Kert(ArrayList<Noveny>novenyek){
        this.novenyek = novenyek;
    }

    public void kertAllapota(){
        for (Noveny noveny : novenyek) {
            System.out.println(noveny.nev + "-t meg kell öntözni.");
        }
    }

    public void ontozes (int mennyiseg){
        for (Noveny noveny : novenyek){
            if (noveny.szuksegesViz()) {
                noveny.ontozes(mennyiseg);
            }
        }
        kertAllapota();
    }
    public static void main(String[] args) {
        Noveny tulipan = new Noveny("tulipán", 10);
        Noveny platanFA = new Noveny("platán", 40);
        Noveny kaktusz = new Noveny("kaktusz", 30);

       ArrayList<Noveny> kertinovenyek = new ArrayList<>();
       kertinovenyek.add(tulipan);
       kertinovenyek.add(platanFA);
       kertinovenyek.add(kaktusz);

    }
}
