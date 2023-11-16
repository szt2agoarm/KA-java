public class Noveny {
    protected String nev;
    protected int vizMennyiseg;

    public Noveny(String nev, int vizMennyiseg) {
        this.nev = nev;
        this.vizMennyiseg = vizMennyiseg;
    }
    public boolean szuksegesViz() {
        return this.vizMennyiseg < 5;
    }
    public void ontozes(int mennyiseg){
        
    }
}