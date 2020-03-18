import java.util.ArrayList;

public class Rycerz implements RycerzInterface{
    String imie;
    int lvl;
    int pogardaDlaInnych;
    ArrayList<Giermek> obserwatorzy;
    boolean changed = false;
    int lvlZRzedu =0;

    Rycerz(String im, int l, int pogarda){
        obserwatorzy = new ArrayList<Giermek>();
        imie = im;
        lvl = l;
        pogardaDlaInnych = pogarda;
    }

    public void dodajObserwatora(Giermek g){
        obserwatorzy.add(g);
        System.out.println(g.getImie()+" zostal giermkiem rycerza o imieniu "+imie);
    }

    public void usunObserwatora(Giermek g){
        int i = obserwatorzy.indexOf(g);
        if(i>=0) {
            System.out.println(g.getImie()+ " nie bedzie dluzej moim giermkiem!");
            obserwatorzy.remove(i);
        }
    }

    public void powiadomObserwatora(){
        for (Giermek i : obserwatorzy)
            i.aktualizacja(lvl);
    }

    void zdobycie4leveli(){
        lvl+=4;
        lvlZRzedu+=4;
        if(lvlZRzedu>5) {
            changed = true;
            lvlZRzedu-=5; // zalozenie ze jednoczesnie rycerz nie moze wbic wiecej niz 5 leveli
        }
        if(changed) {
            powiadomObserwatora();
            changed = false;
        }
    }

    int getLvl(){
        return lvl;
    }

    String getImie(){
        return imie;
    }
}
