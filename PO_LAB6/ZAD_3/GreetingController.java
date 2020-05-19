package ZAD_3;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/age") // odpowiada endpoint’om http - zmieniono endpoint na 'age'
    public Age age(@RequestParam(value = "age", defaultValue = "0") int age) {
        return new Age(counter.incrementAndGet(), age);
    }}