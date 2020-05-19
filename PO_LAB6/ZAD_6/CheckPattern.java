package ZAD_6;

import org.springframework.stereotype.Component;

@Component
public class CheckPattern {
    private static final String template = "wzorzec";
    public String check(String wzorzec){
        if(wzorzec.contains(template)){
            return "Zawiera wzorzec";
        }
        else{
            return "Nie zawiera wzorca";
        }
    }
}




