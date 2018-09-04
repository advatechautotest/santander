package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class ZgloszeniePrzeksztalcenieWeWniosekoUprawnieniaAnuluj extends TestBase {
    @Test

    public void testZgloszenieprzekszralcenieWeWniosekUprawnieniaAnuluj() throws Exception {

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
        app.Czekaj();
        app.getAkcja().Anuluj();
        app.screenShot();
        app.getWniosek().AnulujTytul();
        app.screenShot();
        app.saveandcloseButton();
    }
}
