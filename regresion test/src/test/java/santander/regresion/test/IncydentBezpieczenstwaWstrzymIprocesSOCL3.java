package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class IncydentBezpieczenstwaWstrzymIprocesSOCL3 extends TestBase {
    @Test

    public void testIncydentBezpieczenstwaWstrzymIprocesSOCL3() throws Exception{
//commit1
        app.logInEndUser();
        app.screenShot();
        app.procesNowyIncydentBezpieczenstwa();
        app.screenShot();
        app.getZgloszenie().Tytul();
        app.screenShot();
        app.saveButton();
        app.screenShot();
        app.getAkcja().ZglosIncydent();
        String url = app.zmianaSSnaWD();
        app.logOut();
        app.logInSOC_L3();
        app.wprowadzPobranyUrl(url);
        app.screenShot();
        app.BiezacaGrupaSOC_L3();
        app.screenShot();
        app.getAkcja().Przejmij();
        app.screenShot();
        app.getAkcja().Edytuj();
        app.screenShot();
        app.getIncydent().Opis();
        app.screenShot();
        app.saveandcloseButton();
        app.getAkcja().ZeStronaTrzecia();
        app.screenShot();
        app.getIncydent().ZfirmaTrzeciaZapytanie();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().DodajNotatke();
        app.screenShot();
        app.getIncydent().NotatkaTytul();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().DodajZalacznik();
        app.screenShot();
        app.getIncydent().ZalacznikTytul();
        app.getIncydent().ZalacznikPlik();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().ZpowrotemOdInnejFirmy();
        app.screenShot();
        app.getIncydent().ZfirmaTrzeciaOdpowiedz();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().Rozwiaz();
        app.screenShot();
        app.getIncydent().RozwiazanieTemat();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.logOut();
        app.screenShot();
    }
}
