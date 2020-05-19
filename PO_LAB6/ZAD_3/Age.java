package ZAD_3;

public class Age {
    private final long id;
    private final int age;

    public Age(long id, int age) {
        this.id = id;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
}