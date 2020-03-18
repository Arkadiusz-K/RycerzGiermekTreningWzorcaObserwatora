import java.util.ArrayList;

public class Rycerz implements RycerzInterface{
    String imie;
    int lvl;
    int pogardaDlaInnych;
    ArrayList<Giermek> obserwatorzy;

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
        //for(int i=0;i<obserwatorzy.size();i++){
            for(Giermek i : obserwatorzy){
            i.aktualizacja(lvl,pogardaDlaInnych);
        }
    }

    void zdobycieLvl(){
        lvl++;
        pogardaDlaInnych+=3;
        powiadomObserwatora();
    }

    void UstawRycerza(String im, int l, int pogarda){
        imie = im;
        lvl = l;
        pogardaDlaInnych = pogarda;
    }

    int getLvl(){
        return lvl;
    }

    String getImie(){
        return imie;
    }
}
