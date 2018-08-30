package daggerok;

import com.codeborne.selenide.Selenide;
import lombok.SneakyThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

@DisplayName("Selenide java e2e tests running with selenium hub in docker")
class SelenideEndToEndJavaTests {

  @Test
  @SneakyThrows
  @DisplayName("There are should be some selenide blood!")
  void there_are_should_be_some_selenide_blood() {
    //// there are no any default settings anymore!
    //// we will force user setup proper java system properties,
    //// unless he wont test locally using his own browsers....
    //System.setProperty("remote", "http://127.0.0.1:4444/wd/hub");

    Selenide.open("http://google.com");

    $(By.name("q")).setValue("Selenide uses selenium Hub in Docker")
                   .pressEnter();

    sleep(5000);
    Selenide.close();
  }
}
