package ZAD_6;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class GreetingController {
    private final AtomicLong counter = new AtomicLong();
    private CheckPattern checkPattern;
    @Autowired
    public GreetingController (CheckPattern checkPattern){
        this.checkPattern = checkPattern;
    }
    @RequestMapping(value = "/pattern")
    public Pattern pattern(@RequestParam(value = "wzorzec", defaultValue = "Wzorzec")String wzorzec){
        return new Pattern (counter.incrementAndGet(), checkPattern.check(wzorzec));
    }
}


