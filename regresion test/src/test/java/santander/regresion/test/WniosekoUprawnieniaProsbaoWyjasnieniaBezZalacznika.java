package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class WniosekoUprawnieniaProsbaoWyjasnieniaBezZalacznika extends TestBase {
    @Test

    public void testWniosekoUprawnieniaProsbaoWyjasnieniaBezZalacznika() throws Exception{

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
        app.saveandcloseButton();
        app.getAkcja().DodajZalacznik();
        app.getWniosek().ZalacznikTytul();
        app.getWniosek().ZalacznikPlik();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().Przejmij();
        app.screenShot();
        app.getAkcja().PoprosoWyjasnienia();
        app.getWniosek().PoprosoWyjasnieniaWypelnienie();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        String URL = app.zmianaWDnaSS();
        app.logOut();
        app.logInEndUser();
        app.screenShot();
        app.wprowadzPobranyUrl(URL);
        app.screenShot();
        app.getAkcja().DodajNotatke();
        app.getWniosek().NotatkaEndUserTytul();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().WrocDoRealizacji();
        app.screenShot();


    }
}