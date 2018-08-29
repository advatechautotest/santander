package santander.regresion.menadzerAplikacji;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Akcja {

    private FirefoxDriver driver;

    public Akcja(FirefoxDriver driver) {
        this.driver = driver;
    }

    public void ZalozZgloszenie() { driver.findElement(By.xpath("//li[contains(text(), 'Załóż zgłoszenie')]")).click(); }
    public void DodajZalacznik() {
        driver.findElement(By.xpath("//li[contains(text(), 'Dodaj załącznik')]")).click();
    }
    public void DodajNotatke() {
        driver.findElement(By.xpath("//li[contains(text(), 'Dodaj notatkę')]")).click();
        //driver.findElement(By.xpath(".//*[@id='actionPanel']/div[2]/ul/li[4]")).click();
    }
    public void Zamknij() {
        driver.findElement(By.xpath("//li[contains(text(), 'Zamknij')]")).click();
    }
    public void Edytuj() {
        driver.findElement(By.xpath("//li[contains(text(), 'Edytuj')]")).click();
    }
    public void Przejmij() {
        driver.findElement(By.xpath("//li[contains(text(), 'Przejmij')]")).click();
    }
    public void Przyjmij() {
        driver.findElement(By.xpath("//li[contains(text(), 'Przyjmij')]")).click();
    }
    public void PrzeksztalcwIncydentBezpieczenstwa() { driver.findElement(By.xpath("//li[contains(text(), 'Przekształć w incydent bezpieczeństwa')]")).click(); }
    public void PrzeksztalcWeWniosekoUprawnienia() { driver.findElement(By.xpath("//li[contains(text(), 'Przekształć we wniosek o uprawnienia')]")).click(); }
    public void PrzeksztalcWeWniosek() { driver.findElement(By.xpath("//li[contains(text(), 'Przekształć we wniosek')]")).click(); }
    public void PrzeksztalcwIncydent() { driver.findElement(By.xpath("//li[contains(text(), 'Przekształć w incydent')]")).click(); }
    public void ZglosIncydent() {
        driver.findElement(By.xpath("//li[contains(text(), 'Zgłoś incydent')]")).click();
    }
    public void SkopiujProces() {
        driver.findElement(By.xpath("//li[contains(text(), 'Skopiuj proces')]")).click();
    }
    public void ZglosWniosek() {
        driver.findElement(By.xpath("//li[contains(text(), 'Zgłoś wniosek')]")).click();
    }
    public void Anuluj(){
        driver.findElement(By.xpath("//li[contains(text(), 'Anuluj')]")).click();
    }
    public void BrakAkceptacji() {
        driver.findElement(By.xpath("//li[contains(text(), 'Brak akceptacji')]")).click();
    }
    public void DodajZadanie() {
        driver.findElement(By.xpath("//li[contains(text(), 'Dodaj zadanie')]")).click();
    }
    public void Rozwiaz(){
        driver.findElement(By.xpath("//li[contains(text(), 'Rozwiąż')]")).click();
    }
    public void ZarejstrujCzasPracy(){ driver.findElement(By.xpath("//li[contains(text(), 'Zarejestruj czas pracy')]")).click(); }
    public void DodajPowiazanyCI(){ driver.findElement(By.xpath("//li[contains(text(), 'Dodaj powiązany CI')]")).click(); }
    public void PoprosoWyjasnienia(){ driver.findElement(By.xpath("//li[contains(text(), 'Poproś o wyjaśnienia')]")).click(); }
    public void PrzekazDoRealizacji(){ driver.findElement(By.xpath("//li[contains(text(), 'Przekaż do realizacji')]")).click(); }
    public void WrocDoRealizacji(){ driver.findElement(By.xpath("//li[contains(text(), 'Wróć do realizacji')]")).click(); }
    public void PrzypiszDoMnie(){
        driver.findElement(By.xpath("//li[contains(text(), 'Przypisz do mnie')]")).click();
    }
    public void Zatwierdz(){
        driver.findElement(By.xpath("//li[contains(text(), 'Zatwierdź')]")).click();
    }
    public void Akceptacja(){
        driver.findElement(By.xpath("//li[contains(text(), 'Akceptacja')]")).click();
    }
    public void DoWeryfikacji(){
        driver.findElement(By.xpath("//li[contains(text(), 'Do weryfikacji')]")).click();
    }
    public void Dziala(){
        driver.findElement(By.xpath("//li[contains(text(), 'Działa')]")).click();
    }
    public void NieDziala(){
        driver.findElement(By.xpath("//li[contains(text(), 'Nie działa')]")).click();
    }
    public void Odrzuc(){ driver.findElement(By.xpath("//li[contains(text(), 'Odrzuć')]")).click(); }
    public void UtworzZmianeZincydentu(){ driver.findElement(By.xpath("//li[contains(text(), 'Utwórz zmianę z incydentu')]")).click(); }
    public void ZmianaPrzygotowana(){ driver.findElement(By.xpath("//li[contains(text(), 'Zmiana przygotowana')]")).click(); }

    public void AnulujZmiane(){ driver.findElement(By.xpath("//li[contains(text(), 'Anuluj zmianę')]")).click(); }
    public void DodecyzjiCAB(){ driver.findElement(By.xpath("//li[contains(text(), 'Do decyzji CAB')]")).click(); }
    public void DodajCzlonkaCAB(){ driver.findElement(By.xpath("//li[contains(text(), 'Dodaj członka CAB')]")).click(); }
    public void ZmianaPowiodlaSie(){ driver.findElement(By.xpath("//li[contains(text(), 'Zmiana powiodła się')]")).click(); }

    public void ZwrocDoModyfikacji(){ driver.findElement(By.xpath("//li[contains(text(), 'Zwróć do modyfikacji')]")).click(); }
    public void DoPonownejAkceptacji(){ driver.findElement(By.xpath("//li[contains(text(), 'Do ponownej akceptacji')]")).click(); }
    public void ZmianaNiePowiodlaSie(){ driver.findElement(By.xpath("//li[contains(text(), 'Zmiana nie powiodła się')]")).click(); }
    public void ZamknijZmiane(){ driver.findElement(By.xpath("//li[contains(text(), 'Zamknij zmianę')]")).click(); }
    public void OdrzucZadanie(){ driver.findElement(By.xpath("//li[contains(text(), 'Odrzuć zadanie')]")).click(); }
    public void DoRealizacji(){ driver.findElement(By.xpath("//li[contains(text(), 'Do realizacji')]")).click(); }
    public void PrzekazDoManageraZmian(){ driver.findElement(By.xpath("//li[contains(text(), 'Przekaż do Managera zmian')]")).click(); }
    public void WyslijDoCzlonkowCAB(){ driver.findElement(By.xpath("//li[contains(text(), 'Wyślij do członków CAB')]")).click(); }
    public void DoWdrozenia(){ driver.findElement(By.xpath("//li[contains(text(), 'Do wdrożenia')]")).click(); }
    public void DodajSzczegolZmiany(){ driver.findElement(By.xpath("//li[contains(text(), 'Dodaj szczegół zmiany')]")).click(); }


}
