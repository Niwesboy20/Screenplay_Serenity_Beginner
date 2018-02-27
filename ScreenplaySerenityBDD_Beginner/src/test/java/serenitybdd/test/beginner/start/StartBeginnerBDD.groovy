package serenitybdd.test.beginner.start

import net.serenitybdd.junit.runners.SerenityRunner
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.abilities.BrowseTheWeb
import net.serenitybdd.screenplay.actions.Open
import net.serenitybdd.screenplay.questions.page.TheWebPage
import net.thucydides.core.annotations.Managed
import net.thucydides.core.annotations.Steps
import org.junit.Test
import org.junit.runner.RunWith
import org.openqa.selenium.WebDriver
import serenitybdd.test.beginner.step.WorkedStep
import serenitybdd.test.beginner.ui.AngularJSIndexPage

import static net.serenitybdd.screenplay.GivenWhenThen.*
import static org.hamcrest.Matchers.containsString



@RunWith(SerenityRunner.class)
class StartBeginnerBDD {


    @Managed(driver = "chrome")
    WebDriver browser

    AngularJSIndexPage angularJSIndexPage


    @Test
    void shouldBeAbleToView(){

        Actor boy = Actor.named("boy")
        boy.can(BrowseTheWeb.with(browser))

        System.setProperty("webdriver.chrome.driver", "E:\\Projects-TestTools\\Test-Selenium\\Selenium_Summit_23-1-2561\\TestSummitSelenium\\BrowserDriver\\chromedriver.exe")

        givenThat(boy).attemptsTo(Open.browserOn(angularJSIndexPage))

        mark.performAs(boy)

        then(boy).should(seeThat(TheWebPage.title() , containsString("AngularJS — Superheroic JavaScript MVW Framework")))

    }


}
