package ru.shanalotte;

import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxiController {

  @Value("${uppercase:false}")
  private boolean isCaps;

  @Value("${bold:false}")
  private boolean isBold;

  @Value("${italic:false}")
  private boolean isItalic;

  @Value("${heroku:false}")
  private boolean isHeroku;

  @Autowired
  private Environment environment;

  @GetMapping("/say")
  public String showText() {
    String text = "777030 Taxi Call now!";
    if (isCaps) {
      text = text.toUpperCase(Locale.ROOT);
    }
    if (isBold) {
      text = String.format("<b>%s</b>", text);
    }
    if (isItalic) {
      text = String.format("<i>%s</i>", text);
    }
    if (isHeroku) {
      text = "[Hi, heroku!] " + text;
    }
    return text;
  }
}
