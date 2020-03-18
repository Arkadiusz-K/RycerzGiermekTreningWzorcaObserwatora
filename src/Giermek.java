public class Giermek implements GiermekInterface {
    String imie;
    int lvlGiermka;
    int lvlRycerza = 1;
    int wyzszoscRycerza;

    Giermek(String im, int lvlG){
        imie = im;
        lvlGiermka = lvlG;
    }

    public void aktualizacja(int lvl, int pogardaDlaMnie) {
        lvlRycerza = lvl;
        wyzszoscRycerza = pogardaDlaMnie;
        podniesLvl(lvlRycerza);
    }

    void podniesLvl(int lvlRycerza){
        lvlGiermka = lvlRycerza;
        System.out.println("-----------------------------------------------------");
        System.out.println("Jesli rycerz jest silniejszy to ja tez jestem silniejszy! Aktualny lvl giermka: "+lvlGiermka);
        System.out.println("Jego duma to obecnie: "+wyzszoscRycerza);
        System.out.println("Powiedzial "+imie);
    }

    String getImie(){
        return imie;
    }
}
