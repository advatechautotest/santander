package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class WniosekoUprawnieniaZadanie1doWniosku extends TestBase {
    @Test

    public void testWniosekoUprawneniaZadanie1doWniosku() throws Exception{

        app.logInEndUser();
        app.procesNoweZgloszenie();
        app.screenShot();
        app.getZgloszenie().Tytul();
        app.screenShot();
        app.saveButton();
        app.screenShot();
        app.getAkcja().DodajNotatke();
        app.screenShot();
        app.getZgloszenie().NotatkaTytul();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().DodajZalacznik();
        app.screenShot();
        app.getZgloszenie().ZalacznikTytul();
        app.screenShot();
        app.getZgloszenie().ZalacznikPlik();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().ZalozZgloszenie();
        app.screenShot();
        String url = app.zmianaSSnaWD();
        app.screenShot();
        app.logOut();
        app.screenShot();
        app.logIn1wszaLinia();
        app.screenShot();
        app.wprowadzPobranyUrl(url);
        app.screenShot();
        app.BiezacaGrupa1wszaLinia();
        app.screenShot();
        app.getAkcja().Przejmij();
        app.screenShot();
        app.getAkcja().Edytuj();
        app.screenShot();
        app.getZgloszenie().Opis();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().PrzeksztalcWeWniosekoUprawnienia();
        app.screenShot();
        app.getKolekcja().Wniosek();
        app.screenShot();
        app.Czekaj();
        app.getKolekcja().PierwszyElementKolekcji();
        app.screenShot();
        app.getAkcja().DodajNotatke();
        app.screenShot();
        app.getWniosek().NotatkaTytul();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().DodajZalacznik();
        app.screenShot();
        app.getWniosek().ZalacznikTytul();
        app.screenShot();
        app.getWniosek().ZalacznikPlik();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().ZglosWniosek();
        app.screenShot();
        app.getKolekcja().PobierzNumerWniosku();
        app.screenShot();
        app.logOut();
        app.screenShot();
        app.logInUprawnienia();
        app.screenShot();
        app.getGrupa().Wyszukaj();
        app.screenShot();
        app.getSkrot().Wnioski();
        app.screenShot();
        app.getKolekcja().WstawNumerWniosku();
        app.screenShot();
        app.getKolekcja().PierwszyElementKolekcji();
        app.screenShot();
        app.getAkcja().DodajNotatke();
        app.getWniosek().NotatkaTytul();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().DodajZalacznik();
        app.getWniosek().ZalacznikTytul();
        app.getWniosek().ZalacznikPlik();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().Przejmij();
        app.screenShot();
        app.getAkcja().DodajZadanie();
        app.screenShot();
        app.getZadanie().UzupelnienieZadWniosekoUprawnieniaAKceptacyjne();
        app.screenShot();
        app.saveandcloseButton();
        app.getKolekcja().Zadania();
        //app.getKolekcja().PierwszyElementKolekcji();
        app.screenShot();
        app.getAkcja().DodajNotatke();
        app.getWniosek().NotatkaTytul();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().DodajZalacznik();
        app.screenShot();
       // app.getWniosek().ZalacznikTytul();
        app.getZadanie().ZalacznikWniosekTytul();
        app.screenShot();
        //app.getWniosek().ZalacznikPlik();
        app.getZadanie().ZalacznikWniosekPlik();
        app.screenShot();
        app.saveandcloseButton();
        app.getAkcja().PrzekazDoRealizacji();
        app.screenShot();
        app.getAkcja().PrzypiszDoMnie();
        app.screenShot();
        app.getAkcja().Zatwierdz();
        app.screenShot();
    }
}
