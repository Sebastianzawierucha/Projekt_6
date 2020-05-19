package ZAD_4;

public class NameAge {
    private final long id;
    private final int age;
    private final String name;

    public NameAge(long id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}

