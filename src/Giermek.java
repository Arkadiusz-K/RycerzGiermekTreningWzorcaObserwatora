public class Giermek implements GiermekInterface {
    String imie;
    int lvlGiermka;
    int lvlRycerza;

    Giermek(String im, int lvlG){
        imie = im;
        lvlGiermka = lvlG;
    }

    public void aktualizacja(int lvl) {
        lvlRycerza = lvl;
        podniesLvl();
    }

    // Jesli rycerz zdobedzie 5 lvl to giermek zdobywa 1 lvl
    void podniesLvl(){
        lvlGiermka++;
        System.out.println("-----------------------------------------------------");
        System.out.println("Jesli rycerz jest silniejszy o 5 leveli, to ja o 1!");
        System.out.println("Poziom rycerza: "+lvlRycerza+", a moj ("+imie+") poziom to: "+lvlGiermka);
    }

    String getImie(){
        return imie;
    }
}
