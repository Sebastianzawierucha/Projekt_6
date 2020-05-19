package ZAD_4;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class GreetingController{        //http://localhost:8080/nameage?age=21&name=Ola
    private final AtomicLong counter = new AtomicLong();
    @RequestMapping("/nameage")
    public NameAge nameAge(@RequestParam(value = "age", defaultValue = "0")int age,
                           @RequestParam(value = "name", defaultValue = "World")String name){
        return new NameAge(counter.incrementAndGet(), age, name);
    }
}
