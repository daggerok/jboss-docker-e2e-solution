package daggerok

import com.codeborne.selenide.Selenide
import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.Selenide.sleep
import lombok.SneakyThrows
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.openqa.selenium.By

class SelenideEndToEndKoltinTests {

  @Test
  @SneakyThrows
  @DisplayName("There are should be some selenide blood!")
  fun there_are_should_be_some_selenide_blood() {
    //// no default settings an more!
    //// we are forcing user to setup proper java system properties,
    //// unless he wont test locally using his own browsers....
    //System.setProperty("remote", "http://127.0.0.1:4444/wd/hub");System.setProperty("remote", "http://127.0.0.1:4444/wd/hub")

    Selenide.open("http://127.0.0.1:8080/app/")

    `$`("div")
        .text().contentEquals("Hello, World!")

    `$`("h1")
        .text().contains("ello")

    sleep(5000)
    Selenide.close()
  }
}
