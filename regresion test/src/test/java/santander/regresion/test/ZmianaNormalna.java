package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class ZmianaNormalna extends TestBase {
    @Test
    public void testZmianaNormalna() throws Exception{

        app.logInAdminAplikacji();
        app.screenShot();
        app.getGrupa().Nowy();
        app.screenShot();
        app.getSkrot().ZmianaNormalna();
        app.screenShot();
        app.getZmiana().ZmianaNormalnaUzupelnij();
        app.screenShot();
    }
}
