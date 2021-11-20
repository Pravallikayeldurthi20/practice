package predicate;

import org.openqa.selenium.WebElement;

import java.util.function.Predicate;

public class Conditions {
    Predicate<WebElement> CONTAINS_G= s->s.getText().contains("g")||s.getText().contains("G");
    Predicate<WebElement> STARTS_WITH_I= s->s.getText().startsWith("i")||s.getText().startsWith("I");
    Predicate<WebElement> NO_TEXT= s->s.getText().isBlank();
}
