package ZAD_5;

import org.springframework.stereotype.Component;

@Component
public class Check {

    public String checksex(String name){
        if (name.charAt(name.length() - 1) == 'a') {
            return "Woman";
        } else {
            return "Man";
        }
    }
}
