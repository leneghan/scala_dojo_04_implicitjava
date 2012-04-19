package dojo;


public class User {
    
    private int id;
    private String name;
    private boolean male;
    private int age;

    public User(int id, String name, boolean male, int age) {
        this.id = id;
        this.name = name;
        this.male = male;
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (id != user.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", male=" + male +
                ", age=" + age +
                '}';
    }
}
