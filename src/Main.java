public class Main {
    public static void main(String[] args){
        Rycerz jurandZeSpychowa = new Rycerz("Jurand",90, 5);
        Giermek gienek = new Giermek("Gienek", jurandZeSpychowa.getLvl());
        Giermek gabriel = new Giermek("Gabriel", jurandZeSpychowa.getLvl());
        Giermek gerwazy = new Giermek("Gerwazy", jurandZeSpychowa.getLvl());

        jurandZeSpychowa.dodajObserwatora(gienek);
        jurandZeSpychowa.dodajObserwatora(gabriel);
        System.out.println("Przepraszam "+gerwazy.getImie()+", mam juz wystarczajaco giermkow, padz pozdrowiony!");

        int lvlPrzeciwnika = (int)(Math.random()*100);
        System.out.println("lvl przeciwnika: "+lvlPrzeciwnika);
        if(jurandZeSpychowa.getLvl()>=lvlPrzeciwnika){
            System.out.println("Rycerz "+jurandZeSpychowa.getImie()+" zdobyl lvl i mowi o tym giermkom!");
            jurandZeSpychowa.zdobycie4leveli();
        } else
            System.out.println("Rycerz przegral :( ");

        jurandZeSpychowa.usunObserwatora(gabriel);

        lvlPrzeciwnika = (int)(Math.random()*100);
        System.out.println("lvl przeciwnika: "+lvlPrzeciwnika);
        if(jurandZeSpychowa.getLvl()>=lvlPrzeciwnika){
            System.out.println("Rycerz "+jurandZeSpychowa.getImie()+" zdobyl lvl i mowi o tym giermkom!");
            jurandZeSpychowa.zdobycie4leveli();
        } else
            System.out.println("Rycerz przegral :( ");
    }
}
