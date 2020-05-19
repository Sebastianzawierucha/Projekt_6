package ZAD_6;

public class Pattern {
    private final long id;
    private final String wzorzec;

    public Pattern(long id, String wzorzec){
        this.id = id;
        this.wzorzec = wzorzec;
    }
    public long getId(){
        return id;
    }
    public String getWzorzec(){
        return wzorzec;
    }
}
