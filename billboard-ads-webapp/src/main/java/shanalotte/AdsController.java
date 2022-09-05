package shanalotte;

import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdsController {

  @Value("${uppercase:false}")
  private boolean isCaps;

  @Value("${bold:false}")
  private boolean isBold;

  @Value("${italic:false}")
  private boolean isItalic;

  @GetMapping("/say")
  public String showText() {
    String text = "Buy stuff! Call 440330 now";
    if (isCaps) {
      text = text.toUpperCase(Locale.ROOT);
    }
    if (isBold) {
      text = String.format("<b>%s</b>", text);
    }
    if (isItalic) {
      text = String.format("<i>%s</i>", text);
    }
    return text;
  }
}
