package serenitybdd.test.beginner.step

import net.serenitybdd.core.annotations.findby.By
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Enter
import net.serenitybdd.screenplay.actions.Open
import net.thucydides.core.annotations.Step
import org.openqa.selenium.remote.server.handler.SendKeys
import static net.serenitybdd.screenplay.GivenWhenThen.*



class WorkedStep implements Task{

    @Step("{0} search #element on angularJS page.")
    def <T extends Actor> void performAs(T actor) {
        when(actor).attemptsTo(Enter
                .theValue("Niwes Tipboonchu").into(By.xpath("//*[@ng-model='yourName']")))
    }
	
}
