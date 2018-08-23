package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class NowaZmiana extends TestBase {
    @Test
    public void testNowaZmiana() throws Exception{



        app.logIn1wszaLinia();
        app.screenShot();
        app.getGrupa().Nowy();
        app.screenShot();
        app.getSkrot().ZmianaStandardowa();
        app.screenShot();
        app.getZmiana().SzablonZmianyDRS_FIX_PILNY_Z3();
        app.screenShot();
        app.saveButton();
        app.screenShot();
    }
}

    }
}
