package ZAD_5;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class GreetingController{        //http://localhost:8080/check?name=Ola
    private final AtomicLong counter = new AtomicLong();
    private Check check;
    @Autowired
    public GreetingController (Check check){
        this.check = check;
    }
    @RequestMapping(value = "/check")
    public Sex sex(@RequestParam(value = "name", defaultValue = "World")String name){
        return new Sex(counter.incrementAndGet(), check.checksex(name));
    }
}
