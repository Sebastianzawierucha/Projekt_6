package ZAD_2;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private static final String template2 = "Bye, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/bye") // odpowiada endpoint’om http
    public Bye bye(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Bye(counter.incrementAndGet(), String.format(template2, name));
    }
    @RequestMapping("/greeting") // odpowiada endpoint’om http
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
