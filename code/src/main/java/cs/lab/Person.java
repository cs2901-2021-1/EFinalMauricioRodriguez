package cs.lab;

public class Person {
    private int age;
    private int appliedDosis = 0;
    private int id;

    public Person(int id, int age) {
        this.age = age;
        this.appliedDosis = 1;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAppliedDosis() {
        return appliedDosis;
    }

    public void setAppliedDosis() {
        if (appliedDosis <2){
            appliedDosis++;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
