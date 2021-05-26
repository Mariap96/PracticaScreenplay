package co.prueba.hooks;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class SetUpStage {

    @Managed
    private static WebDriver hisBrowser;

    @Before
    public void setUpStage(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(hisBrowser)));
        OnStage.theActorCalled("Pepito");
    }

    @After
    public void closeTheStage(){
        OnStage.drawTheCurtain();
    }
}
