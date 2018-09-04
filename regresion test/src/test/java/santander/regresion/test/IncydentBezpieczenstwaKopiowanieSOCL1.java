package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class IncydentBezpieczenstwaKopiowanieSOCL1 extends TestBase {
    @Test

    public void testIncydentBezpieczenstwaKopiowanieSOCL1() throws Exception{

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
        app.logInSOC_L1();
        app.wprowadzPobranyUrl(url);
        app.screenShot();
        app.BiezacaGrupaSOC_L1();
        app.screenShot();
        app.getAkcja().Przejmij();
        app.screenShot();
        app.getAkcja().SkopiujProces();
        app.screenShot();
        app.getIncydent().SkopiujProcesListaProcesow();
        app.getIncydent().SkopiujProcesListaProcesowWniosekoUprawnienia();
        app.screenShot();
        app.getIncydent().SkopiujProcesSzablonIncydent();
        app.getIncydent().SkopiujProcesSzablonIncydentuUzupelnij();
        app.screenShot();
        app.getIncydent().SkopiujProcesPrzyczyna();
        app.getIncydent().SkopiujProcesPrzyczynaInne();
        app.screenShot();
        app.getIncydent().SkopiujProcesUzasadnienie();
        app.screenShot();
        app.getIncydent().SkopiujProcesZamknacAutomatycznie();
        app.getIncydent().SkopiujProcesZamknacAutomatycznieFalsz();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().SkopiujProces();
        app.screenShot();
        app.getIncydent().SkopiujProcesListaProcesow();
        app.getIncydent().SkopiujProcesListaProcesowWniosek();
        app.screenShot();
        app.getIncydent().SkopiujProcesPrzyczyna();
        app.getIncydent().SkopiujProcesPrzyczynaInne();
        app.screenShot();
        app.getIncydent().SkopiujProcesUzasadnienie();
        app.screenShot();
        app.getIncydent().SkopiujProcesZamknacAutomatycznie();
        app.getIncydent().SkopiujProcesZamknacAutomatycznieFalsz();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().SkopiujProces();
        app.screenShot();
        app.getIncydent().SkopiujProcesListaProcesow();
        app.screenShot();
        app.getIncydent().SkopiujProcesListaProcesowIncydentBezpieczenstwa();
        app.screenShot();
        app.getIncydent().SkopiujProcesPrzyczyna();
        app.screenShot();
        app.getIncydent().SkopiujProcesPrzyczynaInne();
        app.screenShot();
        app.getIncydent().SkopiujProcesUzasadnienie();
        app.screenShot();
        app.getIncydent().SkopiujProcesZamknacAutomatycznie();
        app.screenShot();
        app.getIncydent().SkopiujProcesZamknacAutomatycznieFalsz();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().SkopiujProces();
        app.screenShot();
        app.getIncydent().SkopiujProcesListaProcesow();
        app.screenShot();
        app.getIncydent().SkopiujProcesListaProcesowIncydent();
        app.screenShot();
        app.getIncydent().SkopiujProcesPrzyczyna();
        app.screenShot();
        app.getIncydent().SkopiujProcesPrzyczynaInne();
        app.screenShot();
        app.getIncydent().SkopiujProcesUzasadnienie();
        app.screenShot();
        app.getIncydent().SkopiujProcesZamknacAutomatycznie();
        app.screenShot();
        app.getIncydent().SkopiujProcesZamknacAutomatyczniePrawda();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
    }
}
